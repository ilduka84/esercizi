package permute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public static void main(String [] arg0){
        int [] nums = new int[]{1,2,3};
        permute(nums).forEach(x->x.forEach((Integer y)->System.out.println(y.toString())));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result = new LinkedList<>();

        backtracking(nums,0,result);
        return result;

    }

    public static void backtracking(int[]nums,int start,List<List<Integer>>result){
        if(start==nums.length-1){
            result.add(new ArrayList(Arrays.asList(nums)));
        }
        else{
            for(int i=start;i<nums.length;i++){
                swap(nums,start,i);
                backtracking(nums,start+1,result);
                swap(nums,start,i);
            }
        }
    }

    public static void swap(int [] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}