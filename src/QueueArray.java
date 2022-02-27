import java.beans.PropertyEditorManager;

public class QueueArray {
    static class Queue {
        static int rear;
        static int arr[];
        static int size;

        public Queue(int n) {
            arr = new int[n];
            this.size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == arr.length - 1;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("data Overflow");
                return;
            }
            rear++;
            arr[rear] = data;

        }

        public void remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Emmpty queue");
                return -1;
            }
            return arr[0];

        }
    }
    public static void main(String[] args) {
        Queue Que=new Queue(6);
        Que.add(6);
        Que.add(7);
        Que.add(8);
        Que.add(9);
        Que.remove();

        while(!Que.isEmpty()){
            System.out.println(Que.peek());
            Que.remove();
        }
    }
}
