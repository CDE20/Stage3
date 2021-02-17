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
        double med = a[0]; 
        double[] median = new double[a.length];  
        PriorityQueue<Integer> smaller = new PriorityQueue<> 
        (Collections.reverseOrder()); 
        PriorityQueue<Integer> greater = new PriorityQueue<>(); 
        smaller.add(a[0]);
        median[0] = a[0]; 
        System.out.println(med); 
        for(int i = 1; i < a.length; i++){ 
            int x = a[i]; 
            if(smaller.size() > greater.size()){ 
                if(x < med){ 
                    greater.add(smaller.remove()); 
                    smaller.add(x); 
                } 
                else
                    greater.add(x); 
                med = (double)(smaller.peek() + greater.peek())/2; 
            } 
            else if(smaller.size() == greater.size()){ 
                if(x < med){ 
                    smaller.add(x); 
                    med = (double)smaller.peek(); 
                } 
                else{ 
                    greater.add(x); 
                    med = (double)greater.peek(); 
                } 
            } 
            else{ 
                if(x > med) 
                { 
                    smaller.add(greater.remove()); 
                    greater.add(x); 
                } 
                else
                    smaller.add(x); 
                med = (double)(smaller.peek() + greater.peek())/2;   
            } 
            median[i] = med;
        }
        return median;
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
