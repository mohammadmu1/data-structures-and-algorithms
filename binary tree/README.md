# linkedlist implementation  
<!-- Description of the  -->
implemt binary tree with 3 dfs method 
1- pre order
2- inorder
3- post order
## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../linked-list/assets/null%20(6).png)
### the code

```
public class BinaryTree {




       protected TreeNode root;
    BinaryTree(){
          root = null;
    }
        //    BinaryTree(ArrayList<Integer> tree){
//
//    }
        private  void preOrder(TreeNode root , List<Integer> ans){

            if(root==null){

                return;
            }
            else{
                ans.add(root.value );
                preOrder(root.left , ans);
                preOrder(root.right ,ans);
            }

        }
    public void preOrder( List<Integer> ans){
        preOrder(root,ans);
    }
    private  void inOrder(TreeNode root , List<Integer> ans){

            if(root==null){

                return;
            }
            else{
                inOrder(root.left , ans);

                ans.add(root.value );

                inOrder(root.right ,ans);
            }

        }
    public void inOrder( List<Integer> ans){
           inOrder(root,ans);
       }
        private void postOrder(TreeNode root , List<Integer> ans){

            if(root==null){

                return;
            }
            else{

                postOrder(root.left , ans);
                postOrder(root.right ,ans);
                ans.add(root.value );
            }

        }
    public void postOrder( List<Integer> ans){
        postOrder(root,ans);
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
 * Time Complexity  O(n)
 * Space Complexity O(n)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();

        // Build a sample binary tree for testing
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        binaryTree.root = root;
    }

    @Test
    void testPreOrderTraversal() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        List<Integer> result = new ArrayList<>();
        binaryTree.preOrder(result);

        assertEquals(expected, result);
    }

    @Test
    void testInOrderTraversal() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(1);
        expected.add(3);

        List<Integer> result = new ArrayList<>();
        binaryTree.inOrder(result);

        assertEquals(expected, result);
    }

    @Test
    void testPostOrderTraversal() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(1);

        List<Integer> result = new ArrayList<>();
        binaryTree.postOrder(result);

        assertEquals(expected, result);
    }
``` 
