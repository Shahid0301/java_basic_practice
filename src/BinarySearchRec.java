
import java.util.Arrays;
import java.util.Scanner;

class Search{
    public int binarySearch(int target,int start,int end,int[] arr){

        int m=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(target==arr[m]){
            return m;
        }
        if(target>arr[m]){
            return binarySearch(target,m+1,end,arr);
        }

        return binarySearch(target,start,m-1,arr);

    }
}
public class BinarySearchRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. you want find in the array");
        int target=sc.nextInt();
        System.out.println("Enter the no. of elements you want in your array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("your sorted array is ");
        for (int a:arr
             ) {
            System.out.print(a+" ");
        }
        Search obj=new Search();
        int ans=obj.binarySearch(target,0,n-1,arr);
        System.out.println("\n Your no. is present at index no."+ans);
    }
}
