import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int noElements = in.nextInt();
        
        Stack<Integer> one = new Stack<Integer>();
        Stack<Integer> two = new Stack<Integer>();
        
        int choice;
        
        for (int i = 0 ; i < noElements ; i++) {
            choice = in.nextInt();
            
            if (choice == 1)
            {
                one.push(in.nextInt());
            } 
            else if (choice == 2)
            {
                if(two.isEmpty())
                {
                    while(!one.isEmpty())
                    {
                        two.push(one.pop());
                    }                    
                }
                
                if (!two.isEmpty()){                                
                    two.pop(); 
                }

            }
            else if (choice == 3)
            {       
                if(two.isEmpty())
                {
                    while(!one.isEmpty())
                    {
                        two.push(one.pop());
                    }
                    System.out.println(two.peek());
                } 
                else 
                {
                    System.out.println(two.peek());
                }
            }
        }
    }
}