# Insertion Sort implementation  
<!-- Description of the  -->
apply insertion sort on array 

I/P : array of integer

O/P : array of integer


## Whiteboard Process
<!-- Embedded whiteboard image -->
![](/app/src/main/java/insertion/cc26/Whiteboard%2012.png)
### the code

```

 int [] insertionSort(int [] arr){

        int length = arr.length , j,key;
        if(length <1) return arr;
        for(int i = 1 ; i<length;i++){
            j=i-1;
            key=arr[i];
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
        arr[j+1]=key;
    }
        return arr;
    }




```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
1. Define a function called `insertionSort` that takes an array `arr` as input.

2. Calculate the length of the input array and initialize two variables, `j` and `key`.

3. Check if the length of the array is less than 1. If it is, return the array as it is already considered sorted.

4. Start a loop that iterates through each element of the array, beginning from the second element (index 1), as the first element is considered sorted.

5. Inside the loop, assign the current index to the variable `j` and the element at that index to the variable `key`. These values will be used for comparisons and element movements.

6. Enter another loop (a while loop) that continues as long as `j` is greater than or equal to 0 and the `key` is smaller than the element at the `j`-th position in the array.

7. Inside the while loop, shift elements to the right to make space for the `key`. This is achieved by moving the element at position `j` to the right (index `j+1`), essentially "inserting" the `key` into its proper sorted position.

8. After the while loop concludes, assign the `key` to the element at the `j+1` position, which is its rightful position in the sorted part of the array.

9. The outer loop continues, and this process repeats for each element in the array, progressively sorting the entire array.

10. Finally, when the outer loop finishes, return the sorted array.




### Big O space/time
 * Time Complexity  O(n^2)
 * Space Complexity O(1)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```
@Test
    void testInsertAndToString() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(7);
        linkedList.insert(10);

        assertEquals("10 -> 7 -> 3 -> NULL", linkedList.toString());
    }

    @Test
    void testIsInclude() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(3);
        linkedList.insert(7);
        linkedList.insert(10);

        assertTrue(linkedList.isInclude(7));
        assertFalse(linkedList.isInclude(5));
    }

``` 



