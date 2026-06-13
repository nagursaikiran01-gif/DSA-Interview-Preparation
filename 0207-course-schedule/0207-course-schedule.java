class Solution {
    int c=0;
    public void dfs(ArrayList<ArrayList<Integer>> a,int visited[],int f){
        visited[f]=1;
        for(int i=0;i<a.get(f).size();i++){
            int nei=a.get(f).get(i);
            if(visited[nei]==1){
                c=1;
            }
            else if(visited[nei]==0) {
                dfs(a,visited,nei);
            }
        }
        visited[f]=2;
    }
    public boolean canFinish(int numCourses, int[][] p) {
        int n=p.length;
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            arr.get(p[i][0]).add(p[i][1]);
        }
        int visited[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
                dfs(arr,visited,i);
                if(c==1){
                return false;
            }
        }
        return true;
        
    }
}