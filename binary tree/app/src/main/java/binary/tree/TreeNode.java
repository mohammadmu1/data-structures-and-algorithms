package binary.tree;

public class TreeNode {
    protected  TreeNode left;
    protected  TreeNode right;
   protected int value;

    protected TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}