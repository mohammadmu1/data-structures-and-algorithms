/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.queue.pseudo;

public class App {


    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();;

        q.enqueue(5);
        q.enqueue(4);

        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
