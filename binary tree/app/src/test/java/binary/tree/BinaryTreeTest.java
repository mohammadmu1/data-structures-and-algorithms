package binary.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest {

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
    private BinaryTree binaryTree;

    @Before
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

}