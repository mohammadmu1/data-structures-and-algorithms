package binary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

      static   List<Integer> bfs(BinaryTree t){
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
}
