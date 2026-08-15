class pair{
    int l=0;
    int r=0;
    int level=0;
}
class Solution {
    public boolean isvaild(int i,int j,int n,int m){
        if(i<0 || i>=n || j<0 || j>=m){
            return false;
        }
        return true;
    }
    Queue<pair> q=new LinkedList<>();
    int days=0;
    int x[]={1,-1,0,0};
    int y[]={0,0,1,-1};
    int res=0;
    public void bfs(int[][] grid,int[][] visited,int n,int m){
        while(!q.isEmpty()){
            pair p2=q.poll();
            int i1=p2.l;
            int j1=p2.r;
            int level1=p2.level;
            res=level1;
            for(int k=0;k<4;k++){
                int xi=x[k]+i1;
                int yi=y[k]+j1;
                if(isvaild(xi,yi,n,m) && visited[xi][yi]==0 && grid[xi][yi]==1){
                    visited[xi][yi]=1;
                    pair p3=new pair();
                    p3.l=xi;
                    p3.r=yi;
                    p3.level=level1+1;
                    q.offer(p3);
                }
            }
        }
        
    }
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visited[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    pair v=new pair();
                    v.l=i;
                    v.r=j;
                    v.level=0;
                    q.offer(v);
                    visited[i][j]=1;
                }
            }
        }
        bfs(grid,visited,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    return -1;
                }
            }
        }
        return res;
    }
}