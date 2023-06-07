# Problem Statement: Given an array of N integers, count the inversion of the array (using merge-sort).

What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].


```
import java.util.* ;

import java.io.*; 

public class Solution {

    public static long getInversions(long arr[], int n) {

        // Write your code here.

        long count = 0;

        for(int i=0; i<n; ++i){
            for(int j=i+1; j<n; ++j){

                if(arr[i] > arr[j]){
                    ++count;
                }
            }
        }
        return count;
    }
}



```



# Approach:

* Initialize a variable count to store the count of inversions.
* Iterate through each pair of elements (arr[i], arr[j]) in the array where i < j.
* If arr[i] > arr[j], it means there is an inversion. Increment the count variable.
* Return the count as the total number of inversions in the array.

# time complexity of this approach is O(n^2) because there are two nested loops iterating over the array
# space complexity is O(1)
