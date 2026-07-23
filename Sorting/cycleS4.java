class cycleS4 {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return i;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        cycleS4 obj = new cycleS4();
        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = obj.findDuplicate(nums);
        System.out.println("Duplicate number is: " + duplicate);
    }
}