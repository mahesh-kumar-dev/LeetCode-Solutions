class Solution {
    public int reverseBits(int n) {
        int res = 0;

        // Loop 32 bits
        for(int i = 0; i < 32; i++){
           int bit = (n >> i) & 1;

            res |= (bit <<(31 - i));

        }
        return res;
    }
}