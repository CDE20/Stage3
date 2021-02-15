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
         try{
         DateFormat input = new SimpleDateFormat("hh:mm:ssaa");
         Date inputDate = input.parse(s);
         DateFormat output = new SimpleDateFormat("HH:mm:ss");
         String outputDate = output.format(inputDate);
         
         return outputDate;
        }catch(Exception e){
            return e.getMessage();
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
