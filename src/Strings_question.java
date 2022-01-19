import java.util.Scanner;

//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings
public class Strings_question {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no. of inputs you want");
        int n=s.nextInt(),count=0;
        String arr[]=new String[n];
        System.out.println("enter the string");
        for (int i = 0; i < n ; i++) {
            arr[i]=s.next();
            count+=arr[i].length();

        }
        System.out.println(count);
    }
}
