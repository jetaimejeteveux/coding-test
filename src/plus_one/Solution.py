class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        digits = digits[::-1]
        one, i = 1, 0

        while one == 1 :
            if i <= len(digits) :
                if digits[i] == 9 :
                    digits[i] = 0
                    one = 1
                else :
                    digits[i] += 1
                    one = 0
            else :
                digits.append(1)
                one = 0
            i += 1
        return digits[::-1]

            
