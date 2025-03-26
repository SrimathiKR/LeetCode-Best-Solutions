class Solution {
    public boolean isPalindrome(int x) {
        int ans=0;
        int y=x;
        if(x<0){
            return false;
        }else{
            while(x>0){
                int a=x%10;
                ans=ans*10+a;
                x=x/10;
            }
            if(ans==y){
                return true;
            }
        }
        return false;
        
    }
}