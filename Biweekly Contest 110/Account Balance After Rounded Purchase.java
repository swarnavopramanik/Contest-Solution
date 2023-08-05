https://leetcode.com/contest/biweekly-contest-110/problems/account-balance-after-rounded-purchase/

  class Solution {
    
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        
        int balt=100;
        if(purchaseAmount==0){
            return 100;
        }
        
        if(purchaseAmount%10==0)
        {
            return balt-purchaseAmount;
        }
        
        int rem=purchaseAmount%10;
        
        int div=purchaseAmount/10;
        
      
        
        if(rem>=5){
            
            div++;
        }
        
        int amtr=div*10;
        
        balt-=amtr;
        
        return balt;
        
    }
}

//

class Solution {
    public int accountBalanceAfterPurchase(int p) {
        int a = p / 10 * 10;
        int b = a + 10;
        if (p - a < b - p) return 100 - a;
        else return 100 - b;
    }
}

