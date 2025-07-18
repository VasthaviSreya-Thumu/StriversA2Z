class Solution:
    def isPerfect(self, n):
        res = 0
        for i in range(1, n //2 + 1):
            if n % i == 0:
                res += i
        return res == n
                
