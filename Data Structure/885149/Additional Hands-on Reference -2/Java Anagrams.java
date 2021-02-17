import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int asize=a.length();
        int bsize=b.length();
        
        if(asize!=bsize){
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        char arr[] = new char[asize];
        char brr[] = new char[bsize];
        for(int i=0;i<asize;i++){
            arr[i]=a.charAt(i);
            brr[i]=b.charAt(i);
            
        }
        java.util.Arrays.sort(arr);
        java.util.Arrays.sort(brr);
        for(int i=0;i<asize;i++){
            if(arr[i]!=brr[i]){
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
