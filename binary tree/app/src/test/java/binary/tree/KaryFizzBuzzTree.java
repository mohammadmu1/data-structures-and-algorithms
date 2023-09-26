package binary.tree;
import java.util.ArrayList;
import java.util.List;

public class KaryFizzBuzzTree<T> {
    public KaryTreeNode<String> fizzBuzzTree(KaryTreeNode<T> root) {
        if (root == null) {
            return null;
        }

        // Check if the value is divisible by 3, 5, or both
        String newValue = "";
        if (root.value instanceof Integer) {
            int intValue = (Integer) root.value;
            if (intValue % 3 == 0) {
                newValue += "Fizz";
            }
            if (intValue % 5 == 0) {
                newValue += "Buzz";
            }
        }

        if (newValue.isEmpty()) {
            newValue = root.value.toString();
        }

        // Create a new node with the modified value
        KaryTreeNode<String> newNode = new KaryTreeNode<>(newValue);

        // Recursively process the children
        for (KaryTreeNode<T> child : root.children) {
            KaryTreeNode<String> newChild = fizzBuzzTree(child);
            newNode.addChild(newChild);
        }

        return newNode;
    }

    public void printKaryTree(KaryTreeNode<String> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " [");
        for (KaryTreeNode<String> child : root.children) {
            printKaryTree(child);
        }
        System.out.print("] ");
    }
}
