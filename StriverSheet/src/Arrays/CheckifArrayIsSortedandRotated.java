package Arrays;

public class CheckifArrayIsSortedandRotated {
	public boolean check(int[] nums) {
		if(nums.length == 1){
            return true;
        }
		for (int i = 0; i <= nums.length-1; i++) {
            int cnt = 0;
			for (int j = 0; j < nums.length - 1; j++) {
				if (nums[j] <= nums[j + 1]) {
					continue;
				} else {
					cnt++;
					break;
				}
			}

			if (cnt != 0) {
				reverse(0, nums.length - 1, nums);
				reverse(1, nums.length - 1, nums);
			} else {
				return true;
			}
		}
		return false;
	}

	public void reverse(int st, int end, int[] nums) {
		while (st < end) {
			int temp = nums[st];
			nums[st] = nums[end];
			nums[end] = temp;
			st++;
			end--;
		}
	}

	public static void main(String[] args) {
		CheckifArrayIsSortedandRotated ca = new CheckifArrayIsSortedandRotated();
		int[] nums = { 2,1,3,4 };
		System.out.println(ca.check(nums));
	}
}
