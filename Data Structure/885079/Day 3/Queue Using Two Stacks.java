import java.io.*;
import java.util.*;

public class Solution {

    private static Stack<String> stack1 = new Stack<>();
    private static Stack<String> stack2 = new Stack<>();
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<q; i++) {
            String input = sc.nextLine();
            
            //System.out.println("\n------Input:" + input);
            if(input.charAt(0) == '1') {
                String temp[] = input.split(" ");
                enqueue(temp[1]);
            } else if(input.charAt(0) == '2') {
                dequeue();
            } else {
                printQueue();
            }
            //System.out.println("------Stacks------");
            //PrintStack();
        }
    }
    
    public static void enqueue(String n) {
        stack1.push(n);
    }
    public static void dequeue() {
        if(stack2.empty())
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        if(!stack2.empty())
            stack2.pop();
    }
    public static void printQueue() {
        if(stack2.empty())
            while(!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        System.out.println(stack2.peek());
    }
    
}