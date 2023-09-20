# linkedlist implementation  
<!-- Description of the  -->
problem domain<br>

apply bfs on binary tree

I/P : Binary Tree

O/P : Array (Integer)
## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../binary%20tree/Whiteboard%208.png)
### the code

```static   List<Integer> bfs(BinaryTree t){
        List<Integer>ans = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(t.root);
            while(q.size() != 0){
                int length = q.size();
                for(int i = 0 ;i<length;i++){

                    if(q.peek().left!=null){
                        q.add(q.peek().left);

                    }
                    if(q.peek().right!=null){
                        q.add(q.peek().right);
                    }
                    ans.add(q.remove().value);
                }
            }
            return ans;
        }
```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
1. We have a method named `bfs` that takes a `BinaryTree` object called `t` as input and returns a list of integers.

2. Inside the method, we initialize an empty list called `ans` to store the results of the breadth-first traversal.

3. We create a queue named `q` using the `LinkedList` class. This queue will help us perform a breadth-first traversal of the binary tree.

4. We add the root node of the binary tree `t` to the queue `q` using `q.add(t.root)`. This is the starting point of our traversal.

5. We enter a `while` loop that continues until the queue `q` is empty.

6. Inside the loop, we find the number of nodes at the current level of the tree. We do this by storing the current size of the queue in the variable `length` using `int length = q.size();`.

7. We use a `for` loop to iterate `i` from 0 to `length - 1` to process all nodes at the current level.

8. For each node in the current level, we do the following:
    - Check if the node has a left child (`q.peek().left != null`). If it does, we add the left child to the queue `q` using `q.add(q.peek().left)`.
    - Check if the node has a right child (`q.peek().right != null`). If it does, we add the right child to the queue `q` using `q.add(q.peek().right)`.
    - We remove the current node from the queue `q` and add its value to the `ans` list using `ans.add(q.remove().value)`.

9. After processing all nodes at the current level, we move to the next level in the tree, and the process continues.

10. Finally, when the queue `q` becomes empty, we have traversed the entire binary tree in a breadth-first manner, and we return the `ans` list containing the values of the nodes in breadth-first order.


### Big O space/time
 * Time Complexity  O(n)
 * Space Complexity O(N)
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
