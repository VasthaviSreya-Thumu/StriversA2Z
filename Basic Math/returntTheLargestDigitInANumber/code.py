class Solution:
    def largestDigit(self, n):
        maxi = float('-inf')
        if n == 0 :
            return 0
        while (n != 0):
            maxi = max(maxi, n % 10)
            n = n // 10
        return maxi
