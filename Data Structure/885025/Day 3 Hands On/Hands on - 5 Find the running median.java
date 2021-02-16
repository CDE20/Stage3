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
         PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((o1, o2) -> Integer.compare(o2, o1));
        double[] result = new double[a.length];
        for(int i=0; i<a.length; i++){
            if(!minHeap.isEmpty() && minHeap.peek() <= a[i]){
                minHeap.add(a[i]);
            }else{
                maxHeap.add(a[i]);
            }
            
            if(maxHeap.size() > minHeap.size()){
                minHeap.add(maxHeap.poll());
            }else if(maxHeap.size() < minHeap.size()){
                maxHeap.add(minHeap.poll());
            }
            
            
            if(minHeap.size() == maxHeap.size()){
                result[i] = (minHeap.peek()+maxHeap.peek())/2.0;
            }else if(minHeap.size() > maxHeap.size()){
                result[i] = (double) minHeap.peek();
            }else{
                result[i] = (double) maxHeap.peek();
            }
        }
        return result;  

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
