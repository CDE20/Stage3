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

    public static String findDay(int month, int day, int year){
        
        String input=day+"-"+month+"-"+year;
        Calendar c = Calendar.getInstance();
        c.set(year, month-1,day);
        int d1=c.get(Calendar.DAY_OF_WEEK);
      //  System.out.println(day1);
        //return ""+day1;
        
        String day1 = "";
    switch(d1){
    case 1:
        day1="SUNDAY";
        break;
    case 2:
        day1="MONDAY";
        break;
    case 3:
        day1="TUESDAY";
        break;
    case 4:
        day1="WEDNESDAY";
        break;
    case 5:
        day1="THURSDAY";
        break;
    case 6:
        day1="FRIDAY";
        break;
    case 7:
        day1="SATURDAY";
        break;
    }
    return day1;
    }

}

public class Solution {