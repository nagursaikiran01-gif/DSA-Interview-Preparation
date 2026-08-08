class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && heights[s1.peek()]>=heights[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s1.peek();
            }
            s1.push(i);
        }
        for(int i=n-1;i>=0;i--){
            while(!s2.isEmpty() && heights[s2.peek()]>=heights[i]){
                s2.pop();
            }
            if(s2.isEmpty()){
                nsr[i]=-1;
            }
            else{
                nsr[i]=s2.peek();
            }
            s2.push(i);
        }
        int res=0;
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            if(nsl[i]>=0 && nsr[i]>=0){
                l=nsl[i]+1;
                r=nsr[i]-1;
            }
            if(nsl[i]>=0 && nsr[i]==-1){
                l=nsl[i]+1;
                r=n-1;
            }
            if(nsl[i]==-1 && nsr[i]>=0){
                l=0;
                r=nsr[i]-1;
            }
            if(nsl[i]==-1 && nsr[i]==-1){
                l=0;
                r=n-1;
            }
            int area=heights[i]*(r-l+1);
            res=Math.max(area,res);
        }
        return res;
    }
}