package homework.test05;

public class TestCircleWithPrivateDataFields {
	public static void main(String[] args) {
		//��һ���뾶Ϊ5��Բ
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		//����myCircle�뾶��10%
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
				+ CircleWithPrivateDataFields.getNumberOfObjects());
	}
}
