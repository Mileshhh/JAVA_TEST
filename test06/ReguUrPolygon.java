package homework.test06;

public class ReguUrPolygon {
	private int n = 3;        //����εı���
	private double side = 1;  //�ߵĳ���
	private double x = 0;     //������е��x����
	private double y = 0;     //������е��y����
	
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
	
	//�������εĳ���
	double getPerimeter() {
		return n * side;
	}
	
	double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI/n));
	}
	
}
