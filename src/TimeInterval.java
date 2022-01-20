//when the time is in 24 hr employee's have meeting at different time checking if there is any clashes at different time intervals
import java.util.Scanner;
import java.util.*;

class Time {
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public static boolean canAttendMeeting(Time[] arr){
        //creating different arrays for the start and end time
        int start[]=new int[arr.length];
        int end[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            start[i]=arr[i].start;
            end[i]=arr[i].end;
        }
        //sorted arrays
       Arrays.sort(start);
        Arrays.sort(end);
        //comparing
        for (int i = 0; i < arr.length-1; i++) {
            if (start[i + 1] <=end[i]) {
                return false;
            }
        }

                return true;



    }
}
public class TimeInterval{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("input the no. of employee's time interval");
        int n=s.nextInt();
        //creating array for storing objects of time class
        Time arr[]=new Time[n];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Input the time interval START and END in 24 hr format");
            arr[i]=new Time(s.nextInt(), s.nextInt());

        }
        //result
        boolean re=Time.canAttendMeeting(arr);
        if(re==true){
            System.out.println("meeting can held , no clashes");
        }
        else{
            System.out.println("meeting cannot be held, some clashes");
        }
    }
}
