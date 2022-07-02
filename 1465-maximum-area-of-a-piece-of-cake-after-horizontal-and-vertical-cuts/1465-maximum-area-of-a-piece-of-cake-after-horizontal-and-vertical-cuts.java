class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int n = horizontalCuts.length;
        int m = verticalCuts.length;
        
        int maxVerticalLength = Math.max(verticalCuts[0] - 0, w - verticalCuts[m-1]);
        int maxHorizontalLength = Math.max(horizontalCuts[0] - 0, h - horizontalCuts[n-1]);
        
        for(int i = 1; i < horizontalCuts.length; i++) {
            int width = horizontalCuts[i] - horizontalCuts[i-1];
            maxHorizontalLength = Math.max(maxHorizontalLength, width);
        }
        
        for(int i = 1; i < verticalCuts.length; i++) {
            int height = verticalCuts[i] - verticalCuts[i-1];
            maxVerticalLength = Math.max(maxVerticalLength, height);
        }
        
        long maxArea = 1l * maxVerticalLength * maxHorizontalLength;
        
        return (int) (maxArea % 1000000007);
    }
}