import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length() != b.length())
        { 
            return false; 
        } 
        char[] chars = a.toCharArray(); 
        for(char c : chars)
        {
             int index = b.indexOf(c); 
             if(index != -1)
             {
                  b = b.substring(0,index) + b.substring(index +1, b.length()); 
             }
            else
            {
                 return false; 
            }
        }
        
        return b.isEmpty();
    
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
