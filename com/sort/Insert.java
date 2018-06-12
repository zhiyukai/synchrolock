package com.sort;

public class Insert {
	public static void main(String[] args) {
		int[] arr = { 40, 44, 38, 17, 27, 26, 46 };
		insertSort(arr);

		Utils.printArray(arr);
	}

	public static void insertSort(int[] arr) {
		int len = arr.length;

		int current = 0;
		int currentIndex = 0;
		for (int i = 1; i < len; i++) {
			current=arr[i];
			currentIndex=i;
				for(int j=i-1;j>=0 && arr[j]>current;j--){
					arr[j+1]=arr[j];
					currentIndex=j;
			}
			arr[currentIndex]=current;

		}
	}

}
