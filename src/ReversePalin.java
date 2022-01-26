//To reverse the number and check that the no. is palindrome or not by recursion
import java.util.Scanner;

public class ReversePalin {
    //method for reversing the no.
    static int rev(int n){
        if(n%10==n){
            return n;
        }
        int d=digit(n);
        int rem=n%10;
        return rem*(int)(Math.pow(10,d-1))+rev(n/10);
    }
    //main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=rev(n);
        System.out.println("Reversed no: "+ans);
        palin(n);

    }
    //method for finding the digit of a number
    static int digit(int n){
        int count=1;
        if(n==0){
            return 0;
        }
        return count+digit(n/10);
    }
    //method for finding a palindrome or not
    static boolean palin(int n){
        if (n == rev(n)) {
            System.out.println("Its a palindrome");
            return true;
        }
        System.out.println("Its  not a palindrome");
        return false;
    }
}
