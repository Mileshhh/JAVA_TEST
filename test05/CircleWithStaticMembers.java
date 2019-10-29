package homework.test05;

public class CircleWithStaticMembers {
	
	//Բ�İ뾶
	double radius;
	
	//��������
	static int numberOfObjects = 0;
	
	//��һ���뾶Ϊ1��Բ
	CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}
	
	//��һ����ָ���뾶��Բ
	CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
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
