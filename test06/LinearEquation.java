package homework.test06;

public class LinearEquation {
	private double a,b,c,d,e,f;
	
	public LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}
	
	double getA() {
		return a;
	}
	double getB() {
		return a;
	}
	double getC() {
		return a;
	}
	double getD() {
		return a;
	}
	double getE() {
		return a;
	}
	double getF() {
		return a;
	}
	
	//判断方程式是否有解
	boolean isSovable() {
		if(a * d - b * c != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	
	double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
}
