package binary.tree;

import java.util.List;

public class BinaryTree {




        TreeNode root=null;
        //    BinaryTree(ArrayList<Integer> tree){
//
//    }
        void preOrder(TreeNode root , List<Integer> ans){

            if(root==null){

                return;
            }
            else{
                ans.add(root.value );
                preOrder(root.left , ans);
                preOrder(root.right ,ans);
            }

        }
        void inOrder(TreeNode root , List<Integer> ans){

            if(root==null){

                return;
            }
            else{
                preOrder(root.left , ans);

                ans.add(root.value );

                preOrder(root.right ,ans);
            }

        }
        void postOrder(TreeNode root , List<Integer> ans){

            if(root==null){

                return;
            }
            else{

                postOrder(root.left , ans);
                postOrder(root.right ,ans);
                ans.add(root.value );
            }

        }


}
