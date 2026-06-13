class Solution {
    int x[]={-1,1,0,0};
    int y[]={0,0,1,-1};
    public int isvaild(int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m){
            return 0;
        }
        return 1;
    }
    public void dfs(char mat[][],int visited[][],int i,int j,int n,int m){
        visited[i][j]=1;
        for(int k=0;k<4;k++){
            int neix=i+x[k];
            int neiy=j+y[k];
            int l=isvaild(neix,neiy,n,m);
            if(l==1){
                if(mat[neix][neiy]=='1' && visited[neix][neiy]==0){
                    dfs(mat,visited,neix,neiy,n,m);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    dfs(grid,visited,i,j,n,m);
                    res++;
                }
            }
        }
        return res;
    }
}