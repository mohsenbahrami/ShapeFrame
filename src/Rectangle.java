

import java.awt.Color;

public class Rectangle extends Shape {
	double width;
	double heights;
	
	
	/*
	 * @param color
	 * @param width
	 * @param heights */
	public Rectangle(Color color, double width, double heights) {
		super(color);
		this.width = width;
		this.heights = heights;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeights() {
		return heights;
	}


	public void setHeights(double heights) {
		this.heights = heights;
	}
	
	public double calculateArea(double width,double heights) {
		
		return (this.width * this.heights);
		
	}
	
	public double calculatePreimeter(double width,double heights) {
		return ((this.width + this.heights)*2);
	}
	
	

}
