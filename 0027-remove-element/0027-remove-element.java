import java.util.ArrayList;
class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
           int tmp= nums[j];
           nums[j]=nums[i];
                nums[i]=tmp;
                j++;
            }
        }
        return j;
    }
}