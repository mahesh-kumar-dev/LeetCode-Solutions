class Solution {
    public int removeElement(int[] nums, int val) {
        // k is the number of unmactched target values in the nums
        int k = 0;

        // applying loop on array to store the unmatched values in the array
        for(int x : nums){
            // finding unmatched numbers in the array
            if(x != val){
                // storing the unmatched values in the new array using the k variable
                nums[k] = x;
                // increment of k
                k++;
            }

        }
        // returning number of unmatched values in the array
        return k;
    }
}