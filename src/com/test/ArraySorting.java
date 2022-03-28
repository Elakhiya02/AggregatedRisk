package com.test;

import java.util.Arrays;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraySorting {

	public static void main(String[] args) {
		int arr0 = 0, arr1  = 0, arr2 = 0;
		int[] arr = {0,1,2,1,2,0,1,2};
		Set<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toSet());
		System.out.println(integerList.stream().collect(Collectors.toMap(Integer::intValue, Function.identity())));
		System.out.println("List : " + integerList.toString());
		Arrays.sort(arr);
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		for (int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
			case 0:
				arr0++;
				break;
			case 1:
				arr1++;
				break;
			case 2:
				arr2++;
				break;
			}
		}
		int i =0;
		while(arr0 >0) {
			arr[i++] = 0;
			arr0--;
		}
		while(arr1 >0) {
			arr[i++] = 1;
			arr1--;
		}
		while(arr2 >0) {
			arr[i++] = 2;
			arr2--;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}
}