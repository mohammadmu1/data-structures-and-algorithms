# linkedlist implementation  
<!-- Description of the  -->

implement binary search tree with 2 methods <br>
1- add
I/P : integer O/P: tree 
2- contain
I/P:integer O/P:boolean
## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../binary%20tree/Whiteboard%205.png)
### the code

```
public void add(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }

        TreeNode currentNode = root;
        TreeNode parent = null;

       while(currentNode!=null){
           parent=currentNode;
           if(currentNode.value == val){
               return;
           }
           if(currentNode.value < val){
               currentNode=currentNode.right;
           }
           else currentNode=currentNode.left;
       }
       if(parent.value<val){
           parent.right=new TreeNode(val);

       }
       else parent.left=new TreeNode(val);
}


}
```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
**Preorder Traversal:**

Check if the tree is empty.

If it's empty, create a new tree node with the given value and make it the root.

If the tree isn't empty, start at the root.

Keep going down the tree:

If the value you want to add is equal to the current node's value, stop (no duplicates allowed).
If the value is smaller, go left.
If the value is bigger, go right.
When you reach a spot where you can't go further (a null spot), add the new value there:

If the new value is smaller than where you stopped, put it on the left.
If the new value is bigger, put it on the right.


### Big O space/time
 * Time Complexity  O(nlogn) or O(n)
 * Space Complexity O(1)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
``` @Test
    public void testBreadthFirstTraversal() {
        // Create a binary tree for testing
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform breadth-first traversal
        BinarySearchTree traversal = new BinarySearchTree();
        List<Integer> result = BinarySearchTree.bfs(traversal);

        // Define the expected result
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        
        // Assert that the result matches the expected result
        assertEquals(expected, result);
    }


``` 
