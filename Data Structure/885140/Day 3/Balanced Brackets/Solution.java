import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
           static String isBalanced(String s) {
        String response="";
        int k = -1;
        char c;
        char[] record = new char[s.length()];
        if(s.length()%2!=0)
            response = "NO";
            else if(s.charAt(0)== ')' || s.charAt(0)== '}' || s.charAt(0)== ']'){
                response = "NO";
            }
            else {
                for(int i = 0;i<s.length();i++) {
                    c = s.charAt(i);
                    if(c=='(' || c=='{' || c=='[') {
                        k++;
                        record[k] = c;
                    }
                    else {
                        if(k==-1) {
                            k++;
                            break;
                        }
                        
                        if((c == '}' && record[k] == '{') || (c == ')' && record[k] == '(') || (c==']' && record[k] == '[')) {
                            k--;
                        }
                    }
                }
                if(k==-1)
                    response = "YES";
                else
                    response = "NO";
            }
        return response;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
