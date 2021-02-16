import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String time[] = s.split(":");
        char temp[] = time[2].toCharArray();
        String sec = temp[0]+""+temp[1];
        String segment = temp[2]+""+temp[3];
        if(segment.equals("AM")) {
            if(time[0].equals("12")) {
                time[0] = "00";
            }
        } else {
            if(!time[0].equals("12")) {
                int hr = Integer.parseInt(time[0]);
                hr = (hr+12)%24;
                if(hr<10) {
                    time[0] = "0"+hr;            
                }
                time[0] = String.valueOf(hr);
            }
        }
        
        return time[0]+":"+time[1]+":"+sec;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
