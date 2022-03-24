import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;


public class ReverseQueue {
    public static void main(String[] args) {
        Queue queue=new LinkedList();
        Stack stack=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total no. of elements you want in queue");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        System.out.println("enter the no. to which you to reverse the element");
        int k=sc.nextInt();
        for (int i = 0; i < k; i++) {
            int a=(int)(queue.remove());
            stack.push(a);
        }

        for (int i = 0; i < k; i++) {
           int a= (int)stack.pop();
            System.out.println(a);
        }
        for (int i = 0; i < n-k; i++) {
            int a=(int)queue.remove();
            System.out.println(a);
        }
//        for (int i = 0; i < n-k; i++) {
//            int a=(int)queue.remove();
//            queue.add(a);
//        }

    }
}
