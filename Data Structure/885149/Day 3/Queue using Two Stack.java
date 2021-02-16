import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            int instruction=sc.nextInt();
            if(instruction==1){
                int value = sc.nextInt();
                q.offer(value);
                
            }
            else if(instruction==2){
                q.remove();
            }
            else{
                System.out.println(q.peek());
            }
        }
    }
}
