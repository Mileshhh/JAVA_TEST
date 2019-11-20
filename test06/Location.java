package homework.test06;

public class Location {
	public int row = 0,column = 0;
	public double maxValue = 0;

	void setRow(int newRow) {
		row = newRow;
	}
	
	void setCol(int newCol) {
		column = newCol;
	}
	
	void setMaxValue(double newMaxValue) {
		maxValue = newMaxValue;
	}
	
	int getRow() {
		return row;
	}
	
	int getCol() {
		return column;
	}
	
	double getMaxValue() {
		return maxValue;
	}
}
