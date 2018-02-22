package com.fiberhome;

import java.util.Arrays;

public class SetTest {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 1, 34, 11 };
		int[] result = insertSort(arr);
		//System.out.println(Arrays.toString(result));
	}

	public static int[] insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			for (; j > 0 && arr[j-1] > temp; j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}

}
