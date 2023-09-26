import java.util.ArrayList;
import java.util.List;

class KaryTreeNode<T> {
    T value;
    List<KaryTreeNode<T>> children;

    public KaryTreeNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public void addChild(KaryTreeNode<T> child) {
        this.children.add(child);
    }
}

public class App {
    public static KaryTreeNode<String> fizzBuzzTree(KaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }

        // Check if the value is divisible by 3, 5, or both
        String newValue = "";
        if (root.value % 3 == 0) {
            newValue += "Fizz";
        }
        if (root.value % 5 == 0) {
            newValue += "Buzz";
        }

        if (newValue.isEmpty()) {
            newValue = root.value.toString();
        }

        // Create a new node with the modified value
        KaryTreeNode<String> newNode = new KaryTreeNode<>(newValue);

        // Recursively process the children
        for (KaryTreeNode<Integer> child : root.children) {
            KaryTreeNode<String> newChild = fizzBuzzTree(child);
            newNode.addChild(newChild);
        }

        return newNode;
    }

    public static void printKaryTree(KaryTreeNode<String> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.value + " [");
        for (KaryTreeNode<String> child : root.children) {
            printKaryTree(child);
        }
        System.out.print("] ");
    }

    public static void main(String[] args) {
        // Example usage:
        KaryTreeNode<Integer> root = new KaryTreeNode<>(15);
        KaryTreeNode<Integer> child1 = new KaryTreeNode<>(3);
        KaryTreeNode<Integer> child2 = new KaryTreeNode<>(5);
        KaryTreeNode<Integer> child3 = new KaryTreeNode<>(9);
        KaryTreeNode<Integer> child4 = new KaryTreeNode<>(10);

        root.addChild(child1);
        root.addChild(child2);
        child1.addChild(child3);
        child2.addChild(child4);

        App app = new App();
        KaryTreeNode<String> newRoot = app.fizzBuzzTree(root);
        app.printKaryTree(newRoot);
    }
}
