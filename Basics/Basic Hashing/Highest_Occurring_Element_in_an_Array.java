class Solution {
    public int mostFrequentElement(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int maxFreq = 0;
        int maxElem =-1;
        for (int i = 0; i < n; i++){
            int freq = 0;
            int elem = nums[i];
            if (visited[i] != true){
                for (int j = i; j < n; j++){
                    if (nums[j] == elem){
                        freq++;
                    }
                }
                visited[i] = true;
                if (maxFreq < freq){
                    maxFreq = freq;
                    maxElem = elem;
                }
                if (maxFreq == freq){
                    maxElem = Math.min(maxElem, elem);
                }
            }
        }
        return maxElem;
    }
}


