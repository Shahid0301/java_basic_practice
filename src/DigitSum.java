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
        int sum1=0;
        if(n==0){
            return 0;
        }
        sum1+=n%10;
        n=n/10;
        return sum1+sum(n);
    }
}

