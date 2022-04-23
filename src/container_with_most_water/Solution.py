class Solution:    
    def maxArea(self, height: List[int]) -> int:
        area = 0
        result = 0
        for i in range(len(height)):
            for j in range(i+1, len(height)):
                area = abs(j-i) * min(height[i], height[j])
                result = max(area, result)
                
        return result