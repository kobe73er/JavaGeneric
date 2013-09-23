package Execise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Execise_21_2<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 3323, 435, 776, 4, 99100, 123, 617787, 1 };

		Integer[][] multiArray = { { 2, 3, 5 }, { 33, 45, 12 },
				{ 678, 76, 345 } };

		// binarySearch(intArray, 7787);
		// int k = Execise_21_2.<Integer> binarySearch(intArray, 123);
		// System.out.println(k);

		// Execise_21_2.<Integer> selectionSort(intArray);
//		System.out.println(Execise_21_2.<Integer> max(intArray));
		System.out.println(Execise_21_2.<Integer>max(multiArray));
	}

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int begin = 0;
		int end = list.length - 1;
		while (begin <= end) {
			int middle = (begin + end) / 2;
			if (list[middle].compareTo(key) < 0) {
				begin = middle + 1;
			} else if (list[middle].compareTo(key) > 0) {
				end = middle - 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

	public static <E extends Comparable<E>> void selectionSort(E[] list) {
		int position = 0;

		int i = 0;
		for (int k = 0; k < list.length; k++) {
			E min = list[k];
			i = k;
			for (; i < list.length; i++) {
				if (list[i].compareTo(min) < 0) {
					min = list[i];
					position = i;
				}
				E temp = list[k];
				list[k] = list[position];
				list[position] = temp;
			}
		}
		System.out.println("min position==" + position);

		for (E e : list) {
			System.out.print(e + " ");
		}

		// System.out.println("count==>"+count);

	}

	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (E e : list) {
			if (max.compareTo(e) < 0)
				max = e;
		}
		return max;

	}

	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];
		for (E[] outer : list) {
			for (E inner : outer) {
				if (max.compareTo(inner) < 0)
					max = inner;

			}
		}
		return max;

	}
}