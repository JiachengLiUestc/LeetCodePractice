class Solution {
    public void setZeroes(int[][] matrix) {
       //�����������ڴ洢��һ�к͵�һ���費��Ҫ����0
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
        
       //��һ�к͵�һ�е�λ�� ��������Ŷ�Ӧ��ĳһ�л���ĳһ���Ƿ���Ҫ����0��Ҫ��
       for(int i=1;i<matrix.length;i++){
           for(int j=1;j<matrix[0].length;j++){
               if(matrix[i][j] ==0){
                   matrix[i][0] = 0;
                   matrix[0][j] = 0;
               }
           }
       }
        //���i,j��Ӧ�ĵ�һ�� ��һ��Ϊ0�Ļ� �Ͱ�matrix[i][j]��Ϊ0�������˶��ѭ��
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