class Solution {
    public int removeDuplicates(int[] nums) {
        
        int rd=0;
        int i=1;

        while(i<nums.length)
        {
            if(nums[rd]!=nums[i])
            {
                rd++;
                nums[rd]=nums[i];
                
            }
            else
            {
                i++;
            }
        }
    return rd+1;
    }
}