import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int lcm = a.get(0);
        int hcf = b.get(0);
        
        //LCM of 1st query
        for(int i=1; i<a.size(); i++) {
            lcm = LCM(lcm, a.get(i));
        }   
        
        //HCF of 2nd Query
        for(int i=1; i<b.size(); i++) {
            hcf = HCF(hcf, b.get(i));
        }   
        int count = 0;
        int i = 2;
        int temp = lcm;
        while(lcm<=hcf) {
            System.out.println("Lcm: "+lcm+" Hcf:"+hcf+" i:"+i);
            int flag = 0;
            for(int x: b) {
                if(x%lcm != 0) {
                    flag = 1; 
                    break;
                }
            }
            if(flag == 0) {
                count++;
            }
            lcm = temp*i;
            i++;
        }
        
        return count;
    }
    static int LCM(int a, int b)
    {
        return (a / HCF(a, b)) * b;
    }
    public static int HCF(int n1, int n2) {
        while(n2 != 0){
            int t = n2;
            n2 = n1%n2;
            n1 = t;
        }
        return n1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
