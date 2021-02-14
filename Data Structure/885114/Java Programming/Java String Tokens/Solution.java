import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s = s.trim();
        
        if (s.isEmpty()) {
            System.out.println("0");
        }
        
        else {
            
            String[] tokens = s.split("[\\s!,?._'@]+");
            
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        
        scan.close();
    }
}

