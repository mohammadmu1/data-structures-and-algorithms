package ll2;

public class LinkedList {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head = null;
    private Node tail = null;

    private boolean isEmpty() {
        return (head == null);
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if(!isEmpty()){
            newNode.next=head;

        }
        else{
            tail=newNode;
        }

        head=newNode;

    }
    public boolean isInclude(int val) {
        Node temp=head;
        while (temp != null) {

            if(temp.val==val)return true;

            temp = temp.next;
        }

        return false;
    }

    public void append(int val){
        if(isEmpty()){
            insert(val);
        }else {
        Node newNode=new Node(val);
        tail.next=newNode;
        newNode.next=null;
        tail=newNode;
    }
    }
    public void insertBefore(int val,int newVal){
        if(!isInclude(val)){
            return ;
        }
        if(head.val==val){
            insert(newVal);
            return ;
        }
        Node temp=head;
        while(temp.next.val !=val){
            temp=temp.next;
        }
        Node newNode = new Node(newVal);
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void insertAfter(int val , int newVal){
        if(!isInclude(val)){
            return ;
        }
        if(tail.val==val){
            append(newVal);
            return ;
        }
        Node temp=head;
        while(temp.val !=val){
            temp=temp.next;
        }
        Node newNode = new Node(newVal);
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int kthFromEnd(int k){
        Node temp = head;
        Node ans = head;
        for (int i = 0 ; i<k;i++){
             if(temp==null) return-12345;
             temp=temp.next;
        }
        while(temp.next !=null){
            temp=temp.next;
            ans=ans.next;
        }
        return ans.val;
    }
    @Override
    public String toString() {
        String ans = "";
        if (isEmpty()) {
            ans="the list is empty";

        } else {
            Node temp = head;

            while (temp != null) {

                ans += temp.val;
                ans += " -> ";
                temp = temp.next;
            }
            ans += "NULL";

        }

        return ans;
    }
}
