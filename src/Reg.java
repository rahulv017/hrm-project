import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Reg extends JFrame{
	
	public Reg()
	{
		createPage5();
	}
	
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, i11;
	JTextField tf1, tf2, tf5, tf7, tf8;
	JButton btn1, btn2;
	JRadioButton jh, jk;
	JPasswordField p1;

	public void createPage5()
	{
		
		setLayout(null);
		setVisible(true);
		
		//setVisible(true);
		//setSize(700, 700);
		//setLayout(null);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setTitle("Registration Form in Java");

		l1 = new JLabel("Registration Form in Windows Form:");
		// l1.setForeground(Color.blue);
		// l1.setFont(new Font("Serif", Font.BOLD, 20));

		//l2 = new JLabel("ID");
		l3 = new JLabel("First Name:");
		l4 = new JLabel("Last Name:");
		l5 = new JLabel("Gender:");
		l6 = new JLabel("DOB:");
		l7 = new JLabel("Address:");
		l8 = new JLabel("Password:");
		// l9= new JLabel("ADDRESS");
		// l10= new JLabel("E-MAIL");
		// i11=new JLabel("QUALIFIACTION");
		//tf1 = new JTextField();
		tf2 = new JTextField();
		// p1 = new JPasswordField();
		// p2 = new JPasswordField();
		tf5 = new JTextField();
		jh = new JRadioButton("Male");
		jk = new JRadioButton("Female");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jh);
		bg.add(jk);

		tf7 = new JTextField();
		tf8 = new JTextField();
		p1 = new JPasswordField();
		// tf10=new JTextField();

		
		l1.setBounds(100, 30, 400, 30);
		//l2.setBounds(80, 70, 200, 30);
		l3.setBounds(80, 110, 200, 30);
		l4.setBounds(80, 150, 200, 30);
		l5.setBounds(80, 190, 200, 30);
		l6.setBounds(80, 230, 200, 30);
		l7.setBounds(80, 270, 200, 30);
		l8.setBounds(80, 310, 200, 30);
		// l9.setBounds(80, 350, 200, 30);
		// l10.setBounds(80, 390, 200, 30);
		// i11.setBounds(80, 430, 200, 30);
		//tf1.setBounds(300, 70, 200, 30);
		tf2.setBounds(300, 110, 200, 30);
		tf5.setBounds(300, 150, 200, 30);
		jh.setBounds(300, 190, 100, 30);
		jk.setBounds(410, 190, 200, 30);
		tf7.setBounds(300, 230, 200, 30);
		tf8.setBounds(300, 270, 200, 30);
		p1.setBounds(300, 310, 200, 30);
		// tf8.setBounds(300, 350, 200, 30);
		// tf9.setBounds(300, 390, 200, 30);
		// tf10.setBounds(300, 430, 200, 30);
		//btn1.setBounds(100, 360, 100, 30);
		//btn2.setBounds(250, 360, 100, 30);
		tf5.requestFocus();

		//add(l1);
		//add(l2);
		//add(tf1);
		add(l3);
		add(tf2);
		add(l4);
		add(tf5);
		add(l5);
		add(jh);
		add(jk);
		add(l6);
		add(tf7);
		add(l7);
		add(tf8);
		add(l8);
		add(p1);
		// add(l9);
		// add(tf8);
		/*
		 * add(l10); add(tf9); add(i11); add(tf10);
		 */
		//add(btn1);
		//add(btn2);
		
	}
     public static void main(String args[])
     {
    	 new Reg();
     }
}
