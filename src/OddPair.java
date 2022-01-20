//Write a short Java function that takes an array of int values  as an argument and
// determines if there is a pair of numbers in the array whose product is odd.
import java.util.ArrayList;
import java.util.Scanner;
class Pair{
    public static ArrayList oddPair(int arr[]){
        ArrayList odd=new ArrayList();
        for (int a:arr
             ) {
            for (int i = 0; i <arr.length; i++) {
                int m=a*arr[i];
                if(m%2!=0){
                    odd.add(a);
                    odd.add(arr[i]);
                }

            }

        }
        return odd;
    }
}
public class OddPair {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of inputs you want");
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=s.nextInt();

        }
        ArrayList oddP=Pair.oddPair(arr);
        System.out.println("the pairs of odd multiplications are");
        for (int i = 0; i < oddP.size(); i=i+2) {
            System.out.print("("+oddP.get(i)+" "+oddP.get(i+1)+")"+",");

        }
    }
}
