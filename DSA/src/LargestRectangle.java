import java.util.Stack;

public class LargestRectangle {
    static long largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        long maxArea = 0;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[i] < heights[stack.peek()])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, (long) height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] buildingHeights = {3, 2, 3};
        long result = largestRectangle(buildingHeights);
        System.out.println("Largest Rectangle Area: " + result);
    }
}
