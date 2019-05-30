package SortColors75;

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length<=1) return;
        int zero = 0,two=nums.length-1;
        int i = 0;
        while(i<=two){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
                i++;
                zero++;
            }
            else if(nums[i]==2){
                int temp = nums[i];
                nums[i] = nums[two];
                nums[two] = temp;
                two--;

            }
            else{
                i++;
            }

        }
    }
}