class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> missing = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i + 1];
            
            for (int val = current + 1; val < next; val++) {
                missing.add(val);
            }
        }
        
        return missing;  
    }
}