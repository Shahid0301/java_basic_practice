//To count the no. of digits in a number
import java.util.Scanner;

public class CountRec {
    public static int counting(int n){
        int count=1;
        if(n==0){
            return 0;
        }
        return count+counting(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. for counting digits");
        int n=sc.nextInt();
        int count=counting(n);
        System.out.println(count);
    }
}
