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
        if(s.contains("AM")){
            if(s.contains("12"))
                s = "00" + s.substring(2,8);
            else 
                s = s.substring(0,8);     
        }
        else{
            if(s.contains("12"))
                s = s.substring(0,8);
            else 
                s = (Integer.parseInt(s.substring(0,2)) + 12) +  s.substring(2,8);
        }
        return s;
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
