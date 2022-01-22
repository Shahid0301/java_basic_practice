//to print the counting till n by recursion
import java.util.Scanner;
class Number{
    public static void number(int n){
       if(n<=0)
           return;
       number(n-1);
        System.out.print(n+" ");
    }
}

public class NumberRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Number.number(n);
    }
}
