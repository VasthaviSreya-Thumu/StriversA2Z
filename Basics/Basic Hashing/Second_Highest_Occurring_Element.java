class Solution {
    public int secondMostFrequentElement(int[] nums) {
        int n = nums.length;
        int maxFreq = 0;
        int secMaxFreq = 0;
        int maxEle = -1, secEle = -1;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++){
            int elem = nums[i];
            int freq = 0;
            if (visited[i] != true){
                for (int j = i; j < n; j++){
                    if (elem == nums[j]){
                        freq++;
                        visited[j] = true;
                    }
                }
                visited[i] = true;
                if (maxFreq < freq){
                    secMaxFreq = maxFreq;
                    maxFreq = freq;
                    secEle = maxEle;
                    maxEle = elem;
                }
                else if(freq == maxFreq) {
                maxEle = Math.min(maxEle, nums[i]);
                }
                else if (freq > secMaxFreq){
                    secMaxFreq = freq;
                    secEle = nums[i];
                }
                else if(freq == secMaxFreq) {
                secEle = Math.min(secEle, nums[i]);
            }
            }
        }
        return secEle;
    }
}

