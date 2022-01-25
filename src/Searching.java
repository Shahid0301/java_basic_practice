//to search and find the index of the first occurrence of a target no. in an array
import java.util.Scanner;

public class Searching {
    public static int find(int arr[],int currentIndex,int target){
        if(arr[currentIndex]==target){
            return currentIndex;
        }
        currentIndex++;
        return find(arr,currentIndex,target);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int arr[] = {1, 2, 4, 2, 6}, n, ans; --->testing array
        int n,ans,a;
        System.out.println("enter the size of array");
        a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter "+a+" elements in array");
        for (int i = 0; i <a ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no. you want to find in your array");
        n = sc.nextInt();
        ans = find(arr, 0, n);
        System.out.println("your target no. has occurred at index ["+ans+"] for the first time");
    }
}
