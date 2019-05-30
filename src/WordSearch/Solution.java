package WordSearch;

class Solution {
    static boolean isFinished;

    public static void main (String[]arg0){
        char[][] board = new char[1][2];
        board[0][0] = 'a';
        board[0][1] = 'a';
        String word = new String("aaa");
        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
         isFinished = false;
        if(word.length()==0||board.length==0){
            return false;
        }
        return backtracking(board,word,0,0,0);

    }

    public static boolean backtracking(char[][] board, String word,int s,int r,int c){


        if(r<0||c<0||board.length<=r||board[0].length<=c){

            return false;
        }

        char character = word.charAt(s);
        if(character==board[r][c]&&!isFinished){
            if(s==(word.length()-1)){
                return true;

            }else{
                isFinished= backtracking(board,word,s+1,r+1,c)||
                        backtracking(board,word,s+1,r,c+1)||
                        backtracking(board,word,s+1,r-1,c)||
                        backtracking(board,word,s+1,r,c-1);
            }
        }
        return isFinished;

    }
}