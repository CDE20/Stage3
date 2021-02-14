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
        // try {
        //     DateFormat dateFormat = new SimpleDateFormat("hh:mm:ssa");
        //     DateFormat dateFormatResult = new SimpleDateFormat("HH:mm:ss");
        //     Date date = dateFormat.parse(s);
            
        //     return dateFormatResult.format(date);
            
        // } catch (ParseException e) {
        //     e.printStackTrace();
        // }
        
        // return null;
         
        if (s.substring(0, 2).equals("12") && s.contains("AM"))
            return "00" + s.substring(2, 8);
        if (s.substring(0, 2).equals("12") && s.contains("PM"))
            return "12" + s.substring(2, 8);
            
        if (s.contains("PM"))
            return (Integer.parseInt(s.substring(0,2)) + 12) + s.substring(2, 8);
        
        return s.substring(0,8);
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
