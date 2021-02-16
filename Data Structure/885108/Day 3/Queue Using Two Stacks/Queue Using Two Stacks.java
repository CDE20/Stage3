import java.io.*;
import java.util.*;

public class Solution {

    public static void enqueue(Stack s1,int x){
        s1.push(x);
    }
    
    public static void dequeue(Stack s1,Stack s2){
        if(s2.empty()){
            while(!s1.empty()){
                Integer x = (Integer)s1.pop();
                s2.push(x);
            }
            s2.pop();
        }
        else{
            s2.pop();
        }
    }
    
    public static int print(Stack s1, Stack s2){
        if(s2.empty()){
            while(!s1.empty()){
                Integer x = (Integer) s1.pop();
                s2.push(x);
            }
            return (Integer)s2.peek();
        }
        else{
            return (Integer)s2.peek();
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int q  = sc.nextInt();
        String s;
        for(int i = 0;i < q+1;i++){
            s = sc.nextLine();
            String[] array = s.split(" ");
            if(array[0].equals("1")){
                enqueue(s1,Integer.parseInt(array[1]));
            }
            else if(array[0].equals("2")){
                dequeue(s1,s2);
            }
            else if(array[0].equals("3")){
                System.out.println(print(s1,s2));
            }
            //System.out.println(s1+"         "+s2);   
        }    
    }
}
