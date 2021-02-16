import java.io.*;
import java.util.*;

public class Solution {

    public static Stack<Integer> s1=new Stack<Integer>();
    public static Stack<Integer> s2=new Stack<Integer>();
    public static void enqueue(int data) {
        s1.push(data);
    }
    
    public static void dequeue() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty())
                s2.push(s1.pop());
        }
        s2.pop();
    }
    
    public static void print() {
        if(s2.isEmpty()) {
            while(!s1.isEmpty())
                s2.push(s1.pop());
        }
        System.out.println(s2.peek());
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println("****");
        while(n>0) {
            int query=sc.nextInt();
            switch(query) {
            case 1:
                int data=sc.nextInt();
                enqueue(data);
                break;
            case 2:
                dequeue();
                break;
            case 3:
                print();
                break;
            }
                
            n--;
        }
    }
}
