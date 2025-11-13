class Solution:
    def isPalindrome(self, n):
        return True if str(n) == str(n)[::-1] else False
