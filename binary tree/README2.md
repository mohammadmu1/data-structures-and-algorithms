 
<!-- Description of the  -->

method find max value in binary tree 
## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../binary%20tree/Whiteboard%207.png)
### the code

``` 

int maxValue(){
        List<Integer> l = new ArrayList<>();
        postOrder(l);
        int length=l.size();
        int maxV=l.get(0);
        for(int i = 1 ;  i<length;i++ ){
            if(l.get(i)>maxV)maxV=l.get(i);
        }
        return maxV;
    }



```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
**Preorder Traversal:**
- It starts with an empty list called `l` where we'll store numbers from the binary tree.

- It uses a method called `postOrder` to visit each node in the binary tree and adds its value to the list `l`. Post-order means it first goes to the left and right subtrees and then visits the current node.

- After visiting all nodes and storing their values in `l`, it counts how many numbers are in the list. This tells us how many numbers were in the binary tree.

- It assumes the first number in the list (`l.get(0)`) is the largest one and stores it in a variable called `maxV`.

- It then compares this assumed maximum (`maxV`) with all the other numbers in the list. If it finds a number that's larger than the assumed maximum, it updates `maxV` to be that larger number.

- After checking all the numbers in the list, it knows which one is the largest, and it returns that number as the result.



### Big O space/time
 * Time Complexity   O(n)
 * Space Complexity O(n)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```@Before
    public void setUp() {
        // Initialize your binary tree with test data
        binaryTree = new BinaryTree();

        

        binaryTree.root = new TreeNode(10);
        binaryTree.root.left = new TreeNode(5);
        binaryTree.root.right = new TreeNode(15);
        binaryTree.root.left.left = new TreeNode(3);
        binaryTree.root.left.right = new TreeNode(8);
    }

    @Test
    public void testMaxValueWithSampleTree() {
        // Test the maxValue method with the sample tree
        int max = binaryTree.maxValue();
        assertEquals(15, max); // The maximum value in the sample tree is 15
    }
``` 
