class Solution {
    int x[]={-1,0,1,0};
    int y[]={0,-1,0,1};
    int res=0;
    int temp=0;
    public int isvaild(int i,int j,int n,int m){
        if(i<0||j<0||i>=n||j>=m){
            return 0;
        }
        return 1;
    }
    public void dfs(int grid[][],int n,int m,int visited[][],int i,int j){
        visited[i][j]=1;
        temp+=1;
        for(int k=0;k<4;k++){
            int neix=x[k]+i;
            int neiy=y[k]+j;
            int l=isvaild(neix,neiy,n,m);
            if(l==1 && grid[neix][neiy]==1 && visited[neix][neiy]==0){
                dfs(grid,n,m,visited,neix,neiy);
            }
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    temp=0;
                    dfs(grid,n,m,visited,i,j);
                    res=Math.max(res,temp);
                }
            }
        }
        return res;
    }
}

//20mins
//O(n*m)-time
//O(n*m)-space
