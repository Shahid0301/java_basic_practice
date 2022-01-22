import java.util.Scanner;

//finding the no. by recurison
public class FibonacciNoRecursion {
    static int fibonacci(int n){
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int ans=fibonacci(n);
        System.out.println(ans);
    }
}
