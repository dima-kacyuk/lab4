package homework04;

public class Tasks {
	private int[] arr;

	Tasks(int[] arr) {
		this.arr = arr;
	}

	public void showArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void task01(int[] arr) {
		showArr(arr);

		int max = -1;
		int min = 9999999;
		int maxIndex = -1;
		int minIndex = -1;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
			if (min > arr[i]) {
				min = arr[i];
				minIndex = i;
			}
		}

		System.out.println("Макимальный и минимальный элементы: " + max + " , " + min);
		System.out.println("Максимальный и минимальный индекс элементов: " + maxIndex + " , " + minIndex);

		arr[minIndex] = max;
		arr[maxIndex] = min;

		System.out.println("Новый массив: ");

		showArr(arr);
	}

	public void task02(int[] arr) {
		showArr(arr);
		
		int temp;
		
		for(int i=0; i<arr.length - 1; i++) {
			for(int j=0; j<arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		showArr(arr);
	}

	public void task03(int[] arr) {
		showArr(arr);
		
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			temp+=arr[i];
		}
		
		System.out.println("Среднее значение = " + (double)temp/arr.length);
	}

	public void task04(int[] arr2) {
		showArr(arr);
		
		int sumOfEven = 0;
		int sumOfUneven = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				sumOfEven += arr[i];
			}
			else {
				sumOfUneven += arr[i];
			}
		}
		
		System.out.println("Сумма четных элементов: " + sumOfEven);
		System.out.println("Сумма нечетных элементов: " + sumOfUneven);
	}

	public void task06(int[] arr) {
		showArr(arr);
		int max = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Максимальный элемент = " + max);
	}
	
	
}
