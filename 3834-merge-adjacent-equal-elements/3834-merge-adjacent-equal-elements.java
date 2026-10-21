
import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> list = new ArrayList<>();

        for (int num : nums) {
            long value = num;

            while (!list.isEmpty() && list.get(list.size() - 1) == value) {
                value += list.remove(list.size() - 1);
            }

            list.add(value);
        }

        return list;
    }
}
