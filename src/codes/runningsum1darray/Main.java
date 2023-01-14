package codes.runningsum1darray;

class Main {

    public int[] runningSum(int[] nums) {
        int total = 0;
        int[] solution = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            solution[i] = total;
        }
        return solution;
    }
}