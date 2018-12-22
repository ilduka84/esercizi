package MinimumPathSum64;

class Solution {
    public static int minPathSum(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int[][] solution = new int[row][col];
        inizialize(solution, grid);
        for(int i =1;i<row;i++){
            for(int j = 0;j<col;j++){
                int up = solution[i-1][j];
                int left = (j!=0)?solution[i][j-1]:Integer.MAX_VALUE;
                solution[i][j] = Math.min(up,left)+grid[i][j];

            }
        }
        return solution[row-1][col-1];
    }

    public static void inizialize(int[][]solution,int[][]grid){

        //first row

        solution[0][0] = grid[0][0];
        for(int j = 1;j<grid[0].length;j++) {
            solution[0][j] = solution[0][j - 1] + grid[0][j];

        }
        for(int j = 1;j<grid.length;j++) {
            solution[j][0] = solution[j-1][0] + grid[j][0];

        }

    }
}