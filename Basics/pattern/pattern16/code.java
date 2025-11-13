class Solution {
    public void pattern17(int n) {
        for (int i = 0; i < n; i++){
            char start = 'A';
            for (int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            System.out.print(start);
            for (int j = 1; j <= i; j++){
                start++;
                System.out.print(start);
            }
            start--;
            for (int j = 1; j <= i; j++){
                System.out.print(start);
                start--;
            }
            System.out.println();
        }
    }
}
