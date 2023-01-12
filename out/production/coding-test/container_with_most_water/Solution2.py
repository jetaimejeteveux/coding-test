class Solution2:    
    def maxArea(self, height: List[int]) -> int:
        result = 0
        l, r = 0, len(height) - 1
        
        while l < r :
            area = (abs(r-l)) * min(height[l], height[r])
            result = max(area, result)
            
            if height[l] < height[r] :
                l += 1
            else :
                r -= 1
        return result