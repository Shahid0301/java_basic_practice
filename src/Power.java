//to find x to power n by recursion
import java.util.Scanner;

public class Power {
    static int power1(int x,int n){
        if(n==1){
           return x;
        }

        return x*power1(x,n-1);
    }
    public static void main(String[] args) {
        int n,x,ans;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        x=sc.nextInt();
        System.out.println("enter the power");
        n=sc.nextInt();

        ans=power1(x,n);
        System.out.println(ans);
    }
}
