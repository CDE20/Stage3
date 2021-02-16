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
        int n = a.length;

        double[] medianArr = new double[n];
        int i = 0;

        // max-heap
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        // min-heap
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();

        double median = 0.0;

        for(int j=0; j<n; j++) {
            int x = a[j];
            if(min.size() == max.size()) {
                if(x < median) {
                    max.add(x);
                    median = (double)max.peek();
                    medianArr[i] = median;
                    i += 1;
                } else {
                    min.add(x);
                    median = (double)min.peek();
                    medianArr[i] = median;
                    i += 1;
                }
            } else if (max.size() > min.size()) {
                if(x < median) {
                    min.add(max.remove());
                    max.add(x);
                } else {
                    min.add(x);
                }
                median = (double)(max.peek() + min.peek())/2;
                medianArr[i] = median;
                i += 1;
            } else {
                if(x > median) {
                    max.add(min.remove());
                    min.add(x);
                } else {
                    max.add(x);
                }
                median = (double)(max.peek() + min.peek())/2;
                medianArr[i] = median;
                i += 1;
            }
        }

        return medianArr;
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
