package Parameterized_Ludorii;

public class ClosestToZeroFinder {
    public int findClosestToZero(int[] nums) {
        int closest = nums[0];
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest) || (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
            }
        }
        return closest;
    }
}
