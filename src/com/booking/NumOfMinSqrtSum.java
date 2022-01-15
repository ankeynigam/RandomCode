package com.booking;

public class NumOfMinSqrtSum {

	public int numberOfMinSquareSum(int n){
		int num = n;
		int sqrt = 0, carry = 0;

		if (num <= 3)
			return num;
		else {
			sqrt = (int) Math.sqrt(num);
			carry = num - (sqrt * sqrt);

			if (carry == 0)
				return 1;
			else
				return numberOfMinSquareSum(carry) + 1;
		}
	}
}
