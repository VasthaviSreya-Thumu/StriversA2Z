class Solution:
    def pattern18(self, n):
        for i in range(1, n + 1):
            start = 64 + n
            for j in range(1, i + 1):
                print(chr(start - i + j ), end = " ")
            print()
