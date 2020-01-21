import java.awt.Color;

public class Shape {
	// Properties for the Shape Class.
	
	protected int side;
	protected Color color;
	
	// Create Constructor for the Class.
	
	public Shape(int side , Color color) {
		this.side = side;
		this.color = color;
	}
	
	//create empty constructor 
	//public Shape() {
		
	//}
	
	//Create function for display
	public String toString() {
		String str = "";
		str += "Class: " + this.getClass().getSimpleName()+ "\n";
		str += "Side: " + this.side + "\n";
		str += "Color: "+ this.color.toString() +"\n";
		str += "Area Of the Shape: " + CalculateArea()+" Cm^2\n";
		str += "Perimeter of the Shape: "+ CalculatePerimeter()+" Cm\n";
		return str;
	}
	
	
	// Create function for the Class.
	
	public double CalculateArea() {
		return 0;
	}
	
	public double CalculatePerimeter() {
		return 0;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
	

}
