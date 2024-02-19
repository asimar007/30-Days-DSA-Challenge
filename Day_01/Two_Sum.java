public class Two_Sum {
	public static int[] sum(int nums[], int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] ans = sum(nums, target);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}