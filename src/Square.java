import java.awt.Color;

public class Square extends Shape {
	
	public Square(int side,Color color) {
		super(side , color);
	}
	
	public double CalculateArea() {
		return Math.round(Math.pow(this.side, 2));
		
	}
	
	public double CalculatePerimeter(){
		return Math.round(this.side * 4);
	}
	
	

}
