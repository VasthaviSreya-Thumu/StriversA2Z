class Solution:
    def pattern14(self, n):
        for i in range(1, n + 1):
            start = ord('A')
            for j in range(1, i + 1):
                print(chr(start), end = "")
                start += 1
            print()
