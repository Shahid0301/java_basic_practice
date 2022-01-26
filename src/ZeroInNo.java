//To find the number of zero in a number
import java.util.Scanner;

public class ZeroInNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=zero(n,0);
        System.out.println("No of zero are: "+ans);
    }

    private static int zero(int n,int zeCount) {
                if(n==0){
                    return zeCount;
                }
                if(n%10==0){
                    zeCount++;
                }
                return zero(n/10,zeCount);
    }
}
