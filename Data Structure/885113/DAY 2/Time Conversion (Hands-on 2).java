import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
   
    String time=s.charAt(0)+""+s.charAt(1);
    String time1=s.substring(8,10); 
    String s1="";
    int t=Integer.parseInt(time);
    if(((t>=12 && time1.equals("PM"))) || (t<12 && time1.equals("AM")) )
        return s.substring(0,s.length()-2);
                
    else if(t<12 && time1.equals("PM") ){
        t=(t+12);
        s1=Integer.toString(t);
        System.out.println("s1 is"+s1);
    } 
    
    else if(t>=12 && time1.equals("AM") ){
        t=(t-12);
        if(t>=10)
        s1=Integer.toString(t);
        else
        s1="0"+Integer.toString(t);
    }
     
    s=s1+s.substring(2,s.length()-2);
    System.out.println(s);
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
