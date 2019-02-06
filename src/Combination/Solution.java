package Combination;

import java.util.LinkedList;
import java.util.List;

class Solution {
    static List<List<Integer>> result;
    static List<Integer> temp;

    public static void main(String[]arg0){
        System.out.print(combine(4,2));
    }

    public static List<List<Integer>> combine(int n, int k) {

        result = new LinkedList<>();
        temp = new LinkedList<>();

        backtracking(n,k,1);
        return result;
    }

    public static void backtracking(int n, int k,int start){
        if(temp.size()==k){
            result.add(new LinkedList<Integer>(temp));
            return;
        }
        for(int i = start;i<=n;i++){
            temp.add(i);
            backtracking(n,k,i+1);
            temp.remove(temp.size()-1);
        }

    }
}