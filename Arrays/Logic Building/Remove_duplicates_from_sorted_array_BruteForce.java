class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        Set<Integer> temp = new TreeSet<>();
        for (int i = 0; i < n; i++){
            temp.add(nums[i]);
        }
        int size = temp.size();
        Integer[] arr = temp.toArray(new Integer[0]);
        for (int i = 0; i < size; i++){
            nums[i] = arr[i];
        }
        return size;
    }
}
