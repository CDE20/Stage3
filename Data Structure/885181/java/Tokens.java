import java.io.*;
import java.util.*;

public class Solution{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens=s.trim().split("[_@?!.,'\\s]+");
        
        if(s==null || s.trim().equals(""))
        {
            System.out.println("0");
        }
        else{
        System.out.println(tokens.length);
        for(int i = 0; i < tokens.length;i++){
        System.out.println(tokens[i]);
        scan.close();
        }
        
    }
}
}
