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
        long[] arr1 = new long[5];
        for(int i = 0;i < arr.length;i++)
            arr1[i] = arr[i];
        long[] array = new long[5];
        array[0] = arr1[0] + arr1[1] + arr1[2] + arr1[3] ;//except 5
        array[1] = arr1[4] + arr1[1] + arr1[2] + arr1[3] ;//except 1
        array[2] = arr1[0] + arr1[1] + arr1[4] + arr1[3] ;//except 3
        array[3] = arr1[0] + arr1[4] + arr1[2] + arr1[3] ;//except 2
        array[4] = arr1[0] + arr1[1] + arr1[2] + arr1[4] ;//excpet 4
        Arrays.sort(array);
        System.out.println(array[0]+" "+array[4]);

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
