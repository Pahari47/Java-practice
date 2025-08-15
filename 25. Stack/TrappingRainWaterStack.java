import java.util.*;
public class TrappingRainWaterStack {

    public static int trap(int height[]) {
        Stack<Integer> stack = new Stack<>();
        int water = 0;

        for(int i=0; i<height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int bottomIndex = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int leftIndex = stack.peek();
                int distance = i - leftIndex -1;
                int boundedHeight = Math.min(height[leftIndex], height[i]) - height[bottomIndex];
                water+= distance * boundedHeight;
            }
            stack.push(i);
        }

        return water;
    }
    public static void main(String[] args) {
        int arr[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println("Total trapped water : " + trap(arr));
    }
}
