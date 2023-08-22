# linkedlist implementation  
<!-- Description of the  -->
the challenge is  find the value of the kth element from the end of a singly linked list

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../linked-list/assets/null%20(6).png)
### the code

```

 public int kthFromEnd(int k){
        Node temp = head;
        Node ans = head;
        for (int i = 0 ; i<k;i++){
             if(temp==null) return-12345;
             temp=temp.next;
        }
        while(temp.next !=null){
            temp=temp.next;
            ans=ans.next;
        }
        return ans.val;
    }


```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
### Initialization:

Two pointers, `temp` and `ans`, are created and initialized to point to the `head` of the linked list. These pointers will be used to traverse the linked list and find the k-th element from the end.

### Move `temp` by `k` Steps:

A loop runs `k` times, where the `temp` pointer is advanced by one step in each iteration.
If the linked list has fewer than `k` elements and `temp` becomes `null`, the method returns a sentinel value to indicate that it's not possible to find the k-th element from the end.

### Traverse to Find k-th from End:

After the loop, the `temp` pointer is ahead by `k` steps. Now, both `temp` and `ans` pointers start moving together.
Both pointers continue moving forward until the `temp` pointer reaches the last element in the linked list. The `ans` pointer is effectively k positions behind the `temp` pointer.

### Return the Result:

Once the `temp` pointer reaches the end of the linked list, the `ans` pointer is positioned at the k-th element from the end.
The method returns the value of the node pointed to by the `ans` pointer, which is the k-th element from the end of the linked list.


### Big O space/time
 * Time Complexity  O(n)
 * Space Complexity O(1)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```
@Test
    public void testKthFromEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        assertEquals(4, linkedList.kthFromEnd(1));
        assertEquals(2, linkedList.kthFromEnd(3));
        assertEquals(1, linkedList.kthFromEnd(4));
        assertEquals(5, linkedList.kthFromEnd(0));


        assertEquals(-12345, linkedList.kthFromEnd(10));
    }

``` 

[//]: # ()
[//]: # ([//]: # &#40;## run code examples &#41;)
[//]: # ()
[//]: # ([//]: # &#40;&#41;)
[//]: # ([//]: # &#40;### **test on empty and single element and 4 element in list**&#41;)
[//]: # ()
[//]: # ([//]: # &#40;&#41;)
[//]: # ([//]: # &#40;```&#41;)
[//]: # ()
[//]: # ([//]: # &#40;public static void main&#40;String[] args&#41; {&#41;)
[//]: # ()
[//]: # ([//]: # &#40;   LinkedList l =new LinkedList&#40;&#41;;   //empty&#41;)
[//]: # ()
[//]: # ([//]: # &#40;        System.out.println&#40; l.toString&#40;&#41;+"\n\n"&#41;; &#41;)
[//]: # ()
[//]: # ([//]: # &#40;        System.out.println&#40;l.isInclude&#40;5&#41;+"\n\n"&#41;;&#41;)
[//]: # ()
[//]: # ([//]: # &#40;        &#41;)
[//]: # ([//]: # &#40;        &#41;)
[//]: # ([//]: # &#40;        l.insert&#40;1&#41;;    //single element &#41;)
[//]: # ()
[//]: # ([//]: # &#40;        System.out.println&#40; l.toString&#40;&#41;+"\n\n"&#41;;  &#41;)
[//]: # ()
[//]: # ([//]: # &#40;        System.out.println&#40;l.isInclude&#40;2&#41;+"\n\n"&#41;;&#41;)
[//]: # ()
[//]: # ([//]: # &#40;        System.out.println&#40;l.isInclude&#40;1&#41;&#41;;&#41;)
[//]: # ()
[//]: # ([//]: # &#40;&#41;)
[//]: # ([//]: # &#40;        l.insert&#40;4&#41;;&#41;)
[//]: # ()
[//]: # ([//]: # &#40;        l.insert&#40;3&#41;;&#41;)
[//]: # ()
[//]: # ([//]: # &#40;        l.insert&#40;2&#41;; // 4 elements &#41;)
[//]: # ()
[//]: # ([//]: # &#40;        System.out.println&#40; l.toString&#40;&#41;+"\n\n"&#41;;&#41;)
[//]: # ()
[//]: # ([//]: # &#40;        System.out.println&#40;l.isInclude&#40;4&#41;+"\n\n"&#41;;&#41;)
[//]: # ()
[//]: # ([//]: # &#40;        System.out.println&#40;l.isInclude&#40;5&#41;&#41;;&#41;)
[//]: # ()
[//]: # ([//]: # &#40;    }&#41;)
[//]: # ()
[//]: # ([//]: # &#40;&#41;)
[//]: # ([//]: # &#40;```&#41;)
[//]: # (**the output**)

[//]: # ()
[//]: # (![Example Image]&#40;../linked-list/assets/output.png&#41;)

