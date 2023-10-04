class Solution:
    def reverse(self, x: int) -> int:
        mina = -2 ** 31
        maxa = 2 ** 31 - 1
        if x > 0 :
            r = int(str(x)[::-1])
        if x <= 0 :
            r = int(str(x*-1)[::-1]) * -1
        if r not in range(mina, maxa) :
            return 0
        else : 
            return r
        