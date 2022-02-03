/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AnotherConstructive
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i <T ; i++) {
            int x=sc.nextInt();
            int a,b,c,flag=1;
            for (int j = 0; j < 100000; j++) {


                for (int l = 0; l < 1000000; l++) {
                    a = j;
                    b = 3;
                    c = l;
                    int eq;
                    if (a != b && b != c && c != a) {
                        eq = (a | b) & (b | c) & (c | a);
                        if (eq == x) {
                            System.out.println(a + " " + b + " " + c);
                            flag = 0;
                            break;
                        }
                    }


                }
                if(flag==0){
                    break;
                }
            }
        }
    }
}
