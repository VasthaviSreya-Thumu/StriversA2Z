class Solution:
    def pattern8(self, n):
        for i in range(0,n):
            for j in range(0, i):
                print(" ", end = "")
            for j in range(0, 2 * (n - i) -1):
                print("*", end = "")
            print()
            
