import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int p=0; p<n; p++) {
                sum += Math.pow(2, p)*b;
                System.out.print(sum + " ");
            }
            System.out.println();
            
        }
        in.close();
    }
}