import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        //s=s.replaceAll("[^a-zA-Z]"," ");
       
        s = s.trim();
         if (s.length() == 0) {
            System.out.println(0);
            return ;
        }
        String arr[]=s.split("[!,?.*_'@\\ ]+");
        System.out.println(arr.length);
        for(String str : arr)
            System.out.println(str);
        scan.close();
    }
}

