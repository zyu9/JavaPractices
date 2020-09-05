import java.io.*;
import java.net.*;
import java.util.*; 
/**
 * Write a description of class VerySimpleChatServer here.
 *
 * @author (zyu9)
 * @version (9/5/2020)
 */
public class VerySimpleChatServer
{
   ArrayList clientOutputStreams;
   
   public class ClientBandler implements Runnable{
       BufferedReader reader;
       Socket sock; 
       
       public ClientBandler(Socket clientSocket){
           try{
               sock = clientSocket;
               InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
               reader = new BufferedReader(isReader);
           }catch(Exception ex){ex.printStackTrace();}
       }
       
       public void run(){
           String message;
           try{
               while((message = reader.readLine()) != null){
                   System.out.println("read " + message);
                   tellEveryone(message);
               }
           }catch(Exception ex){ex.printStackTrace();}
       }
   }
   
   public static void main(String[] args){
       new VerySimpleChatServer().go();
   }
   
   public void go(){
       clientOutputStreams = new ArrayList();
       try{
           ServerSocket serverSock = new ServerSocket(5000);
           
           while(true){
               Socket clientSocket = serverSock.accept();
               PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
               clientOutputStreams.add(writer);
               
               Thread t = new Thread(new ClientBandler(clientSocket));
               t.start();
               System.out.println("got a connection");
           }
       }catch(Exception ex){
           ex.printStackTrace(); 
       }
   }
   
   public void tellEveryone(String message){
       Iterator it = clientOutputStreams.iterator();
       while(it.hasNext()){
           try{
               PrintWriter writer = (PrintWriter) it.next();
               writer.println(message);
               writer.flush();
           }catch(Exception ex){
               ex.printStackTrace();
           }
       }
   }
}
