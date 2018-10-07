package homework04;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		Random rnd = new Random();
		final int n = 10;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(30);
		}

		int[][] arr2 = new int[3][5];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < 5; j++) {
				arr2[i][j] = rnd.nextInt(10);
			}
		}

		Tasks tsk = new Tasks(arr);

		System.out.println("Задание 1 ------------------");
		tsk.task01(arr);
		System.out.println("Задание 2 ------------------");
		tsk.task02(arr);
		System.out.println("Задание 3 ------------------");
		tsk.task03(arr);
		System.out.println("Задание 4 ------------------");
		tsk.task04(arr);
		System.out.println("Задание 5 ------------------");
		task05(arr2);
		System.out.println("Задание 6 ------------------");
		tsk.task06(arr);
		System.out.println("Задание 7 ------------------");
		
		String s1 = "1238";
		String s2 = "1239";
		String s3 = "1238";
		String s4 = "1234";
		String s5 = "1234";
		
		task07(s1,s2,s3,s4,s5);
		
	}
	
	private static void task07(String s1, String s2, String s3, String s4, String s5) {
		if(s4.equals(s5)) {
			System.out.println(s1+=s2);
		}
		else {
			System.out.println(s1+=s3);
		}	
	}

	private static void task05(int[][] arr2) {
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
