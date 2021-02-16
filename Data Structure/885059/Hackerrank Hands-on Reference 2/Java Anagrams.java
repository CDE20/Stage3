import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = false;
        char c1[] = a.toCharArray();
        char c2[] = b.toCharArray();
        if(c1.length == c2.length) {
            for(int i=0; i<c1.length; i++) {
                int count1 = letterCount(c1[i], c1);
                int count2 = letterCount(c1[i], c2);
                //System.out.println(c1[i]+" : "+count1+" "+count2);
                if(count1 == count2) {
                    result = true;
                    continue;
                }
                else {
                    result = false;
                    break;
                }
            }
        }
        return result;                        
    }
    static int letterCount(char ch, char[] chars) {
        int count = 0;
        for(int i=0; i<chars.length; i++) {
            if(Character.toLowerCase(chars[i]) == Character.toLowerCase(ch))
                count++;
        }
        return count;
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
