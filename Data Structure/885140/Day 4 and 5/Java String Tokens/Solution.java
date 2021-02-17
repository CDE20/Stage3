import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] split = s.split("[_,.:';?@!]+");

        List<String> list = new LinkedList<>();
        for(int i= 0;i<split.length;i++) {
            String[] split2 = split[i].trim().split(" ");
            for(int j = 0;j<split2.length;j++) {
                if(!split2[j].isEmpty())
                    list.add(split2[j]);
            }
        }
        
        
       System.out.println(list.size());
        for(String string : list){
                System.out.println(string);
        } 
        

        scan.close();
    }
}

