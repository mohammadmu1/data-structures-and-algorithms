# linkedlist implementation  
<!-- Description of the  -->
the challenge is   implemntation stack  using LinkedIist

## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../stack/Whiteboard%20(1).png)
### the code

```

public class Stack {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    private Node top=null;
    public boolean isempty(){
        return top==null;
    }
  public void push(int value){
        Node newNode=new Node(value);
        if(isempty()){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }

  }
    public int pop(){

        if(isempty()) {
            throw new IllegalStateException("Stack is empty");
        }

            int temp=top.val;
            top=top.next;
            return  temp;


    }

    public int  peek(){
        if(isempty()) {
            throw new IllegalStateException("Stack is empty");
        }


        return  top.val;
    }





    }



```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach

## Stack Class Explanation

### Node Class
- Inside the `Stack` class, there's a nested private class called `Node`. This class represents individual elements (nodes) in the stack.
- Each node has two properties: `val` to store the value of the element and `next` to point to the next element in the stack.
- The constructor of the `Node` class initializes the `val` property with the provided value.

### Private Top Pointer
- The `Stack` class has a private member variable called `top`, which is initially set to `null`.
- This variable keeps track of the top element in the stack.

### isEmpty Method
- The `isempty` method is a public method that checks if the stack is empty.
- It returns `true` if `top` is `null`, indicating an empty stack, and `false` otherwise.

### push Method
- The `push` method is used to add (push) a new element onto the stack.
- It takes an integer `value` as a parameter.
- It creates a new `Node` called `newNode` with the provided `value`.
- If the stack is empty (i.e., `top` is `null`), it sets `top` to `newNode`, making it the top element.
- If the stack is not empty, it updates `newNode.next` to point to the current top element and then updates `top` to `newNode`, effectively making `newNode` the new top element.

### pop Method
- The `pop` method is used to remove (pop) the top element from the stack.
- It returns the value of the removed element.
- It first checks if the stack is empty using the `isempty` method. If the stack is empty, it raises an exception because you can't pop from an empty stack.
- If the stack is not empty, it retrieves the value of the current top element (`top.val`), updates `top` to point to the next element in the stack (`top = top.next`), and returns the retrieved value.

### peek Method
- The `peek` method allows you to view the value of the top element in the stack without removing it.
- Similar to the `pop` method, it checks if the stack is empty and raises an exception if it is.
- If the stack is not empty, it returns the value of the top element (`top.val`).


### Big O space/time
 * Time Complexity  O(n)
 * Space Complexity O(1)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```
@Test
   public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testPush() {
        stack.push(1);
        assertFalse(stack.isempty());
    }

    @Test
    public void testPushMultipleValues() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertFalse(stack.isempty());
    }

    @Test
    public void testPop() {
        stack.push(1);
        int poppedValue = stack.pop();
        assertEquals(1, poppedValue);
        assertTrue(stack.isempty());
    }

    @Test
    public void testEmptyStackAfterMultiplePops() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isempty());
    }

    @Test
    public void testPeek() {
        stack.push(42);
        int peekedValue = stack.peek();
        assertEquals(42, peekedValue);
        assertFalse(stack.isempty());
    }

    @Test
    public void testInstantiateEmptyStack() {
        assertTrue(stack.isempty());
    }

    @Test
    public void testPopOnEmptyStackRaisesException() {
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }

    @Test
    public void testPeekOnEmptyStackRaisesException() {
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }
}


``` 
