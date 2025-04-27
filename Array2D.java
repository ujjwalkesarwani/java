public class Array2D {
    public static void printSpiral(int matrix[][]){
        int StartRow = 0;
        int StartCol = 0;
        int endRow = matrix.length-1;
        int endCol=matrix[0].length-1;
        while(StartRow<=endRow && StartCol<=endCol){
            // top
            for(int j=StartCol;j<=endCol;j++){
                System.out.print(matrix[StartRow][j]+" ");
            }
            // right
            for(int i=StartRow+1;i<=endRow;i++)
            {
                System.out.print(matrix[i][ endCol]+" ");
            }
            // bottom
            for(int j=endCol-1;j>=StartCol;j--){
                if(StartRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1;i>=StartRow+1;i--)
            {
                if(StartCol==endCol){
                    break;
                }
                System.out.print(matrix[i][ StartCol]+" ");
            }
            StartRow++;
            StartCol++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }
    public static int DiognalSum(int matrix[][]){ //O(n)
    int sum=0;
        
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static boolean Sorted_Staircase_Search(int matrix[][] , int key) {
        int row= 0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==key){
                System.out.print("key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static int countNum(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key){
                    count++;
                }
               
            }
        }
        return count;
    }
    
    public static void main(stringprob[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}}; 
    // printSpiral(matrix);
    // System.out.print(DiognalSum(matrix));
    int key=7;
    // Sorted_Staircase_Search(matrix, key);
    System.out.println("no. of times key found is:"+ countNum(matrix, key));
    }
    
}
