import java.awt.Color;

public class Circle extends Shape {
	
	public Circle(int side,Color color) {
		super(side , color);
	}

	public double CalculateArea() {
		return Math.round((Math.pow(this.side, 2) * Math.PI));
		
	}
	
	public double CalculatePerimeter() {
		return Math.round(((Math.PI * this.side)*2));
	}
	
	

}
