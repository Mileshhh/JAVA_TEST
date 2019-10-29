package homework.test05;

public class CircleWithPrivateDataFields {
	//Բ�İ뾶
	private double radius = 1;

	//��������
	private static int numberOfObjects = 0;

	//��һ���뾶Ϊ1��Բ
	CircleWithPrivateDataFields(){
		numberOfObjects++;
	}

	//��һ����ָ���뾶��Բ
	CircleWithPrivateDataFields(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}

	//��ȡԲ�İ뾶
	public double getRadius() {
		return radius;
	}

	//����Բ�İ뾶
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}

	//�õ���������
	static int getNumberOfObjects() {
		return numberOfObjects;
	}

	//����Բ�����
	double getArea() {
		return radius * radius * Math.PI;
	}
}
