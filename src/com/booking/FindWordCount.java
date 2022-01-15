package com.booking;

import java.util.Arrays;
import java.util.HashMap;

public class FindWordCount {
	public static void findWords() {
		String input = "acacabcatghhellomvnsdb";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] arr = { "aca", "cat", "hello", "world" };

		for (String word : arr) {
			int i = input.indexOf(word);
			while (i >= 0) {
				hm.put(word, hm.getOrDefault(word,0) + 1);
				i = input.indexOf(word, i + 1);
			}
		}
		System.out.println(hm);
	}
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
			int [] arr = {5, 2, 3, 7, 6};
			int N = arr.length;
			for(int i = 0; i < N; i++) {
				for(int j = N-1; j != i ; j--) {
					if(arr[j] < arr[j-1]) {
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
					System.out.println("hello");
					}
					
				}
			}
			System.out.print(Arrays.toString(arr));
	}
}
