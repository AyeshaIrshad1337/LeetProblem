class Solution {
    public int searchInsert(int[] nums, int target) {
        int strt =0, end = nums.length-1;
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                strt=mid+1;
            }else{
                return mid;
            }
        }
        return strt;
    }
}