//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}

// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        int t = 0;
        long sum = 0;
        for(int i=0;i<str.length();i++)
        {
            
            if(Character.isDigit(str.charAt(i)))
            {
              t =i;
                while(i<str.length() && Character.isDigit(str.charAt(i)))
                {
                    i++;
                }
                sum+=Integer.parseInt(str.substring(t,i));
            }
            
        }
         return sum;
    }
    
}

