import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    // Complete the miniMaxSum function below.
   static void miniMaxSum(int[] arr) {
    int l=arr.length;
     long sum = 0;
    int min = arr[0];
    int max = arr[0];
    for(int i=0;i<l;i++){
        sum=sum+arr[i];
    }
    for(int i=0;i<l;i++){
        if(arr[i]<min){
            min = arr[i];
        }
        if(arr[i]>max){
            max = arr[i];
        }
      }
    long mn=sum-max;
    long mx=sum-min;
    System.out.println(mn+" "+mx);
   }
  /*  public static int[] sorting(int[] arr)
    {
        Arrays.sort(arr);
        
    
        return  arr;
    } */

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
