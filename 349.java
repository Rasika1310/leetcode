class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        int ans[]=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(set1.contains(nums2[i]))
            {
                ans[k]=nums2[i];
                k++;
                set1.remove(nums2[i]);
            }
        }
        return Arrays.copyOf(ans,k);
    }
}