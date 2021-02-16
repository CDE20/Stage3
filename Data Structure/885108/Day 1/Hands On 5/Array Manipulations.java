import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
       /* int total = 0;
        int[] array = new int[n+1];
        for(int i = 0;i < queries.length;i++){
            int a = queries[i][0],b = queries[i][1],k = queries[i][2];
            for(int j = a;j <= b;j++)
                array[j]+= k;
        }
        Arrays.sort(array);
        return array[n];*/
        int m = queries.length;
        long[] array = new long[n+1];
        int a,b,k,i = 0;
        while(m-- > 0){
           a =queries[i][0]; 
           b = queries[i][1];
           k = queries[i++][2];
           array[a-1] += k;
           array[b] -= k;
        }
        long sum = 0;
        long max = 0;
        for(int j = 0;j < n;j++){
            sum += array[j];
            max = Math.max(max,sum);
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
