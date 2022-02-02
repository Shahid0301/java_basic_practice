//Starter 24 codechef Badminton question
import java.util.Scanner;

public class Badminton {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            int p=sc.nextInt();
            int n=(p/2)+1;
            System.out.println(n);
        }
    }
}
