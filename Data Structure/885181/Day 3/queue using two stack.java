import java.io.*;
import java.util.*;

public class Solution {

        

    static Stack<Integer> s1 = new Stack<Integer>();
    static Stack<Integer> s2 = new Stack<Integer>();
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++) {
            int input = sc.nextInt();
                if(input == 1) {
                    int element = sc.nextInt();
                    enqueue(s1,element);
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
        if(!s2.isEmpty()) {
            element = s2.peek();
        }
        else {
            while(!s1.isEmpty()) {
                int x = s1.pop();
                s2.push(x);
            }
            element = s2.peek();
        }
        return element;
    }
    private static void dequeue() {
        if(!s2.isEmpty()) {
            s2.pop();
        }
        else if(s2.isEmpty()){
            
            while(!s1.isEmpty()) {
                int x = s1.pop();
                s2.push(x);
            }
            s2.pop();
        }
    }

    private static void enqueue(Stack<Integer> stack,int element) {
        stack.push(element);
        
    }
}