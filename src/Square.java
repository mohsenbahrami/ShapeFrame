

import java.awt.Color;

public class Square extends Shape {
	double side;

	/**
	 * @param color
	 * @param side
	 */
	public Square(Color color, double side) {
		super(color);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double calculateArea(double side) {
		return Math.pow(this.side, 2);
	}
	public double caculatePerimeter(double side) {
		return this.side * 4;
	}
	
	

}
