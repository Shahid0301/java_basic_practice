//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings
import java.util.Scanner;
class Strings_question {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no. of inputs you want");
        int n=s.nextInt(),count=0;
        String arr[]=new String[n];
        s.nextLine();
        for (int i = 0; i < n ; i++) {
            System.out.println("enter the string");
            arr[i]=s.nextLine();

            count+=arr[i].length();

        }
        System.out.println(count);
    }
}



