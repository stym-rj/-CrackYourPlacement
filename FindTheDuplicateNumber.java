class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] arr = new boolean[nums.length];
        for (int num: nums) {
            if (arr[num - 1]) {
                return num;
            } else {
                arr[num - 1] = true;
            }
        }

        return -1;
    }
}