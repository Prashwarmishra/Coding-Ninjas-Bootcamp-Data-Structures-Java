package test5;

public class mat{
    int [][] matrix;

    mat(int [][] mat){
        matrix=mat;
    }
    
    int rowLen() {
    	return matrix.length;
    }
    
    int colLen() {
    	return matrix[0].length;
    }
    
    int[][] getMatrix(){
    	return this.matrix;
    }

    public static mat add(mat a,mat b){
    	int[][] ansMat = new int[a.rowLen()][a.colLen()], mat1 = a.getMatrix(), mat2 = b.getMatrix();
    	
    	for(int i=0;i<mat1.length; i++) {
    		for(int j=0;j<mat1[i].length;j++) {
    			ansMat[i][j] = mat1[i][j] + mat2[i][j];
    		}
    	}
    	return new mat(ansMat);
    }
    
    public static mat multiply(mat a,mat b){
    	int[][] ansMat = new int[a.rowLen()][b.colLen()], mat1 = a.getMatrix(), mat2 = b.getMatrix();
    	
    	for(int i=0; i<mat1.length; i++) {
    		for(int k=0; k<mat2[0].length; k++) {
    			int temp = 0;
    			for(int j=0; j<mat1[0].length; j++) {
        			temp += mat1[i][j]*mat2[j][k];
        		}
    			ansMat[i][k] = temp;
    		}
    	}
    	
    	return new mat(ansMat);
    }
    
    public static mat transpose(mat m){
    	
    	int[][] ansMat = new int[m.colLen()][m.rowLen()];
    	int[][] mat1 = m.getMatrix();
    	
    	for(int i=0; i<ansMat.length; i++) {
    		for(int j=0; j<ansMat[i].length; j++) {
    			ansMat[i][j] = mat1[j][i];
    		}
    	}
    	return new mat(ansMat);
    }
    
    public static mat rotate(mat m){
    	int[][] ansMat = new int[m.colLen()][m.rowLen()], mat1 = m.getMatrix();
  
    	for(int i=0; i<mat1.length; i++) {
    		int pos = mat1[i].length-1;
    		for(int j=0; j<mat1[i].length; j++) {
    			ansMat[pos-j][i] = mat1[i][j];
    		}
    	}
    	
    	return new mat(ansMat);
    }
    
    public  void print()
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
