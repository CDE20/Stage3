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
        boolean flag=true;
        Stack<Character> brackets = new Stack<>();
        for(long i=0;i<s.length();i++){
            char ch = s.charAt((int)i);
            if(ch=='{'||ch=='['||ch=='('){
                brackets.push(ch);
            }
            else{
                try{
                if(ch=='}'){
                    if('{'!=brackets.pop()){
                        flag=false;
                        break;
                    }
                }
                else if(ch==']'){
                    if('['!=brackets.pop()){
                        flag=false;
                        break;
                    }
                }
                else if(ch==')'){
                    if('('!=brackets.pop()){
                        flag=false;
                        break;
                    }
                }
                }catch(Exception e){
                    flag=false;
                }
            }
        }
        
        if(flag&&brackets.empty()){
            return "YES";
        }
        else{
            return "NO";
        }
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
