package binary.tree;

public class BinarySearchTree extends BinaryTree {
    public boolean contains(int val){
        TreeNode t=root;
        while(t!=null){
            if(t.value==val){
                return true;
            }
            else if (t.value>val){
                t=t.left;
            }
            else t=t.right;
        }
        return false;
    }
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

    private TreeNode addR(TreeNode root , int val){


        if(root==null){
            root=new TreeNode(val);
            return root;
        }
        if(val<root.value){
             root.left=addR(root.left,val);
        }
        else if(val>root.value){
            root.right=addR(root.right,val);
        }
        return root;
    }
    public void addR( int val){
       root= addR(root,val);
    }


}
