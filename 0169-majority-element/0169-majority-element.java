class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int candidate = 0;
        
        for (int i : nums) 
        {
            if (cnt == 0) 
            {
                candidate = i;
            }
            
            if (i == candidate) 
            {
                cnt++;
            } else
            {
                cnt--;
            }
        }
        
        return candidate;
    }
}
