package LetterCombinationsofaPhoneNumber;

import java.util.LinkedList;
import java.util.List;

class Solution {
    private String[] map;
    private List<String> solution;
    public List<String> letterCombinations(String digits) {
        createMap();
        solution = new LinkedList<>();
        backtracking(digits,0,new StringBuilder());
        return solution;

    }

    private void createMap(){
        this.map = new String[]
                {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }

    private void backtracking(String digit,int index,StringBuilder sol){

        String candidates = map[digit.charAt(index)-'0'];
        for(char candidate:candidates.toCharArray()){
            sol.append(candidate);
            if(index+1>=digit.length()){
                solution.add(sol.toString());

            }
            else {
                backtracking(digit, index + 1, sol);
            }
            sol.deleteCharAt(sol.length()-1);
        }
    }

}

