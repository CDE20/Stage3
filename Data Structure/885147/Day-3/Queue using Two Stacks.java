import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = sc.nextInt();
            if (operation == 1) {               
                queue.enqueue(sc.nextInt());
            } else if (operation == 2) {        
                queue.dequeue();
            } else if (operation == 3) {                        System.out.println(queue.peek());
            }
        }
        sc.close();
    }
    
    public static class MyQueue<Integer> {
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();
        
        public void enqueue(Integer num) {
            stack1.push(num);
        }
        
        public Integer dequeue() {
            if (size() == 0) {
                return null;
            }
            if (stack2.isEmpty()) {
                shiftStacks();
            }
            return stack2.pop();
        }
        
        public Integer peek() {
            if (size() == 0) {
                return null;
            }
            if (stack2.isEmpty()) {
                shiftStacks();
            }
            return stack2.peek();
        }
        
        private void shiftStacks() {
            if (stack2.isEmpty()) { 
                while ( ! stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
        
        public int size() {
            return stack1.size() + stack2.size();
        }
        
    }
}