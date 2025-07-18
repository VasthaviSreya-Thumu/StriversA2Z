class Solution:
    def isArmstrong(self, n):
        num = str(n)
        l = len(num)
        s = 0
        for i in num:
            s += int(i) ** l
        return s == n
