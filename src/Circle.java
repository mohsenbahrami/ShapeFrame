

import java.awt.Color;

public class Circle extends Shape {
	double reduis;

	/**
	 * @param color
	 * @param reduis
	 */
	public Circle(Color color, double reduis) {
		super(color);
		this.reduis = reduis;
	}

	public double getReduis() {
		return reduis;
	}

	public void setReduis(double reduis) {
		this.reduis = reduis;
	}
	
	public double calculateArea(double reduis) {
		return (Math.pow(this.reduis, 2) * Math.PI);
	}
	public double calculatePerimeter(double redius) {
		return ((Math.PI * this.reduis)*2);
		
	}
	

}
