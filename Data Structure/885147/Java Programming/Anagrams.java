import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char aArr[] = a.toLowerCase().toCharArray();
        char bArr[] = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
            return false;
        }
         
        java.util.Arrays.sort(aArr);
        java.util.Arrays.sort(bArr);
        
        if(java.util.Arrays.equals(aArr,bArr)){
            return true;
        }
        return false; 
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