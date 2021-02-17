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
            DecimalFormat formatter = new DecimalFormat("00");
            int hour,minutes,seconds;
             if(s.contains("AM")){
                 String[] split = s.split(":");
                 hour = Integer.parseInt(split[0]);
                 minutes = Integer.parseInt(split[1]);
                 seconds = Integer.parseInt(split[2].substring(0, 2));
                 if(hour==12) {
                     hour=00;
                 }
             }
             else {
                 String[] split = s.split(":");
                 hour = Integer.parseInt(split[0]);
                 minutes = Integer.parseInt(split[1]);
                 seconds = Integer.parseInt(split[2].substring(0, 2));
                 if(hour!=12) {
                     hour += 12;
                 }
             }
             return formatter.format(hour)+":"+formatter.format(minutes)+":"+formatter.format(seconds);
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
