class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length/2;
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                count++;
                set.remove(nums[i]);
            }
            else
            {
                set.add(nums[i]);
            }
        }
        if(count==n)
        {
            return true;
        }
        return false;
    }
}
