package BeautifulArrangement526;

class Solution {
    public static int count = 0;
    public static void main(String []arg0){
        int n = 2;

        System.out.println(countArrangement(n));
    }
    public static int countArrangement(int N) {
        int [] array = new int[N+1];

        for(int i = 1;i<=N;i++){
            array[i] = i;
        }

        backtracking(array,1);
        return count;
    }

    public static void backtracking(int [] array, int start){
        if(start==array.length-1){
            count++;

        }else{
            for(int i = start;i<array.length;i++){
                swap(array,start,i);
                if(array[start]%start==0||start%array[start]==0) {

                    backtracking(array, start + 1);
                }
                swap(array,start,i);


            }
        }
    }

    public static void swap(int []array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}