class Solution {
    public boolean isPalindrome(int x) {
        int num=0;
        int temp=x;
        while(temp>0){
            int rem=temp%10;
            num=num*10+rem;
            temp=temp/10;
        }
        if(x==num)
            return true;
        else
            return false;
    }
}
