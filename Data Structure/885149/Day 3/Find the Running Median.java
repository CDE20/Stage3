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
        int size = a.length;
        int count=0;
        List<Integer> eleList = new ArrayList<Integer>();
        double medarr[]=new double[size];
        medarr[0]=a[0];
        for(int i=0;i<size;i++){
            eleList.add(a[i]);
            Collections.sort(eleList);
            int tempPos=eleList.size()/2;
            if(eleList.size()%2==1){
                medarr[i]=eleList.get(tempPos);
            }
            else{
                double temp =(double) (eleList.get(tempPos)+eleList.get(tempPos-1))/2;
                //int j=tempPos-1;
                //System.out.println((eleList.get(tempPos)+eleList.get(tempPos-1)));
                medarr[i]=temp;
            }            
        }
        return medarr;

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
