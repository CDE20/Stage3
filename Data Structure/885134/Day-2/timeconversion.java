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
        int hr=Integer.parseInt(s.substring(0,2));
        String min=s.substring(2,8);
        //String sec=s.substring(6,8);
        String format=s.substring(8,10);
        
        if(format.equals("AM"))
        {
            if(hr==12)
            {
                String time="00"+min;
                return time;
            }
            return s.substring(0,8);
        }
        else
        {
            if(hr==12)
            {
                return s.substring(0,8);
            }
            hr=hr+12;
            String time=(String.valueOf(hr))+min;
            return time;
        }
        
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
