class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s=new LinkedHashSet<>();
        for(int i:nums){
            if(s.contains(i)){
                return true;
            }
            s.add(i);
        }
        return false;
    }
}