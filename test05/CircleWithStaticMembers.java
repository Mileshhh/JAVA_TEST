package homework.test05;

public class CircleWithStaticMembers {
	
	//圆的半径
	double radius;
	
	//对象的序号
	static int numberOfObjects = 0;
	
	//建一个半径为1的圆
	CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}
	
	//建一个有指定半径的圆
	CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	//得到对象的序号
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	//计算圆的面积
	double getArea() {
		return radius * radius * Math.PI;
	}
}
