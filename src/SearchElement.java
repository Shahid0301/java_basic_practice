//to search and find the indices of the every occurrence of a target no. in an array and store them in an arraylist
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static ArrayList find(int arr[], ArrayList tar_arr, int currentIndex, int target){
        if(currentIndex==arr.length){
            return tar_arr;
        }
        if(arr[currentIndex]==target){
            tar_arr.add(currentIndex);
        }
        currentIndex++;
        return find(arr,tar_arr,currentIndex,target);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,a;
        System.out.println("enter the size of array");
        a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter "+a+" elements in array");
        for (int i = 0; i <a ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no. you want to find in your array");
        n = sc.nextInt();
        ArrayList arr1=new ArrayList();
        ArrayList ans = find(arr,arr1, 0, n);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
