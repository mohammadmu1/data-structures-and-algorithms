# Insertion Sort   
<!-- Description of the  -->


I/P : array of integer

O/P : array of integer
## Descreption

Function insertionSort that takes an array arr as input.

If the array's length is less than 1 (empty or contains only one element), it returns the array as it's already sorted.

It then enters a loop that goes through each element of the array, starting from the second element (index 1) because the first element (index 0) is considered already sorted.

Inside the loop, it assigns the current index to `j` and the element at that index  `i`. These values will be used to compare and move elements in the next steps.

It enters another loop (a while loop) that runs as long as `j` is greater than or equal to 0 and element at that index  `i` is smaller than the element at the `j`-th position in the array.

Inside this while loop, it shifts elements to the right to make space for the `key`. It does this by moving the element at position `j` to the right (index `j+1`), effectively "inserting" the element at that index  `i` into its proper sorted position.

After the while loop finishes, it assigns element at that index  `i` to the element at the `j+1` position, which is where it belongs in the sorted portion of the array.

The outer loop continues, and this process repeats for each element in the array, gradually sorting the entire array.


## Tracing Process 
<!-- Embedded whiteboard image -->
![](../insertion/Whiteboard%2013.png)
### the code

```

 int [] insertionSort(int [] arr){
        if(arr.length <2) return arr;
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

### pseudo code

```
function insertionSort(arr)
    if length of arr < 2
        return arr
    end if
    
    length = length of arr
    for i from 1 to length - 1
        j = i - 1
        key = arr[i]
        while j >= 0 and key < arr[j]
            arr[j + 1] = arr[j]
            j = j - 1
        end while
        arr[j + 1] = key
    end for
    
    return arr
end function


```




### Efficiency
 * Time Complexity  O(n^2) : because each element in array we almost walk through all element of array. 
 * Space Complexity O(1) : because no need for extra space whatever is the array size we will use the same space.

## Testing

![](../insertion/testInsertion.png)


