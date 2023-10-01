//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
			
            Solution ob = new Solution();
            int ans  = ob.trailingZeroes(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int trailingZeroes(int n){
        // Write your code here
        int temp=n;
        if(n==5)
        return 1;
        else if(n<5)
        return 0;
        int count=0;
        while(temp>=5){
            count+=temp/5;
            temp/=5;
        }
        return count;
    }
}