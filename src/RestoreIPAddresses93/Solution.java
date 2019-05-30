package RestoreIPAddresses93;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> result = new ArrayList<>();
    int count = 0;
    public List<String> restoreIpAddresses(String s) {
        backtracking(s,new StringBuilder(),0);
        return result;


    }
    public void backtracking(String s,StringBuilder c,int start ){

        if(start==s.length()-1&&count == 4){
            count = 0;
            c.deleteCharAt(c.length()-1);
            result.add(c.toString());
            return;
        }
        List<String> candidates = findCandidates(start,s);
        for(String candidate:candidates){
            c.append(candidate).append(".");
            count++;
            backtracking(s,c,start+candidate.length());
            c.delete(start,c.length());
            count--;
        }
        return;
    }

    public List<String> findCandidates(int start,String s){
        List<String> candidates = new ArrayList<>();
        for(int i = 1;i<=3&&start+i<s.length();i++){
            String num =s.substring(start,start+i);
            if(Integer.parseInt(num)<=255){
                candidates.add(num);
            }
        }
        return candidates;
    }
}