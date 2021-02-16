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
         String time = s.substring(0,8);
         String frmt = s.substring(8,10);
         
         String array[] = time.split(":");
         
         if(frmt.equals("PM")){
             if(!array[0].equals("12"))
               { int value = Integer.parseInt(array[0])+12;
                 return value+":"+array[1]+":"+array[2];
               }
               return time;
         }
         
         if(frmt.equals("AM")){
             if(array[0].equals("12")){
                 return "00"+":"+array[1]+":"+array[2];
             }
             //System.out.printn()
             return time;
         }
        return time;
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
