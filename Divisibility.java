//You are provided an array  of size  that contains non-negative integers. Your task is to determine whether the number that is formed by selecting the last digit of all the N numbers is divisible by .

import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
 
        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }
 
        String ans = data[N-1]%10==0? "Yes": "No";
        System.out.println(ans);
        
    }
}
