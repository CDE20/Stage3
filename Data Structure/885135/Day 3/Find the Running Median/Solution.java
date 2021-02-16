import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>               (Comparator.reverseOrder());
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    static double[] runningMedian(int[] a) {
        /*
         * Write your code here.
         */
        //Math.round((num / sum * 100) * 10) / 10.0;
        double[] res=new double[a.length];
        for(int i=0;i<a.length;i++){
            insert(a[i]);
            res[i]=getMedian();
        }
        return res;
    }
    
    public static void insert(int a){
        
        if(maxHeap.isEmpty()||a<maxHeap.peek()){
            maxHeap.add(a);
        }
        else{
            minHeap.add(a);
        }
        if(maxHeap.size()-minHeap.size()>1){
            minHeap.add(maxHeap.peek());
            maxHeap.remove();
        }
        else if(minHeap.size()-maxHeap.size()>1){
            maxHeap.add(minHeap.peek());
            minHeap.remove();
        }
    }
    
    public static double getMedian(){
        if(maxHeap.size()>minHeap.size())
            return maxHeap.peek();
        else if(maxHeap.size()<minHeap.size())
            return minHeap.peek();
        else{
            System.out.println("in else");
            double a=maxHeap.peek();
            double b=minHeap.peek();
            return (a+b)/2;
        }
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
