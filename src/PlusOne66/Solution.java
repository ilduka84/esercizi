package PlusOne66;

class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int[]result = new int[digits.length+1];
        for(int i = digits.length-1;i>=0;i--){
            int sum = digits[i]+carry;
            if(sum >9){
                carry = sum/10;
                sum=0;

            }
            else{
                carry = 0;

            }
            result[i+1] = sum;
        }
        if(carry!=0){
            result[0] = carry;
        }
        if(result[0]==0){
            return Arrays.copyOfRange(result,1,result.length);
        }
        else {
            return result;
        }
    }
}