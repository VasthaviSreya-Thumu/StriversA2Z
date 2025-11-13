class Solution:
    def pattern15(self, n):
        for i in range(1, n + 1):
            start = ord('A')
            for j in range(n - i + 1):
                print(chr(start), end = "")
                start += 1
            print()

            
