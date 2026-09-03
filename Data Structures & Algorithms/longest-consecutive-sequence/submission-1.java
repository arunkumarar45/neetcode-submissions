class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        int max=0;
        for(int num:nums){
            if(!s.contains(num-1)){
               int curr=num;
               int len=1;
                while(s.contains(curr+1)){
                    curr++;
                    len++;
                }
                max=Math.max(max,len);
            }
        }
        return max;
    }
}
