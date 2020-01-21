import java.awt.Color;

public class Triangle extends Shape {
	
	public Triangle(int side,Color color) {
		super(side , color);
	}
	
	public double CalculateArea(){
		return Math.round((Math.pow(this.side, 2) * (Math.sqrt(3)/4)));
		
	}
	
	public double CalculatePerimeter(){
		return Math.round((this.side * 3));
	}
	
	

}
