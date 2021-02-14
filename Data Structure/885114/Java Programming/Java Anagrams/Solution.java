import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int[] charCountOfA = new int[26];
        int[] charCountOfB = new int[26];
        
        for (char c : a.toCharArray()) {
            charCountOfA[c - 'a']++;
        }
        
        for (char c : b.toCharArray()) {
            charCountOfB[c - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (charCountOfA[i] != charCountOfB[i]) {
                return false;
            }
        }
        
        return true;
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
