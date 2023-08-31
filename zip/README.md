# linkedlist implementation  
<!-- Description of the  -->
the is task that given two linked lists, list1 and list2, both containing integer values. Your task is to create a new linked list by interleaving the elements from list1 and list2 in the order they appear. Implement a function zipLists(list1, list2) that takes in these two linked lists as input and returns a new linked list that contains the interleaved elements.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../zip/null%20(11).png)
### the code

```

public Node zipLists(LinkedList list1, LinkedList list2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        Node ptr1 = list1.getHead();
        Node ptr2 = list2.getHead();

        while (ptr1 != null || ptr2 != null) {
            if (ptr1 != null) {
                temp.next = new Node(ptr1.val);
                temp = temp.next;
                ptr1 = ptr1.next;
            }
            if (ptr2 != null) {
                temp.next = new Node(ptr2.val);
                temp = temp.next;
                ptr2 = ptr2.next;
            }
        }

        return dummy.next;
    }


```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
The given code defines a method `zipLists` that takes two linked lists (`list1` and `list2`) as input and returns a new linked list that is created by "zipping" the elements from both input lists together. The term "zipping" in this context refers to interleaving the elements of the two lists in the order they appear.

#### Step-by-Step Explanation

1. Create a new node `dummy` as a placeholder with a value of 0. This node will act as the starting point of the resulting linked list.
2. Create a reference `temp` that initially points to the `dummy` node. This reference will be used to build the new linked list.
3. Create references `ptr1` and `ptr2` that initially point to the heads of `list1` and `list2` respectively. These references will be used to traverse through the elements of the input lists.

#### The Main Loop

4. Enter a loop that continues as long as either `ptr1` or `ptr2` (or both) is not null. This loop will iterate through both input lists.

##### Inside the Loop

5. Check if `ptr1` is not null. If it is not null, it means there are still elements in `list1` to be processed.
   - Create a new node with the value of `ptr1.val`.
   - Attach the new node to the `temp.next` pointer, effectively adding it to the resulting linked list.
   - Move the `temp` reference to the newly added node (`temp` now points to the newly added node).
   - Move the `ptr1` reference to the next node in `list1`.

6. Check if `ptr2` is not null. If it is not null, it means there are still elements in `list2` to be processed.
   - Create a new node with the value of `ptr2.val`.
   - Attach the new node to the `temp.next` pointer, adding it to the resulting linked list.
   - Move the `temp` reference to the newly added node.
   - Move the `ptr2` reference to the next node in `list2`.

7. The loop continues until both `ptr1` and `ptr2` become null, effectively traversing both input lists and interleaving their elements in the new linked list.

8. After the loop completes, the resulting linked list has been constructed with the desired interleaved order of elements.

9. Return the next node of the `dummy` node (i.e., the first node of the resulting linked list) as the final result of the `zipLists` function.


### Big O space/time
 
 * Time Complexity  O(N)
 * Space Complexity O(N)

 
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```
@Test
    void testZipLists() {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.append(3);

        LinkedList list2 = new LinkedList();
        list2.insert(2);
        list2.append(4);

        LinkedList resultList = new LinkedList();
        resultList.setHead(resultList.zipLists(list1, list2)) ;

        // Verify the merged list by asserting expected values
        StringBuilder expected = new StringBuilder("1 -> 2 -> 3 -> 4 -> NULL");
        assertEquals(expected.toString(), resultList.toString());
    }

``` 

