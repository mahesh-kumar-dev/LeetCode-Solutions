class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0 ){
            return "";
        }

        // Taking first element of the string array for comparision
        String anchor = strs[0];

        for(int i = 0 ; i < anchor.length(); i++){
            char ch = anchor.charAt(i);
            for(int j = 1; j < strs.length; j++){
                // index reaches end of current word
                // if characters do not match
                if(i >= strs[j].length() || strs[j].charAt(i) !=ch){
                    // Cut the anchor string from index 0 up to i
                    return anchor.substring(0,i);
                }
            }
        }

        return anchor;
    }
}