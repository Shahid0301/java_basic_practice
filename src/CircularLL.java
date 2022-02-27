public class CircularLL {
Node head;
Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void remove(){
        if(head==null){
            System.out.println("your list is empty");
            return;
        }
        head=head.next;
        tail.next=head;

    }
    void addFirst(int data){
        Node newNod=new Node(data);

        if(head==null){
            head=newNod;
            tail=newNod;
            newNod.next=head;
            return;
        }
        tail.next=newNod;
        newNod.next=head;
        head=newNod;
    }
    void display(){
        Node temp=head;
        while(temp!=tail){
            System.out.println((temp.data));
            temp=temp.next;

        }
    }
    public static void main(String args[]){
        CircularLL list=new CircularLL();
        list.addFirst(5);
        list.addFirst(7);
        list.addFirst(8);
        list.display();
    }
}
