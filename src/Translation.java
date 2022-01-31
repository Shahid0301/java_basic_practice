//For checking if the t is reverse of s or not
import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int flag=1;
        for (int i = 0; i < t.length(); i++) {

            if(s.charAt(i)!=t.charAt(t.length()-1-i)){
                flag=0;
                break;
        }

        }
        if (flag==0){
            System.out.println("NO");

        }
        else{
            System.out.println("YES");
        }
    }
}
