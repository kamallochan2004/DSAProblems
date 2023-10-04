#User function Template for python3

class Solution:
    def romanToDecimal(self, S): 
        # code here
        ret,i=0,0
        arr={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        while(i < len(S)):
            if(i+1<len(S) and arr[S[i+1]]>arr[S[i]]):
                ret+=(arr[S[i+1]]-arr[S[i]])
                i+=1
            else:
                ret+=arr[S[i]]
            i+=1
        return ret

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t = int(input())
    for _ in range(t):
        ob = Solution()
        S = input()
        print(ob.romanToDecimal(S))
# } Driver Code Ends