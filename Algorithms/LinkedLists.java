//A templated Java singly linked list
public class ListElement<T>{
    public ListElement(T value) {data = value; }

    public ListElement<T> next() {return next; }
    public T value() {return data; }
    public void setNext(ListElement<T> elem) {next = elem; }
    public void setValue(T value) {data = value; }

    private ListElement<T> next;
    private T              data;
}

//Find the Length of a linked list  [iterative solution]
//(To count number of the nodes in a linked list)
/* Linked List Node */
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null;}
}
//Linked List class
class LinkedList
{
    Node head; //head of list
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
           Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4.Move the head to point to new Node */
        head = new_node;
    }

    /* Returns count of nodes in linked list */
    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args)
    {
        /* Start with the empty list */
        LinkedList l = new LinkedList();
        l.push(1);
        l.push(3);
        l.push(1);
        l.push(2);
        l.push(1);

        System.out.println("Count of nodes is " + l.getCount())
    }
}
