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
            int sum=a;
            for(int k=0,j=1;k<n;j=j*2,k++){
                sum=sum+(j*b);
                System.out.print(sum+" ");
            }
    System.out.println("");
        }
        in.close();
    }
}
