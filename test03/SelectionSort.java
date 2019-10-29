package homework.test03;

public class SelectionSort {
	//对数组进行递增排序
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	
	public static void main(String[] args) {
		double[] list = {1,9,4.5,6.6,5.7,-4.5};
		SelectionSort.selectionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
