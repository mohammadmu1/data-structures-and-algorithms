package hashtable;

import hashtable.HashTable;
import hashtable.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeIntersection {
    public static HashTable<Integer, Boolean> bfsToHashMap(TreeNode root) {
        HashTable<Integer, Boolean> hashMap = new HashTable<>();

        if (root == null) {
            return hashMap;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            hashMap.set(currentNode.value, true);

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
        return hashMap;
}

    HashTable<Integer, Boolean> findIntersection(TreeNode tree1, TreeNode tree2) {
        HashTable<Integer, Boolean> hashMap1 = bfsToHashMap(tree1);
        HashTable<Integer, Boolean> intersection = new HashTable<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(tree2);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (hashMap1.has(currentNode.value)) {
                intersection.set(currentNode.value, true);
            }

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
        return intersection;
    }

}

