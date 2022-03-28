package com.test;

import java.util.Arrays;
import java.util.List;

public class StreamsAvg {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5,3,4,1,2);
		System.out.println(list.stream().mapToInt(Integer :: intValue).max());
		
	}
}
