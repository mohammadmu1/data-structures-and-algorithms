
package stack;
public class Stack {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    private Node top=null;
    public boolean isempty(){
        return top==null;
    }
  public void push(int value){
        Node newNode=new Node(value);
        if(isempty()){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }

  }
    public int pop(){

        if(isempty()) {
            throw new IllegalStateException("Stack is empty");
        }

            int temp=top.val;
            top=top.next;
            return  temp;


    }

    public int  peek(){
        if(isempty()) {
            throw new IllegalStateException("Stack is empty");
        }


        return  top.val;
    }





    }
