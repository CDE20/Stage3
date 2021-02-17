import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.text.DecimalFormat;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

             DecimalFormat formatter = new DecimalFormat("00");
        String[] str = s.split(":", 3); 
        String returnstr=null;
        int hh=Integer.parseInt(str[0]);
        String mm=str[1];
        String ss=str[2];
        if(ss.contains("PM"))
        {
            if(hh==12)
            {
                hh=12;
            }
            else {
                hh=hh+12;
            }
            String st=String.valueOf(hh);
            String st1=mm;
            
            
            String st2=ss.substring(0, 2);
             returnstr=st+":"+st1+":"+st2;
            
        }
       // double a=00;
        if(ss.contains("AM"))
        {
            if(hh==12)
            {
                hh=00;
            }
            else {
                hh=hh;
            }
        
            String stt=String.valueOf(hh);
            String stt1=mm;
            int i =Integer.parseInt(stt);
            String stt2=ss.substring(0, 2);
            returnstr=formatter.format(i)+":"+stt1+":"+stt2;
            
        }
        return returnstr;
        







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
