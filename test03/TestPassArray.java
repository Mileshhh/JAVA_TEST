package homework.test03;

public class TestPassArray {
	public static void main(String[] args) {
		int[] a = {1,2};
		
		//用第一种方法
		System.out.println("Before invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swap(a[0], a[1]);
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		
		//用第二种方法
		System.out.println("Before invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swapFirstTwoInArray(a);
		System.out.println("After invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		
	}

	//交换两个数
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	//将数组中的前两个数互换
	public static void swapFirstTwoInArray(int[] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}

}
