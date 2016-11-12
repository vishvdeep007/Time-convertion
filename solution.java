import java.io.*;
import java.util.*;

public class solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(":");
        //split the time into four formate for HH:MM:SS 
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0,2);
        String check = time[2].substring(2,4);

        //convert 12 hours time into 24 hours time
        //check the condition is AM or PM
        if(check.equals("AM")){
            System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
        }else{
            System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))+":"+minutes+":"+seconds);
        }
    }
}