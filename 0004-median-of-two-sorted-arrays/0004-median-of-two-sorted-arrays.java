class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        // as firstly we have to define the capacity of each individual array
        int m = nums1.length;
        int n =  nums2.length;

        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        

        int low = 0;
        int high = m;

        while(low <= high){
            // cuts the points 
            int i = (low + high) / 2;
            int j = ((m + n + 1) / 2) - i;

            int maxLeftX = (i == 0) ? Integer.MIN_VALUE : nums1[i-1];
            int minRightX = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int maxLeftY = (j == 0)? Integer.MIN_VALUE: nums2[j-1];
            int minRightY = (j == n)? Integer.MAX_VALUE: nums2[j];


            // Now Cross Check thoses parts of the each arrays
            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                // If odd total elements median is maximum of the left partition
                if(( m + n ) % 2 != 0){
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
                // If even total elements, median is average of the middle partition edges
                else {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                }


            } 
            // We are too far right in nums1 Move binary search window left
            else if(maxLeftX > minRightY){
                high = i - 1;
            } 
             // We are too far left in nums1 Move binary search window right
             else {
                low = i + 1;
             }

        }
        return 0.0;
    } 
}