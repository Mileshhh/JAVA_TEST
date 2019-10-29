package homework.test05;

public class TestPassObject {
	public static void main(String[] args) {
		//建一个半径为一的圆对象
		CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);
		
		//输出半径为1，2，3，4，5的圆的面积
		int n = 5;
		printArea(myCircle,n);
		
		//看圆的半径和输出次数
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	//输出圆的面积
	public static void printArea(CircleWithPrivateDataFields c, int times) {
		System.out.println("Radius \t\tArea");
		while(times >= 1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}
