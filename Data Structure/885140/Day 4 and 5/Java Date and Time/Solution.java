import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
            String dayofTheWeek = "";
        Date date = new Date(year-1900 ,month-1, day);
        int i = date.getDay();
        if (i == 0) {
            dayofTheWeek = "SUNDAY";
        } else if (i == 1) {
            dayofTheWeek = "MONDAY";
        } else if (i == 2) {
            dayofTheWeek = "TUESDAY";
        } else if (i == 3) {
            dayofTheWeek = "WEDNESDAY";
        } else if (i == 4) {
            dayofTheWeek = "THURSDAY";
        } else if (i == 5) {
            dayofTheWeek = "FRIDAY";
        } else
            dayofTheWeek = "SATURDAY";

            return dayofTheWeek;
    }
        
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
