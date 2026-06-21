package Assignment_1;

public class Program_9 {

    public static void main(String[] args) {

        int[] nums = {4, 2, 7, 2, 9, 4, 1, 7, 4};

        boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (visited[i] == true) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(nums[i] + " appears " + count + " times (duplicate)");
            }
        }
    }
}
