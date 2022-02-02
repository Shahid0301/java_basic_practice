//code chef starter 24 Avoid contact second question

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AvoidContact
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x,y,count=0;
            x=sc.nextInt();
            y=sc.nextInt();
            int n=x-y;
            if(n==0){
                count=2*y-1;
            }
            else if(n==x){
                count=x;
            }
            else{
                count=n+y*2;
            }
            System.out.println(count);

        }
    }
}
