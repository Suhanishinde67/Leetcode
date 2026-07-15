class Solution {
    public int findPeakElement(int[] nums) {
        
        int low=0;
        int high=nums.length-1;
        int mid;

        while(low<=high)
        {
            mid = low+(high-low)/2;

            if(nums.length==1)
            {
                return mid;
            }

            if(mid+1<nums.length && nums[mid+1]>nums[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
}