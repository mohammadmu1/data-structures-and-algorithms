# Insertion Sort   
<!-- Description of the  -->


I/P : array of integer

O/P : array of integer
## Descreption

# Merge Sort Algorithm Trace

1. **Merge Sort Algorithm **

   Merge Sort is a divide-and-conquer sorting algorithm that efficiently sorts an array or list by recursively dividing it into smaller sub-arrays and then merging those sub-arrays to produce a sorted result. Let's trace the `mergeSort` function step by step using the sample array `[8, 4, 23, 42, 16, 15]`.

2. **Initial Array**


   [8, 4, 23, 42, 16, 15]

    
### Step 1: Split into Two Halves

The original array is divided into two equal-sized sub-arrays:

Left: [8, 4, 23]
Right: [42, 16, 15]

we will do that for each array until all array of size one (sorted array)


[8]  [4]  [23]  [42] [16]  [15]


### Step 2: Merge the Sorted Halves

The sorted left and right halves are merged to produce the final sorted array

[8,  4  , 23  , 42  ,16  ,  15]








## Tracing Process 
<!-- Embedded whiteboard image -->
![](../merge/Whiteboard%2014.png)
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

![](../merge/ms.png)


