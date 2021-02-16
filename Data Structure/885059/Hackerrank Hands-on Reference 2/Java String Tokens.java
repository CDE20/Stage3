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
        } else {
            String str[] = s.split("[!,?._'@ ]+");
            System.out.println(str.length);
            for(String st:str) {
                System.out.println(st);
            }
        }
        scan.close();
    }
}

