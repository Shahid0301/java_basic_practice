//Q. Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
//        They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].
//
//        Example
//
//        Imagine the size of both the arrays are 5
//
//        myarr1[]  values  {3,4,1,2,2}
//        myarr2[] values  {1,2,1,3,1}
//
//        Output :
//        1,0,5,2,2

import java.util.Scanner;
class Arr{
    static int[] counting(int arr1[],int arr2[]){
        int result[]=new int[arr1.length];
        int i=0;
        for (int a:arr1
             ) {int count=0;
            for (int b:arr2
                 ) {
                if (b >= a) {
                    count = count + 1;
                }
            }
            result[i]=count;
            i++;
        }
    return result;
    }
}
public class DuplicateValueInArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no. of elements you want in array");
        int n=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        System.out.println("enter "+n+"elements you want in arr1 ");
        for (int i = 0; i < n ; i++) {
            arr1[i]=s.nextInt();
        }
        System.out.println("enter "+n+"elements you want in arr2 ");
        for (int i = 0; i < n ; i++) {
            arr2[i]=s.nextInt();
        }
        int[] result=Arr.counting(arr1,arr2);
        for (int a:result
             ) {
            System.out.print(a+",");
        }
    }
}
