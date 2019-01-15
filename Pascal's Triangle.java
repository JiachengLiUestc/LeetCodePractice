class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> list=new ArrayList<List<Integer>>();
        int[][] array=new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            List<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    array[i][j] = 1;
                    temp.add(1);
                }else{
                    array[i][j] = array[i-1][j-1]+array[i-1][j];
                    temp.add(array[i][j]);
                }
            }
            list.add(temp);
        }
        return list;
    }
}
