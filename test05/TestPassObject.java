package homework.test05;

public class TestPassObject {
	public static void main(String[] args) {
		//��һ���뾶Ϊһ��Բ����
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);
		
		//����뾶Ϊ1��2��3��4��5��Բ�����
		int n = 5;
		printArea(myCircle,n);
		
		//��Բ�İ뾶���������
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	//���Բ�����
	public static void printArea(CircleWithPrivateDataFields c, int times) {
		System.out.println("Radius \t\tArea");
		while(times >= 1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}
