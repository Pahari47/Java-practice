public class trappingRainWater {

    public static int trapped(int height[]) {
        // calculate leftMax boundary array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Rightmax boundary array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<height.length; i++) {
            // waterlevel calculation
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapped(height));
    }
}
