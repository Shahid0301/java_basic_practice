//to search and find the indices of the every occurrence of a target no. in an array and store them in an arraylist
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static int[] find(int arr[], int tar_arr[], int currentIndex, int target,int i){
        if(currentIndex==arr.length){
            return tar_arr;
        }
        if(arr[currentIndex]==target){
            tar_arr[i]=currentIndex;
            i++;
        }
        currentIndex++;
        return find(arr,tar_arr,currentIndex,target,i);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a,i=0;
        System.out.println("enter the size of array");
        a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter "+a+" elements in array");
        for (int j = 0; j <a ; j++) {
            arr[j]=sc.nextInt();
        }
        System.out.println("enter the no. you want to find in your array");
        n = sc.nextInt();
        int arr1[]=new int[arr.length];
        int ans[] = find(arr,arr1, 0, n,i);
        for (int j = 0; j < ans.length; j++) {
            if(j==0){
                System.out.print(ans[j]+" ");
            }
            else if(ans[j]!=0){
                System.out.print(ans[j]+" ");
            }
        }
    }
}
