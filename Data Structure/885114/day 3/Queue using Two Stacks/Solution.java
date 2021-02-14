
import java.io.*;
import java.util.*;

public class Solution {
    
    private static int[] stack1 = new int[100001];
    private static int top1 = -1;
    private static int[] stack2 = new int[100001];
    private static int top2 = -1;
    
    private static void pushStack1(int i) {
        stack1[++top1] = i;
    }
    private static void pushStack2(int i) {
        stack2[++top2] = i;
    }
    
    private static int popStack1() {
        return stack1[top1--];
    }
    private static int popStack2() {
        return stack2[top2--];
    }
    
    private static void enqueue(int i) {
        pushStack1(i);
    }
    
    private static int dequeue() {
        if (top2 == -1) {
            while (top1 != -1) {
                pushStack2(popStack1());
            }
        }

        if (top2 == -1) {
            System.out.println("Queue is empty");
            return -1;
        }

        return popStack2();
    }

    private static int peek() {
        if (top2 == -1) {
            while (top1 != -1) {
                pushStack2(popStack1());
            }
        }

        if (top2 == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        return stack2[top2];
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter q");
        int q = Integer.parseInt(sc.nextLine());
        
        while (q-- > 0) {
            String input = sc.nextLine();
            String[] in = input.split(" ");
            
            int i = Integer.parseInt(in[0]);
            int number = 0;
            if (in.length > 1) {
                number = Integer.parseInt(in[1]);
            }
            
            if (i == 1) {
                enqueue(number);
            }
            
            if (i == 2) {
                dequeue();
            }
            
            if (i == 3) {
                System.out.println(peek());
            }
            // System.out.println(Arrays.toString(stack1));
            // System.out.println(Arrays.toString(stack2));
        }
        
    }
}
