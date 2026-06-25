class Solution {
    public void rotate(int[][] matrix) {
        int i=0;
        int j=0;
        int n=matrix.length;
        while(i!=n){
            for(int k=j;k<n;k++){
                int temp=matrix[i][k];
                matrix[i][k]=matrix[k][i];
                matrix[k][i]=temp;
            }
            i++;
            j++;
        }
        int l=0;
        int r=n-1;
        while(l<=r){
            for(i=0;i<n;i++){
                int temp=matrix[i][r];
                matrix[i][r]=matrix[i][l];
                matrix[i][l]=temp;
            }
            l++;
            r--;
        }
    }
}