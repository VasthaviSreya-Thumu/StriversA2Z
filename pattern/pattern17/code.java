class Solution {
    public void pattern18(int n) {
        for (int i = 1; i <= n; i++){
            int start = 64 + n;
            for (int j = 1; j <= i; j++){
                System.out.print((char)(start - i + j));
                System.out.print(" ");
            } 
            System.out.println();
        }
    }
}
