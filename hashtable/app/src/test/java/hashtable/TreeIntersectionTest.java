package hashtable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeIntersectionTest {

    private TreeIntersection treeIntersection;

    @BeforeEach
    public void setUp() {
        treeIntersection = new TreeIntersection();
    }

    @Test
    public void testFindIntersection() {
     
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);
        tree1.left.left = new TreeNode(4);
        tree1.left.right = new TreeNode(5);

        TreeNode tree2 = new TreeNode(3);
        tree2.left = new TreeNode(1);
        tree2.right = new TreeNode(5);


        HashTable<Integer, Boolean> intersection = treeIntersection.findIntersection(tree1, tree2);


        assertTrue(intersection.has(1));
        assertTrue(intersection.has(3));
        assertTrue(intersection.has(5));
        assertFalse(intersection.has(2));
        assertFalse(intersection.has(4));
    }




}
