import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        String delimiter = "[!,?._'@\\s]+";
        if(s.trim().length()>0){
            String tokens[] = s.trim().split(delimiter);
            System.out.println(tokens.length);
            
            for(String token : tokens) {
                System.out.println(token);
            }
        }
        else{
            System.out.println(0);
            return;
        }
        scan.close();
    }
}
