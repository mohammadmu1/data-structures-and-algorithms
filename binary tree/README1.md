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

1. Start at the root of the binary tree.
2. Visit (process) the current node.
3. Recursively perform a Preorder traversal on the left subtree.
4. Recursively perform a Preorder traversal on the right subtree.

**Inorder Traversal:**

1. Start at the root of the binary tree.
2. Recursively perform an Inorder traversal on the left subtree.
3. Visit (process) the current node.
4. Recursively perform an Inorder traversal on the right subtree.

**Postorder Traversal:**

1. Start at the root of the binary tree.
2. Recursively perform a Postorder traversal on the left subtree.
3. Recursively perform a Postorder traversal on the right subtree.
4. Visit (process) the current node.


### Big O space/time
 * Time Complexity  O(nlogn) or O(n)
 * Space Complexity O(1)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```import static org.junit.Assert.*;
import org.junit.Test;

public class TreeNodeTest {

    @Test
    public void testAdd() {
        TreeNode root = null;
        TreeNodeManager manager = new TreeNodeManager();

        // Add values to the tree
        manager.add(root, 5);
        manager.add(root, 3);
        manager.add(root, 7);
        manager.add(root, 2);
        manager.add(root, 4);
        manager.add(root, 6);
        manager.add(root, 8);

        // Check if the values are present in the tree
        assertTrue(manager.contains(root, 5));
        assertTrue(manager.contains(root, 3));
        assertTrue(manager.contains(root, 7));
        assertTrue(manager.contains(root, 2));
        assertTrue(manager.contains(root, 4));
        assertTrue(manager.contains(root, 6));
        assertTrue(manager.contains(root, 8));
        
        // Check if a value that was not added is not in the tree
        assertFalse(manager.contains(root, 9));
    }
}

``` 
