//program for removing the consecutive duplicate values in array
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//no. of array element
        int arr[]=new int[n];
        //array input
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        int b=0;
        for (int a:arr
             ) {

            if (b!=a){
                System.out.println(a);
            }
            b=a;
        }
    }
}
