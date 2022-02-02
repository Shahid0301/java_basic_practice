//starter 24 EVM hack question codechef

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EvmHack
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a,b,c,p,q,r;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            p=sc.nextInt();
            q=sc.nextInt();
            r=sc.nextInt();
            int x,y,z;
            x=p-a;
            y=q-b;
            z=r-c;
            int max=Math.max(x,Math.max(y,z));
            if(max==x){
                a=p;
            }
            else if(max==y){
                b=q;
            }
            else{
                c=r;
            }
            int m=(p+q+r)/2;
            int n=a+b+c;
            if(n>m){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
