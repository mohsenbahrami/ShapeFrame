
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Rectangle;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(0, 60));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("Name Of Shape");
		btnNewButton.setActionCommand("");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(595, 400));
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_1.setBackground(Color.YELLOW);
		//panel_1.add(new Panel(null, null, null));
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_2.setPreferredSize(new Dimension(0, 180));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(new Rectangle(4, 4, 4, 4));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(null, "Discription", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_3.setPreferredSize(new Dimension(450, 110));
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 2, 3, 2));
		
		JLabel lblNewLabel_1 = new JLabel("Position(x,y)");
		lblNewLabel_1.setBounds(new Rectangle(4, 4, 4, 4));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setPreferredSize(new Dimension(0, 0));
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lenghts");
		lblNewLabel_2.setBounds(new Rectangle(4, 4, 4, 4));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setPreferredSize(new Dimension(0, 0));
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Area");
		lblNewLabel.setBounds(new Rectangle(4, 4, 4, 4));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setPreferredSize(new Dimension(0, 0));
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Perimeter");
		lblNewLabel_3.setBounds(new Rectangle(4, 4, 4, 4));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setPreferredSize(new Dimension(0, 0));
		panel_3.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Circle");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setPreferredSize(new Dimension(100, 35));
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Squqre");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setPreferredSize(new Dimension(100, 35));
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Triangle");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setPreferredSize(new Dimension(100, 35));
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Fill");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_4.setPreferredSize(new Dimension(100, 35));
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Erase");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_5.setPreferredSize(new Dimension(100, 35));
		panel_2.add(btnNewButton_5);
		this.setVisible(true);
	}
}
