package island;

class Solution {
    static boolean [][]visited;
    static int sum;
    public static void main(String[]arg0){
        char[][]grid = {{'0','1','0'},{'1','0','1'},{'0','1','0'}};
        System.out.println(numIslands(grid));
    }
    public static int numIslands(char[][] grid) {
        if(grid.length==0){return 0;}
        sum = 0;
        visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[i].length;j++){
                if(grid[i][j]=='1'&&!visited[i][j]){
                    sum++;
                    dfs(grid,i,j);
                }
            }
        }
        return sum;
    }

    public static void dfs(char [][]grid,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'||visited[i][j]){
            return;
        }
        visited[i][j] = true;

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}