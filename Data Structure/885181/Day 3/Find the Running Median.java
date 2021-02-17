import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.Arrays;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] arr) {
        /*
         * Write your code here.
         */
    int n= arr.length;
    int temp=0;
    double values[] = new double[n];
    int a[]=new int[n];
        for (int i = 0; i< n; i++) {
             a[i]=arr[i];
            int j=i-1;
                 int k=a[i];
                 if(j>=0)
                 while(k>a[j]&&j>=0)
                 {
                     a[j+1]=a[j];
                     j--;
                     if(j<0)
                         break;
                 }
                 a[j+1]=k;
            if(i%2==0)            
                {
                
                values[i] = a[temp];
                temp++;
                }
            else
            {
                
                values[i] = (float)((a[temp-1]+a[temp])/2.0);
            }
        }
        return values;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}