# Implement a Hash Table Data Structure

## Description of the Challenge

find intersection elments between 2 binary tree 

## White Board

![Alt Text](./Whiteboard%2017.png)

## Code 

``` java


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
```
## Algorithm

**bfsToHashMap(TreeNode root):** This method takes a TreeNode called root as input and uses a Breadth-First Search (BFS) traversal to convert the values of the tree into a HashTable where the keys are integer values found in the tree, and the values are true. Here are the steps:

1. Create an empty HashTable called hashMap.
2. If the root is null, return the empty hashMap.
3. Create a Queue called queue and enqueue the root node.
4. While the queue is not empty, do the following:
   - Dequeue a node from the queue.
   - Add the value of the dequeued node to the hashMap with a value of true.
   - If the dequeued node has a left child, enqueue it.
   - If the dequeued node has a right child, enqueue it.
5. Return the hashMap containing the values from the tree as keys.

**findIntersection(TreeNode tree1, TreeNode tree2):** This method is used to find the intersection of values between two trees. It uses the bfsToHashMap method to build a HashTable for the first tree, and then it performs a BFS traversal of the second tree to check for values that exist in both trees. Here are the steps:

1. Create an empty HashTable called hashMap1 using bfsToHashMap(tree1).
2. Create an empty HashTable called intersection to store the intersection values.
3. Create a Queue called queue and enqueue the tree2 root node.
4. While the queue is not empty, do the following:
   - Dequeue a node from the queue.
   - Check if the value of the dequeued node exists in hashMap1. If it does, add it to the intersection HashTable with a value of true.
   - If the dequeued node has a left child, enqueue it.
   - If the dequeued node has a right child, enqueue it.
5. Return the intersection HashTable containing the values that exist in both trees.

## Complexity

- Space Complexity: O(N) because we use a queue and a HashTable to store all elements.
- Time Complexity: O(N) because we walk through all tree nodes.

