class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1;
        int arr2[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            arr2[i]=max;
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return arr2;
    }
}