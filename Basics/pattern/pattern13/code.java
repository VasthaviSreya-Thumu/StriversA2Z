class Solution {
    public void pattern13(int n) {
        int var = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < i; j++){
                System.out.print(var);
                System.out.print(" ");
                var++;
            }
            System.out.println();
        }
    }
}
