//Q. Write a program to input the elements of a two- dimensional array. Then from this array, make two arrays one that stores all odd elements of the two-dimensional array and the other that stores all even elements of the array. 
//        Note:-  Resulting arrays will be of ArrayList type
import java.util.ArrayList;
import java.util.Scanner;
class EvenOdd{
    public static ArrayList even(int arr[][]){
        ArrayList even=new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(arr[i][j]%2==0){
                    even.add(arr[i][j]);
                }

            }

        }
        return even;
    }
    public static ArrayList odd(int arr[][]){
        ArrayList odd =new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(arr[i][j]%2!=0){
                    odd.add(arr[i][j]);
                }

            }

        }
        return odd;
    }
}
public class ArrayEvenOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int m=s.nextInt();
        System.out.println("enter the no. of column");
        int n=s.nextInt();
        int arr[][]=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        ArrayList even=EvenOdd.even(arr);
        ArrayList odd=EvenOdd.odd(arr);
        System.out.println("Even elements arrayList");
        for (int i = 0; i < even.size(); i++) {
            System.out.print(even.get(i)+" ");

        }
        System.out.println("\n Odd elements arrayList");
        for (int i = 0; i <odd.size(); i++) {
            System.out.print(odd.get(i));

        }

    }
}
