package homework.test06;

public class ReguUrPolygon {
	private int n = 3;        //多边形的边数
	private double side = 1;  //边的长度
	private double x = 0;     //多边形中点的x坐标
	private double y = 0;     //多边形中点的y坐标
	
	ReguUrPolygon() {
		
	}
	
	ReguUrPolygon(int newN, double newSide){
		n = newN;
		side = newSide;
	}
	
	ReguUrPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	
	//计算多边形的长度
	double getPerimeter() {
		return n * side;
	}
	
	double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI/n));
	}
	
}
