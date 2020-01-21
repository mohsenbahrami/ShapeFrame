import java.awt.Graphics;

import javax.swing.JPanel;


public class MyPanel extends JPanel {
	private Shape shape = null;
	public boolean fill = false;
	private int x = 0;
	private int y = 0;
	private int[] x1;
	private int[] y1;
	
	public MyPanel() {
		
	}
	

	
	public void paintComponent(Graphics g) {
		
		if(this.shape != null) {
			g.setColor(this.shape.getColor());
			String str = this.shape.getClass().getSimpleName();
				if(str.equals("Circle")) {
					
					Circle c =(Circle)this.shape;
					if(fill == true) {
						g.drawOval(25, 25, c.getSide(), c.getSide());
						
					}else if(fill == false) {
						g.fillOval(this.x, this.y, c.getSide(), c.getSide());
					}
				}else if(str.equals("Square")) {
					Square s = (Square)this.shape;
					if(fill == true) {
						g.drawRect(this.x, this.y, s.getSide(), s.getSide());
						
					}else if(fill = false) {
						g.fillRect(this.x, this.y, s.getSide(), s.getSide());
						
					}
					
				}else if(str.equals("Triangle")) {
					Triangle t = (Triangle)this.shape;
					int height = this.y + (int)(Math.sqrt((Math.pow(t.getSide(), 2)-(Math.pow(t.getSide()/2, 2)))));
					int[] x1 = {this.x,this.x+t.getSide()/2,this.x-t.getSide()/2};
					int[] y1 = {this.y,height,height};
					if(fill == true) {
						g.drawPolygon(x1, y1, x1.length);
					}
					else if(fill == false){
						g.fillPolygon(x1, y1, x1.length);
					}
				}
			
		}
		
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getX1() {
		return x1;
	}

	public void setX1(int[] x1) {
		this.x1 = x1;
	}

	public int[] getY1() {
		return y1;
	}

	public void setY1(int[] y1) {
		this.y1 = y1;
	}
	
	
	
	
	
	
		


}
