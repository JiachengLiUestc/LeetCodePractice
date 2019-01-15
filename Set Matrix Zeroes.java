class Solution {
    public void setZeroes(int[][] matrix) {
       //两个变量用于存储第一行和第一列需不需要被置0
       boolean rowflag = false;
       boolean colflag = false;
       for(int i=0;i<matrix.length;i++){
           if(matrix[i][0] == 0){
               colflag = true;
           }
       }
        
       for(int j=0;j<matrix[0].length;j++){
           if(matrix[0][j] == 0){
               rowflag = true;
           }
       }
        
       //第一行和第一列的位置 则被用来存放对应的某一行或者某一列是否需要被置0的要求
       for(int i=1;i<matrix.length;i++){
           for(int j=1;j<matrix[0].length;j++){
               if(matrix[i][j] ==0){
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
               }
           }
       }
        //如果i,j对应的第一行 第一列为0的话 就把matrix[i][j]置为0，避免了多次循环
          for(int i=1;i<matrix.length;i++){
                for(int j=1;j<matrix[0].length;j++){
                    if(matrix[0][j]==0 || matrix[i][0] == 0){
                        matrix[i][j]=0;
                    }
                }
            }

       if(colflag){
          for(int i=0;i<matrix.length;i++){
                   matrix[i][0] = 0;
          }
       }
        
         if(rowflag){
          for(int j=0;j<matrix[0].length;j++){
                   matrix[0][j] = 0;
          }
       }
    }
}