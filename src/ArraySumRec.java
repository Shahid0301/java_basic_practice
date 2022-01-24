//to calculate the sum of all elements of array by recursion
import java.util.Scanner;

public class ArraySumRec {
    public static int Sum(int arr[],int i){
        int sum=0;
        if(i>=arr.length){
            return 0;
        }
        sum+=arr[i];
        return sum+Sum(arr,i=i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans,i=0;
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for (int j = 0; j < n; j++) {
            arr[j]=sc.nextInt();
        }
        ans=Sum(arr,0);
        System.out.println("the sum of all elements is "+ans);
    }
}
