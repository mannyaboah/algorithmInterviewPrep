class MatrixCircle {

    public static void main(String[] args) {
        
    }

    /**
     * print first row forward, print the last col downwards, 
     * last row backwards, first row bottom up.
     * 
     * 
     */
    public static void printMatrix(int[][] matrix){
        
        int startRowIdx = 0;
        int startColIdx = 0;
        int endRowIdx = matrix.length;
        int endColIdx = matrix[0].length;

        while(startRowIdx < endRowIdx && startColIdx < endColIdx){
            
            //Print first, then the remaining
            printTopRow(matrix, startRowIdx, startColIdx, endColIdx);
            startRowIdx++;
            //print last column, then the remaining
            printLasTCol(matrix, startRowIdx, endRowIdx, endColIdx);
            endColIdx--;

            //print the last row, then the remaining
            if(startRowIdx < endRowIdx){ // out of bounds check
                printBottomRow(matrix, startColIdx, endColIdx, endRowIdx);
            }
            endRowIdx--;
            //print the first column, then the remaining
            if(startColIdx < endColIdx){
                printFirstTCol(matrix, startRowIdx, endRowIdx, endColIdx);
            }
            startColIdx++;
        }
        
    }

    public static void printTopRow(int[][] matrix, int startRowIdx, int startColIdx, int endColIdx){
        for(int i = startColIdx; i < endColIdx; i++){
            System.out.println(matrix[startRowIdx][i] + " ");
        }
    }

    public static void printFirstTCol(int[][] matrix, int startRowIdx, int endRowIdx, int endColIdx){
        for(int i = endRowIdx - 1; i >= startRowIdx; i--){
            System.out.println(matrix[i][endColIdx - 1]);
        }
    }

    public static void printLasTCol(int[][] matrix, int startRowIdx, int endRowIdx, int endColIdx){
        for(int i = startRowIdx; i < endRowIdx; i++){
            System.out.println(matrix[i][endColIdx - 1] + " ");
        }
    }
    public static void printBottomRow(int[][] matrix, int startColIdx, int endColIdx, int endRowIdx){
        for(int i = endColIdx - 1; i < startColIdx; i--){
            System.out.println(matrix[endRowIdx][i] + " ");
        }
    }


}