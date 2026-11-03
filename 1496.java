class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> set=new HashSet<>();
        int x=0;
        int y=0;
        set.add("0,0");
        for(int i=0;i<path.length();i++)
        {
            if(path.charAt(i)=='N')
            {
                y++;
            }
            else if(path.charAt(i)=='E')
            {
                x++;
            }
            else if(path.charAt(i)=='S')
            {
                y--;
            }
            else if(path.charAt(i)=='W')
            {
                x--;
            }
            String ans=x+","+y;
            if(set.contains(ans))
            {
                return true;
            }
            set.add(ans);
        }
        return false;
    }
}