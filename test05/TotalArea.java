package homework.test05;

public class TotalArea {
	public static void main(String[] args) {
		//定义circleArray
		CircleWithPrivateDataFields[] circleArray;
		
		//创建circleArray
		circleArray = createCircleArray();
		
		//输出circleArray 和 圆的面积之和
		printCircleArray(circleArray);
		
	}

	private static CircleWithPrivateDataFields[] createCircleArray() {
		CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
		
		for(int i = 0; i < circleArray.length; i++) {
			circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
		}
		
		return circleArray;
	}
	
	private static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius","Area");
		for(int i = 0; i < circleArray.length; i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
		}
		
		System.out.println("------------------------------------");
		
		System.out.printf("%-30s%-15f\n","The total area of circles is",sum(circleArray));
	}
	
	public static double sum(CircleWithPrivateDataFields[] circleArray) {
		double sum = 0;
		
		//计算圆的面积和
		for (int i = 0; i < circleArray.length; i++) {
			sum += circleArray[i].getArea();
		}
		
		return sum;
	}
}
