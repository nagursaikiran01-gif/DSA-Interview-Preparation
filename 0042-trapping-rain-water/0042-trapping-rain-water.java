class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n<3)
        {
            return 0;
        }
        int cost=0;
        int ml=-1;
        int mr=-1;
        for(int i=0;i<n-2;i++)
        {
            if(height[i]>ml)
            {
                ml=height[i];
            }
            mr=0;
            for(int j=i+2;j<n;j++)
            {
                if(height[j]>mr )
                {
                    mr=height[j];
                }
            }
            if(!(height[i+1]>ml || height[i+1]>mr))
            {
                if(ml<mr)
                {
                    cost=cost+ml-height[i+1];
                }
                else
                {
                    cost=cost+mr-height[i+1];
                }
            }

        }
        return cost;
    }
}

//25.47min

//O(n^2)-time
//O(1)-space