//package homework.test05;
//
//public class TestSimpleCircle {
//	public static void main(String[] args) {
//		
//		//建一个半径为1的圆
//		SimpleCircle circle1 = new SimpleCircle();
//		System.out.println("The area of the circle of radius " + circle1.radius +
//				" is " + circle1.getArea());
//		
//		//建一个半径为25的圆
//		SimpleCircle circle2 = new SimpleCircle(25);
//		System.out.println("The area of the circle of radius " + circle2.radius +
//				" is " + circle2.getArea());
//		
//		//建一个半径为125的圆
//		SimpleCircle circle3 = new SimpleCircle(125);
//		System.out.println("The area of the circle of radius " + circle3.radius +
//				" is " + circle3.getArea());
//		
//		//修改圆的半径
//		circle2.radius = 100;
//		System.out.println("The area of the circle of radius " + circle2.radius +
//				" is " + circle2.getArea());
//	}
//}
//
//class SimpleCircle {
//	double radius;
//	
//	//组成一个半径为1的圆
//	SimpleCircle(){
//		radius = 1;
//	}
//	
//	//设置圆的半径
//	SimpleCircle(double newRadius){
//		radius = newRadius;
//	}
//	
//	//计算圆的面积
//	double getArea() {
//		return radius * radius * Math.PI;
//	}
//	
//	//改变圆的半径
//	void setRadius(double newRadius) {
//		radius = newRadius;
//	}
//}
