package binary.tree;

import static org.junit.Assert.*;
import org.junit.Test;

public class BSTTest {

    @Test
    public void testAdd() {
        TreeNode root = null;
        BinarySearchTree manager = new BinarySearchTree();


        manager.add( 5);
        manager.add( 3);
        manager.add( 7);
        manager.add( 2);
        manager.add( 4);
        manager.add( 6);
        manager.add( 8);


        assertTrue(manager.contains( 5));
        assertTrue(manager.contains( 3));
        assertTrue(manager.contains( 7));
        assertTrue(manager.contains( 2));
        assertTrue(manager.contains( 4));
        assertTrue(manager.contains( 6));
        assertTrue(manager.contains( 8));


        assertFalse(manager.contains( 9));
    }
}
