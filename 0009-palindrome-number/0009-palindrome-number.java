class Solution {
    public boolean isPalindrome(int x) {
        // Edge case checks the negative elements and also ending zero except zero itself
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reverseHalf = 0;

        while(x > reverseHalf){
            int rem = x % 10;
            reverseHalf = (reverseHalf * 10) + rem;
            x /= 10;

        }

        // return the case if even digit and odd digit
        return x == reverseHalf || x == reverseHalf /10;
    }
}