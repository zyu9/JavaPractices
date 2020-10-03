/* Returns the largest value in an array of n non-negative intergers*/
int CompareToMax(int arr[], int n){
    int curMax, i;

    /* Make sure that there is at least one element in the array */
        if(n <= 0)
            return -1;
    /* Set the largest number so far to the first array value. */
        curMax = arr[0];
    /* Compare every number with the largest number so far. */
        for(i = 1; i < n; i++){
           if(arr[i] > curMax){
               curMax = arr[i];
           }
        }
        return curMax;
}//O(n)

/* Returns the largest value in an array of n non-negative integers */
int CompareToAll(int arr[], int n){
    int i, j;
    bool isMax;

    /* Make sure that there is at least one element in the array. */
        if(n <= 0)
            return -1;

        for(i = 0; i < n; j++){
            isMax = true;
            for(j = 0; j < n; j++){
                /* See if any value is greater. */
                if(array[j] > array[i]){
                    isMax = false; /* arr[i] is not the largest value. */
                    break;
                }
            }
            /* If isMax is true, no larger value exists; array[i] is max. */
            if(isMax) break;
        }
        return array[i];
}//Average and Worst: O(n^2) Best: O(n)