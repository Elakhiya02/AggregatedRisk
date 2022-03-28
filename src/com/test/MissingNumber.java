package com.test;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7};
		System.out.println(findMissingNumber(arr, arr.length));
	}

	private static int findMissingNumber(int[] arr, int length) {
		int sum = ((length +1) * (length +2))/2;
		System.out.println("Sum " + sum);
		for (int i = 0; i < arr.length; i++) {
			sum-=arr[i];
		}
		return sum;
	}
}
