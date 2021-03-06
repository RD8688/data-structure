package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Common {

	/**
	 * New Line
	 */
	public static void println() {
		System.out.println();
	}

	public static void print(Object x) {
		System.out.print(x);
	}

	public static int[] strToIntArray(String str) {
		int[] arr = new int[str.length()];
		int i = 0;
		for (char c : str.toCharArray()) {
			arr[i] = Integer.parseInt(c + "");
			i++;
		}
		return arr;
	}

	public static void println(Object x) {
		System.out.println(x + "\n");
	}

	public static void println(Map map) {
		map.forEach((k, v) -> {
			println("k : " + k + " | v : " + v);
		});
	}

	/**
	 * Print 2D array with speperator
	 */
	public static void printArray(int[] arr) {
		printArray(arr, " , ");
	}

	public static void printArray(boolean[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + " , ");
		}
		println();

	}

	public static void printArray(List[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
		println();
	}

	public static void printArray(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
		println();
	}

	public static void print(List<Integer> list) {
		list.forEach(t -> System.out.print(t + " ,"));
		println();
	}

	/**
	 * Print 1D array
	 */
	public static void printArray(int[] arr, String sepeartor) {
		/// println();
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i] + sepeartor);
		}
		println();
	}

	/**
	 * Print 2D array
	 */
	public static void printArray(int[][] arr) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[i][j] + " ");
			println();
		}
	}

	public static void print2DArray(String string, int[][] arr) {
		System.out.print(string + " => \n");
		print2DArray(arr, " ");
	}

	public static void print2DArray(int[][] arr, String seperator) {
		println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + seperator);
			System.out.println();
		}
	}

	public static void print2DArray(int[][] arr) {
		print2DArray(arr, " ");
	}

	public static void print2DArray(boolean[][] arr, String seperator) {
		println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + seperator);
			System.out.println();
		}
	}

	/**
	 * Arrays to List
	 */
	public static List<Integer> arrayToList(int[] second) {
		List<Integer> intList = new ArrayList<Integer>();
		for (int m : second) {
			intList.add(m);
		}
		return intList;
	}

	public static int max(int... arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

	public static int min(int... arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	public static void intialize2DMatrix(int[][] mat, int value) {
		for (int i = 0; i < mat.length; i++)
			Arrays.fill(mat[i], value);
	}

	public static int swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return temp;
	}

	public static void printStack(Stack<Integer> stack) {
		// method 1:
		String values = Arrays.toString(stack.toArray());
		System.out.println(values);

	}
}