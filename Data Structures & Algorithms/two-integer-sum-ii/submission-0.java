class Solution {
    public int[] twoSum(int[] nums, int target) {
       int left=0;
       int right=nums.length-1;
       for(int i=0;i<nums.length;i++){
        int sum=nums[left]+nums[right];
        if(sum==target){
            return new int[]{left+1,right+1};

        }
        if(sum>target){
            right--;
        }else{
            left++;
        }
       } 
       return new int[]{};
    }
}
