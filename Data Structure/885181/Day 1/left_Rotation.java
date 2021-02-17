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
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
int l=arr.size();
        int[] b=new int[l];
        int [] a=new int[l];
    //    int[] a=new int[arr.size()];
    //    arr.toArray(a);
        //Integer[] a = (Integer[])arr.toArray(new Integer[arr.size()]);
        //int k;
        
        for(int i=0;i<l;i++)
        {
            a[i]=arr.get(i);
        }
        for(int i=0;i<l;i++)
        {
            int k=((i+l-d)%l);
            b[k]=a[i];
        }
        
        //List<Integer> list = Arrays.asList(b);
        //List<Integer> list = new ArrayList<Integer>(Arrays.toList(b));
        //List<Integer> list =Arrays.stream(b).boxed().collect(Collectors.toList()); 
        List<Integer> List1=new ArrayList<Integer>();
        for(int i=0;i<l;i++)
        {
            List1.add(i, b[i]);
        }
           
            
        return List1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
