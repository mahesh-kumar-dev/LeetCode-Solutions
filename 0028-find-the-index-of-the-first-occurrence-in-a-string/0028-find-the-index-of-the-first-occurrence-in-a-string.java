class Solution {
    public int strStr(String haystack, String needle) {
        // validation check for safety
        if(haystack == null || needle == null){
            throw new IllegalArgumentException("Inputs cannot be null");
        }

        //return haystack.indexOf(needle); 
        int hLen = haystack.length();
        int nLen = needle.length();

        // if needle is larger than the haystack , So it never matches
        if(nLen > hLen){
            return -1;
        }

        // Loop through the haystack up to the point where the remaining 
        // characters are at least long enough to fit the needle
        for(int i = 0; i <= hLen - nLen; i++){
            int j;

            // Check if characters match starting from the current index 'i'
            for(j = 0; j < nLen; j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break; // break early if character mismatch
                }
            }

            // If the inner loop ran fully, it means we found the needle match
            if(j == nLen){
                return i; // return the starting index
            }
        }
        // Return -1 if the needle is not found anywhere
        return -1;
    }
}