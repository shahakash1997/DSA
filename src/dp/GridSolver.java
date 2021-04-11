package dp;

public class GridSolver {
    public static int waysToReach(int rows ,int cols,int[][] arr){
        if (rows == 0 || cols == 0)
            return 0;
        if ( (rows == 1 && cols ==2) || (rows ==2 && cols ==1) )
            return 1;
        return waysToReach(rows-1,cols,arr) + waysToReach(rows,cols-1,arr);

    }
}
