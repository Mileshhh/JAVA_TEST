package homework.test05;

public class CircleWithPrivateDataFields {
	//圆的半径
	private double radius = 1;

	//对象的序号
	private static int numberOfObjects = 0;

	//建一个半径为1的圆
	CircleWithPrivateDataFields(){
		numberOfObjects++;
	}

	//建一个有指定半径的圆
	CircleWithPrivateDataFields(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}

	//获取圆的半径
	public double getRadius() {
		return radius;
	}

	//设置圆的半径
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
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
