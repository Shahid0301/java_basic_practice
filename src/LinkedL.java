class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
    void display(){
        if(head==null){
            System.out.println("your list is empty");
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node secondLast=head;
        Node Last=head.next;
        if(Last==null){
            head=null;
            return;
        }
        while(Last.next!=null){
            secondLast=secondLast.next;
            Last=Last.next;
        }
        secondLast.next=null;
    }

}
public class LinkedL {
    public static void main(String[] args) {
        LL list=new LL();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(1);
        list.deleteFirst();
        list.deleteLast();
        list.display();
    }
}