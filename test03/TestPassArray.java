package homework.test03;

public class TestPassArray {
	public static void main(String[] args) {
		int[] a = {1,2};
		
		//�õ�һ�ַ���
		System.out.println("Before invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swap(a[0], a[1]);
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		
		//�õڶ��ַ���
		System.out.println("Before invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swapFirstTwoInArray(a);
		System.out.println("After invoking swapFirstTwoInArray");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		
	}

	//����������
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	//�������е�ǰ����������
	public static void swapFirstTwoInArray(int[] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}

}
