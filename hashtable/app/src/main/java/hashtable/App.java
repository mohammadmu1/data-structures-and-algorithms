/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

public class App {


    public static void main(String[] args) {

            HashTable<String,Integer> map=new HashTable<>();

            map.set("m",56);

            System.out.println(map.has("m"));



    }
}
