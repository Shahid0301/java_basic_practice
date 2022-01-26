//to return the sum of digits of a number by recursion
import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
        int n=sc.nextInt();
        int ans=sum(n);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n%10+sum(n/10);
    }
}

