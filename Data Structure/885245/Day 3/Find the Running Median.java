import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        /*
         * Write your code here.
         */
    int n=a.length;
    int temp=0;
    double values[]=new double[n];
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=a[i];
        int j=i-1;
        int k=arr[i];
        if(j>=0)
            while(k>arr[j]&&j>=0)
                 {
                     arr[j+1]=arr[j];
                     j--;
                     if(j<0)
                         break;
                 }
                 arr[j+1]=k;
            if(i%2==0)            
                {
                
                values[i] = arr[temp];
                temp++;
                }
            else
            {
                
                values[i] = (float)((arr[temp-1]+arr[temp])/2.0);
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
