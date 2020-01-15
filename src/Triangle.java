

import java.awt.Color;

public class Triangle extends Shape {
	
	double side;

	/**
	 * @param color
	 * @param side
	 */
	public Triangle(Color color, double side) {
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
		return (Math.pow(this.side, 2) * (Math.sqrt(3)/4));
	}
	
	 public double calculatePerimeter(double side) {
		 return(this.side * 3);
	 }
	
	

}
