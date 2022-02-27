public class StackDS {
    private static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head = null;
        public static void push(char data) {
            Node newNode = new Node(data);

            if(head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static boolean isEmpty() {
            return head == null;
        }

        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        public static char peek() {
            if(isEmpty()) {
                return 'n';
            }
            Node top = head;
            return top.data;
        }
    }

    public static void main(String args[]) {
            Stack stack=new Stack();
           String s="hello";
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}