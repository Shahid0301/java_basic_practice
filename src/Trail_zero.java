import java.util.Scanner;

//finding the no of trailing zeroes in a factorial
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
        String s1=String.valueOf(fac);
        int count=0;
        for (int i = s1.length(); i >=1; i--) {
            if(s1.charAt(i-1)=='0'){
                count=count+1;
            }
            else{
                break;
            }
        }

        System.out.println(count);
        }
    }
    //not working properly


