class Solution {
    public void pattern11(int n) {
        for (int i = 1; i <= n; i++){
            int start = 0;
            for (int j = 0; j < i; j++){
                if (i % 2 == 0){
                    System.out.print(start);
                    System.out.print(" ");
                    start = 1 - start;
                }
                else{
                    start = 1 - start;
                    System.out.print(start);
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }
}
