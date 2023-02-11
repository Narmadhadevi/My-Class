package week1.day2;

import java.util.Arrays;

public class SortMinMax {

	public static void main(String[] args) {
		int[] nums={22, 3981, -19, 82, 0, 45, 37};
		Arrays.sort(nums);
		System.out.println("minimum number is "+ nums[0]);
		System.out.println("maximum number is "+nums[nums.length-1]);
	}

}
