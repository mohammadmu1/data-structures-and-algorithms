/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package binary.tree;

import java.util.ArrayList;
import java.util.List;

public class App {


    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

       tree.addR(5);
        tree.addR(4);
        tree.addR(6);
        tree.addR(5);


        System.out.println(tree.contains(4));



    }
}
