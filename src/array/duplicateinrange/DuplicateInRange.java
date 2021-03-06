package array.duplicateinrange;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInRange {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if (i-k-1 >= 0) {
                window.remove(nums[i - k - 1]);
            }

            if(window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
        }

        return false;
    }
}
