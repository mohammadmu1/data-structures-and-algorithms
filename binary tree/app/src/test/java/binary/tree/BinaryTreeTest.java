package binary.tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;

import java.util.List;

public class BinaryTreeTest {

    @Test
    public void testBFS() {
        // Create a sample binary tree
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);


        List<Integer> result = BinaryTree.bfs(tree);


        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        assertEquals(expected, result);
    }
}

