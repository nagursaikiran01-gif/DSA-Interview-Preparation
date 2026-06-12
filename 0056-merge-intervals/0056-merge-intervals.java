class Solution {
    public int[][] merge(int[][] a) {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        int m=a.length;
        if(m<=1){
            return a;
        }
        Arrays.sort(a,(x,y)->x[0]-y[0]);
        int t1=a[0][0];
        int t2=a[0][1];
        ArrayList<Integer> temp=new ArrayList<>();
        int flag=0;
        for(int i=1;i<m;i++){
            if(t2>=a[i][0]){
                t2=Math.max(t2,a[i][1]);
                flag=1;
            }
            else{
                temp.add(t1);
                temp.add(t2);
                t1=a[i][0];
                t2=a[i][1];
                arr.add(temp);
                flag=0;
            }
            
            temp=new ArrayList<>();
        }
        temp.add(t1);
        temp.add(t2);
        arr.add(temp);
        int n=arr.size();
        int res[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                res[i][j]=arr.get(i).get(j);
            }
        }
        return res;
    }
}