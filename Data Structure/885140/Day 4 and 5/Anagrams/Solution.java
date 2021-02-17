import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char a_Array[] = a.toLowerCase().toCharArray();
        char b_Array[] = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
            return false;
        }
         
        java.util.Arrays.sort(a_Array);
        java.util.Arrays.sort(b_Array);
        
        return java.util.Arrays.equals(a_Array,b_Array); 
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        if(ret==true)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
© 2021 GitHub, Inc.