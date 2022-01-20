import java.util.Scanner;

//finding the no of trailing zeroes in a factorial and also find the factorial
 class fun {
    public static int fac(int n){
        if(n==0) {
            int a=1;
            return a;
        }
        int a=1;
        for (int i = n; i >1 ; i--) {
            a*=i;
        }
        return a;
    }
}
public class Trail_zero {
    public static void main(String[] args) {
        fun obj=new fun();

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fac=obj.fac(n);
        int count=0;
        for (int i = 5; n/i>=1; i*=5) {
            count+=n/i;
        }
        System.out.println(fac);
        System.out.println(count);
        }

    }
    //now algo change


