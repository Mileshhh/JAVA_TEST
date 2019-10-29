package homework.test05;

public class SimpleCircle {
	public static void main(String[] args) {
		//��һ���뾶Ϊ1��Բ
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of the circle of radius " + circle1.radius +
				" is " + circle1.getArea());
		
		//��һ���뾶Ϊ25��Բ
		SimpleCircle circle2 = new SimpleCircle(25);
		System.out.println("The area of the circle of radius " + circle2.radius +
				" is " + circle2.getArea());
		
		//��һ���뾶Ϊ125��Բ
		SimpleCircle circle3 = new SimpleCircle(125);
		System.out.println("The area of the circle of radius " + circle3.radius +
				" is " + circle3.getArea());
		
		//�޸�Բ�İ뾶
		circle2.radius = 100;
		System.out.println("The area of the circle of radius " + circle2.radius +
				" is " + circle2.getArea());
	}
	double radius;
	
	//����һ���뾶Ϊ1��Բ
	SimpleCircle(){
		radius = 1;
	}
	
	//����һ���о���뾶��Բ
	SimpleCircle(double newRadius){
		radius = newRadius;
	}
	
	//����Բ�����
	double getArea() {
		return radius * radius * Math.PI;
	}
	
	//����Բ���ܳ�
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	//�ı�Բ�İ뾶
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
