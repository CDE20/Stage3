import java.util.*;
interface AdvancedArithmetic{
  int divisor_sum(int n);
}

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum=n;
        for(int i=1;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
}

class Solution{