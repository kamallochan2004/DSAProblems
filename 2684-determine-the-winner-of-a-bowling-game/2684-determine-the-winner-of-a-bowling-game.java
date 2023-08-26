class Solution {
    public int isWinner(int[] player1, int[] player2) {
       int x=0,y=0;
        for(int i=0;i<player1.length;i++)
        {
            if(i>1)
            {
                if(player1[i-1]==10 || player1[i-2]==10)x+=2*player1[i];
                else x+=player1[i];
                if(player2[i-1]==10 || player2[i-2]==10)y+=2*player2[i];
                else y+=player2[i];
            }
            else if(i==1)
            {
                if(player1[i-1]==10)x+=2*player1[i];
                else x+=player1[i];
                if(player2[i-1]==10)y+=2*player2[i];
                else y+=player2[i];
            }
            else {
                x+=player1[i];
                y+=player2[i];
            }
        }
        return (x==y)?0:((x>y)?1:2);
    }
}