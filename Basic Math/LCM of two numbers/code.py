class Solution:
    def LCM(self, a, b):
        return (a * b) // self.gcd(a, b)
    
    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a

