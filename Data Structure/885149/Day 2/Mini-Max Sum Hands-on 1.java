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
        int size=arr.length;
        long min=0,max=0;
        int sum=0;
        Arrays.sort(arr);
        if(size==1){
            min=arr[0];
            max=arr[0];
        }
        else{
        for(int i=0;i<size;i++){
            if(i<(size-1)){
                min=min+arr[i];
            }
           if(arr[i]>0&&i>0) {
            max=max+arr[i];
            }
        }
       // max=max-arr[0];
    }
        System.out.println(min+" "+max);

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
