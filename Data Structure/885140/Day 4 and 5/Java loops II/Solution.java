import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum = 0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            sum = a;
            int arr[] = new int[n];
            for(int j = 1;j<=n;j++){
                
                sum += (Math.pow(2,j-1)*b);
                arr[j-1] = sum;
            }
            for(int array : arr){
                System.out.print(array + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
