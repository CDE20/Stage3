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
        int v=s.length();
        if(s.charAt(v-2)=='P'){
            if(s.substring(0,2).equals("12")){
                return s.substring(0,v-2);
            }
            String v1=Integer.toString(Integer.parseInt(s.substring(0,2))+12);
            String k=s.replaceAll(s.substring(0,2),v1);
            return k.substring(0,v-2);
            }
        else{
            String v1;
            System.out.println(s.substring(0,1));
            if(s.substring(0,1).equals("1")){
                v1="00";
            String k=s.replaceAll(s.substring(0,2),v1);
            return k.substring(0,v-2);
            }
            return s.substring(0,v-2);
            
            
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
