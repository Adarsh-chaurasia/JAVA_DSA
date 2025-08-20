class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i = 0 ; i < rows ; i++)
        {
              for(int j = 0 ; j < cols ; j++)
              {
                if(matrix[i][j] == 0)
                {
                    int x = i;
                    int y = j;
                    while(--x >= 0){
                        if(matrix[x][y] != 0)
                             matrix[x][y] = -1;}
                    x = i;
                    while(++x < rows){ 
                        if(matrix[x][y] != 0) 
                            matrix[x][y] = -1;
                        
                    }
                    x = i;
                    while(--y >= 0) { 
                        if(matrix[x][y] != 0) 
                            matrix[x][y] = -1;
                        
                    }
                    y = j;
                    while(++y < cols) { 
                        if(matrix[x][y] != 0) 
                            matrix[x][y] = -1;
                        
                    }
                    y = j;

                }
              }

        }
        
         for(int i = 0 ; i < rows ; i++)
        {
              for(int j = 0 ; j < cols ; j++)
              {
                  if(matrix[i][j] == -1)
                        matrix[i][j] = 0;
              }
            
        }
       
    }
}

<h1>Above Code is Working only when matrix does not contains negative numbers.</h1>
