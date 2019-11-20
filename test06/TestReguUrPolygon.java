package homework.test06;

public class TestReguUrPolygon {
	public static void main(String[] args) {
		ReguUrPolygon r1 = new ReguUrPolygon();
		ReguUrPolygon r2 = new ReguUrPolygon(6,4);
		ReguUrPolygon r3 = new ReguUrPolygon(10,4,5.6,7.8);
		
		System.out.println("r1's perimeter is " + r1.getPerimeter() + "\nr1's area is " + r1.getArea());
		System.out.println("r2's perimeter is " + r2.getPerimeter() + "\nr2's area is " + r2.getArea());
		System.out.println("r3's perimeter is " + r3.getPerimeter() + "\nr3's area is " + r3.getArea());
	}
}
