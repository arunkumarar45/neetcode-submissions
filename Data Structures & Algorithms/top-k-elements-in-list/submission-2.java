class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
      List<Integer> l=new ArrayList<>(map.keySet());
      l.sort((a,b)->map.get(b)-map.get(a));
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}