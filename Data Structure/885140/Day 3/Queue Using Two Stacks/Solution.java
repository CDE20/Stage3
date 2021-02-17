import java.io.*;
import java.util.*;

public class Solution {

        

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++) {
            int input = sc.nextInt();
                if(input == 1) {
                    int element = sc.nextInt();
                    enqueue(stack1,element);
                }
                else if(input == 3) {
                    int elementAtTop = showElementAtTop();
                    list.add(elementAtTop);
                }
                else if(input == 2) {
                    dequeue();
                }
            }
        
        for (Integer integer : list) {
            System.out.println(integer);
        }
        }
    
        private static int showElementAtTop() {
        int element = 0;
        if(!stack2.isEmpty()) {
            element = stack2.peek();
        }
        else {
            while(!stack1.isEmpty()) {
                int x = stack1.pop();
                stack2.push(x);
            }
            element = stack2.peek();
        }
        return element;
    }
    private static void dequeue() {
        if(!stack2.isEmpty()) {
            stack2.pop();
        }
        else if(stack2.isEmpty()){
            
            while(!stack1.isEmpty()) {
                int x = stack1.pop();
                stack2.push(x);
            }
            stack2.pop();
        }
    }

    private static void enqueue(Stack<Integer> stack,int element) {
        stack.push(element);
        
    }
}
