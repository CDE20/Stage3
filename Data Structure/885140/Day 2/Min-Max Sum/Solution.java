import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        long sum = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            sum += arr[i];
        }
        
        min = sum;
        sum = 0;
        for(int i = arr.length-1;i>0;i--){
            sum += arr[i];
        }

        max = sum;
        System.out.println(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
