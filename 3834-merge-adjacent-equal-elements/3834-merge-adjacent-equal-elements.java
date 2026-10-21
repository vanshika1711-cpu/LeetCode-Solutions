
import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stack = new Stack<>();

        for (int num : nums) {
            long value = num;

            while (!stack.isEmpty() && stack.peek() == value) {
                value += stack.pop();
            }

            stack.push(value);
        }

        return new ArrayList<>(stack);
    }
}
