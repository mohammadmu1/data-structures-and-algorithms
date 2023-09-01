package queue;

import java.util.NoSuchElementException;

public class Queue {
    private class Node{
        Node next;
        int val;
        Node(int val){
            this.val=val;
        }
    }
    private Node front=null;
    private Node back=null;
    public boolean isEmpty(){
        return front==null;
    }

    public void enqueue(int val){
        Node newNode =new Node(val);
        if(isEmpty()){
            front=newNode;
            back=front;
        }
        else{
            back.next=newNode;
            back=newNode;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        if(front==back){
            int ans =front.val;
            front =null;
            back=null;
            return ans;
        }
        int ans =front.val;
        front = front.next;
        return ans;
    }
        public int peek(){
            if(isEmpty()){
                throw new NoSuchElementException("Queue is empty");
            }


            return front.val;
            }


}
