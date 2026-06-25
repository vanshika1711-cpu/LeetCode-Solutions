class Solution {
    public int trap(int[] height) {

        int n = height.length;

        // highest bar ka index
        int peak = 0;

        for(int i = 1; i < n; i++) {
            if(height[i] > height[peak]) {
                peak = i;
            }
        }

        int water = 0;

        // Left part
        int leftMax = height[0];

        for(int i = 1; i < peak; i++) {

            if(height[i] < leftMax) {
                water += leftMax - height[i];
            } else {
                leftMax = height[i];
            }
        }

        // Right part
        int rightMax = height[n - 1];

        for(int i = n - 2; i > peak; i--) {

            if(height[i] < rightMax) {
                water += rightMax - height[i];
            } else {
                rightMax = height[i];
            }
        }

        return water;
    }
}