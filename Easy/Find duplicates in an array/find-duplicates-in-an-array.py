class Solution:
    def duplicates(self, arr, n): 
        s=set(arr)
        res=[]
        for i in arr:
            if i in s:
                s.remove(i)
            else:
                res.append(i)
        res=list(set(res))
        res.sort()
        if len(res)==0:
            return [-1]
        else:
            return res


#{ 
 # Driver Code Starts
if(__name__=='__main__'):
    t = int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        res = Solution().duplicates(arr, n)
        for i in res:
            print(i,end=" ")
        print()



# } Driver Code Ends