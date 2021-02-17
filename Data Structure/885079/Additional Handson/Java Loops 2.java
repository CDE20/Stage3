import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int i,i1 ;
        for(i=0;i<t;i++){
        int v=0;
            int a=in.nextInt();
        int b=in.nextInt();
     int n=in.nextInt();
            v=v+a;
            for(i1=0;i1<n;i1++){
                int v2=(int)Math.pow(2,i1); 
            int v1=(v2*b);
                v=v+v1;
                          System.out.print(v+" ");     
      
        }
            System.out.println();
        }
    }
}