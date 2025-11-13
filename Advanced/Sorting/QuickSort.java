class Solution {
    public int[] quickSort(int[] nums) {
        recursion(nums, 0, nums.length - 1);
        return nums;
    }
    public int pivoting(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low   ;
        int j = high;
        while (i < j){
            while (i <= high - 1 && pivot >= nums[i]){
                i++;
            }
            while (j >= low + 1 && pivot < nums[j]){
                j--;
            }
            if (i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }
    public void recursion(int[] nums, int low, int high){
        if (low >= high)
            return;
        int pivot = pivoting(nums, low, high);
        recursion(nums, low, pivot - 1);
        recursion(nums, pivot + 1, high);
    }
}
