import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private int[] x1;
	private int[] y1;
	Circle circle = new Circle(150,Color.red);
	Square square = new Square(150,Color.red);
	Triangle tringle = new Triangle(150,Color.red);
	MyPanel shapePan = new MyPanel();
	
	
	
	public Frame() {
		frame = this;
		setSize(new Dimension(400, 500));
		setTitle("Lab3");
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		this.setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel shape_lbl = new JLabel("SHAPE NAME");
		panel.add(shape_lbl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 125));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Circle");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Square");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Triangle");
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Fill");
		panel_2.add(btnNewButton_3);
		
		JButton btnErase = new JButton("Erase");
		panel_2.add(btnErase);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(new BorderLayout());
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Description", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(new BorderLayout());
		JLabel lblDescription = new JLabel("position(x,y)");
		lblDescription.setBorder(new EmptyBorder(0, 40, 0, 0));
		panel_4.add(lblDescription, BorderLayout.WEST);
		JLabel lblLength = new JLabel("length");
		lblLength.setPreferredSize(new Dimension(110, 30));
		panel_4.add(lblLength,BorderLayout.EAST);
		panel_3.add(panel_4,BorderLayout.NORTH);
		
		JPanel panel_5 = new JPanel();
		JLabel lblArea = new JLabel("area");
		panel_5.setLayout(new BorderLayout());
		lblArea.setBorder(new EmptyBorder(0, 40, 0, 0));
		panel_5.add(lblArea,BorderLayout.WEST);
		JLabel lblPerimeter = new JLabel("perimeter");
		lblPerimeter.setPreferredSize(new Dimension(110, 50));
		panel_5.add(lblPerimeter,BorderLayout.EAST);
		panel_3.add(panel_5,BorderLayout.SOUTH);

		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					shapePan.fill = true;
					shapePan.setShape(circle);
					shapePan.setX(110);
					shapePan.setY(70);
					frame.repaint();
					frame.revalidate();
					shape_lbl.setText(circle.getClass().getSimpleName());
					lblLength.setText("Length : "+circle.side+"");
					lblArea.setText("Area : "+circle.CalculateArea()+"");
					lblPerimeter.setText("Perimeter : "+circle.CalculatePerimeter()+"");
					lblDescription.setText("Position : "+shapePan.getX()+","+shapePan.getY()+"");
					
				shapePan.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {}
					public void mousePressed(MouseEvent e) {}
					public void mouseExited(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						shapePan.removeAll();
						shapePan.setX(e.getX());
						shapePan.setY(e.getY());
						shapePan.setShape(circle);
						lblDescription.setText("Position : "+e.getX()+" , "+e.getY()+"");
						
						shapePan.repaint();
						shapePan.revalidate();
						
						frame.repaint();
						frame.revalidate();
					}
				});
				
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
						shapePan.fill = true;
						shapePan.setShape(square);
						shapePan.setX(110);
						shapePan.setY(70);
						frame.repaint();
						frame.revalidate();
						shape_lbl.setText(square.getClass().getSimpleName());
						lblLength.setText("Length : "+square.getSide()+"");
						lblArea.setText("Area : "+square.CalculateArea()+"");
						lblPerimeter.setText("Perimeter : "+square.CalculatePerimeter()+"");
						lblDescription.setText("Position : "+shapePan.getX()+","+shapePan.getY()+"");
						
					shapePan.addMouseListener(new MouseListener() {
						public void mouseReleased(MouseEvent e) {}
						public void mousePressed(MouseEvent e) {}
						public void mouseExited(MouseEvent e) {}
						public void mouseEntered(MouseEvent e) {}
						
						@Override
						public void mouseClicked(MouseEvent e) {
							shapePan.removeAll();
							
							shapePan.setX(e.getX());
							shapePan.setY(e.getY());
							shapePan.setShape(square);
							lblDescription.setText("Position : "+e.getX()+" , "+e.getY()+"");
							
							shapePan.repaint();
							shapePan.revalidate();
							
							frame.repaint();
							frame.revalidate();
						}
					});
				
			}
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				shapePan.fill = true;
				shapePan.setShape(tringle);
				shapePan.setX(180);
				shapePan.setY(90);
				frame.repaint();
				frame.revalidate();
				shape_lbl.setText(tringle.getClass().getSimpleName());
				lblLength.setText("Length : "+tringle.getSide()+"");
				lblArea.setText("Area : "+tringle.CalculateArea()+"");
				lblPerimeter.setText("Perimeter : "+tringle.CalculatePerimeter()+"");
				lblDescription.setText("Position : "+shapePan.getX()+","+shapePan.getY()+"");
			

		shapePan.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				shapePan.removeAll();
//				int[] x2 = {e.getX(),e.getX(),e.getX()};
//				int[] y2 = {e.getY(),e.getY(),e.getY()};
//				shapePan.setX1(x2);
//				shapePan.setY1(y2);
				shapePan.setX(e.getX());
				shapePan.setY(e.getY());
				shapePan.setShape(tringle);
				lblDescription.setText("Position : "+e.getX()+" , "+e.getY()+"");
				
				shapePan.repaint();
				shapePan.revalidate();
				
				frame.repaint();
				frame.revalidate();
				
			}
		});
		
			}
		});
		
		btnErase.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				shapePan.setShape(null);
				shape_lbl.setText("SHAPE NAME");
				lblLength.setText("length");
				lblArea.setText("area");
				lblPerimeter.setText("perimeter");
				lblDescription.setText("position");
				shapePan.repaint();
				shapePan.revalidate();
				
				frame.repaint();
				frame.revalidate();
			}
		});
		
		btnNewButton_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				shapePan.fill = false;
					if(shape_lbl.getText().equals("Circle")) {
						shapePan.setShape(circle);
						shapePan.repaint();
						shapePan.revalidate();
						
						frame.repaint();
						frame.revalidate();
					}
					else if(shape_lbl.getText().equals("Square")) {
						shapePan.setShape(square);
						shapePan.setX(110);
						shapePan.setY(70);
						frame.repaint();
						frame.revalidate();
					}
					else if(shape_lbl.getText().equals("Tringle")) {
						shapePan.setShape(tringle);
						shapePan.setX(180);
						shapePan.setY(90);
						frame.repaint();
						frame.revalidate();
					}
			}
		});
		
		JPopupMenu contextMenu = new JPopupMenu();
		JMenuItem redMenuItem = new JMenuItem("Red");
		contextMenu.add(redMenuItem);
		
		redMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				circle.setColor(Color.red);
				square.setColor(Color.red);
				tringle.setColor(Color.red);
				shapePan.repaint();
				shapePan.revalidate();
				frame.repaint();
				frame.revalidate();
			}
		});
		
		JMenuItem blueMenuItem = new JMenuItem("Blue");
		contextMenu.add(blueMenuItem);
		
		blueMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				circle.setColor(Color.blue);
				square.setColor(Color.blue);
				tringle.setColor(Color.blue);
				shapePan.repaint();
				shapePan.revalidate();
				frame.repaint();
				frame.revalidate();
			}
		});
		
		JMenuItem greenMenuItem = new JMenuItem("Green");
		contextMenu.add(greenMenuItem);
		
		greenMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				circle.setColor(Color.green);
				square.setColor(Color.green);
				tringle.setColor(Color.green);
				shapePan.repaint();
				shapePan.revalidate();
				frame.repaint();
				frame.revalidate();
			}
		});
		shapePan.setComponentPopupMenu(contextMenu);
		contentPane.add(shapePan, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
