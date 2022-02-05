//to take two arrays and find median
import java.io.*;
import java.util.*;

public class Median {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n=n1+n2;
        int arr1[]=new int[n];

        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        int d=n/2;
        if(n%2==0){

            float median=(float)(arr1[d]+arr1[d-1])/2;
            System.out.println(median);
        }
        else{
            float median=arr1[d];
            System.out.println(median);

        }
    }
}