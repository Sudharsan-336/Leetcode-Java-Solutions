package Math;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0;
        int original=x;
        while(x!=0){
            int last=x%10;
            rev=last+rev*10;
            x/=10;
        }
        return original==rev;
    }
    
}
