
//package front;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;


public class Registration extends JFrame implements ActionListener, FocusListener {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, i11;
	JTextField tf1, tf2, tf5, tf7, tf8;
	JButton btn1, btn2,btn3;
	JRadioButton jh, jk;
	JPasswordField p1;

	public JPanel createPage5()
	{
		JPanel jp=new JPanel();
		jp.setLayout(null);
		
		//setVisible(true);
		//setSize(700, 700);
		//setLayout(null);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setTitle("Registration Form in Java");

		l1 = new JLabel("Registration Form in Windows Form:");
		// l1.setForeground(Color.blue);
		// l1.setFont(new Font("Serif", Font.BOLD, 20));

		l2 = new JLabel("ID");
		l3 = new JLabel("First Name:");
		l4 = new JLabel("Last Name:");
		l5 = new JLabel("Gender:");
		l6 = new JLabel("DOB:");
		l7 = new JLabel("Address:");
		//l8 = new JLabel("Password:");
		// l9= new JLabel("ADDRESS");
		// l10= new JLabel("E-MAIL");
		// i11=new JLabel("QUALIFIACTION");
		tf1 = new JTextField();
		tf2 = new JTextField();
		// p1 = new JPasswordField();
		// p2 = new JPasswordField();
		tf5 = new JTextField();
		jh = new JRadioButton("Male");
		jk = new JRadioButton("Female");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jh);
		bg.add(jk);
		
		tf7 = new JTextField("DD-MM-YYYY");
		tf7.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent e)
			{
				tf7.setText("");
			}

			@Override
			public void focusLost(FocusEvent e) {
				if(tf7.getText()=="")
				{
					tf7.setText("DD-MM-YYYY");
				}
				
			}
		});
		tf8 = new JTextField();
		//p1 = new JPasswordField();
		// tf10=new JTextField();

		btn1 = new JButton("Submit");
		btn2 = new JButton("Clear");
		btn3=new JButton("LOGOUT");

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1, n2, n3, n4 = "", n5, n6, n7;
				n1 = tf1.getText();
				n2 = tf2.getText();
				n3 = tf5.getText();
				if (jh.isSelected())
					n4 = "M";
				else if (jk.isSelected())
					n4 = "F";
				n5 = tf7.getText();
				n6 = tf8.getText();
				//n7 = p1.getText();
				if (n1.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the ID");
				} else if (n2.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the First name");
				} else if (n3.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the Last name");
				} else if (n4.equals("")) {
					JOptionPane.showMessageDialog(null, "Specify the Gender");
				} else if (n5.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the DOB");
				} else if (n6.equals("")) {
					JOptionPane.showMessageDialog(null, "Enter the Address");
				} 
				 else {
				//	Insert ut = new Insert(n1, n2, n3, n4, n5, n6, n7);
				//	boolean tr = ut.add();
				/*	if (tr) {
						JOptionPane.showMessageDialog(null, "Entry successfully done");
					} else {
						JOptionPane.showMessageDialog(null, "ID already used");
					}*/
				}
			}
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tf1.setText("");
				tf2.setText("");
				tf5.setText("");
				tf7.setText("");
				tf8.setText("");
				p1.setText("");
				//bg.clearSelection();
			}
		});

		l1.setBounds(100, 30, 400, 30);
		l2.setBounds(80, 70, 200, 30);
		l3.setBounds(80, 110, 200, 30);
		l4.setBounds(80, 150, 200, 30);
		l5.setBounds(80, 190, 200, 30);
		l6.setBounds(80, 230, 200, 30);
		l7.setBounds(80, 270, 200, 30);
		//l8.setBounds(80, 310, 200, 30);
		// l9.setBounds(80, 350, 200, 30);
		// l10.setBounds(80, 390, 200, 30);
		// i11.setBounds(80, 430, 200, 30);
		tf1.setBounds(300, 70, 200, 30);
		tf2.setBounds(300, 110, 200, 30);
		tf5.setBounds(300, 150, 200, 30);
		jh.setBounds(300, 190, 100, 30);
		jk.setBounds(410, 190, 200, 30);
		tf7.setBounds(300, 230, 200, 30);
		tf8.setBounds(300, 270, 200, 30);
		//p1.setBounds(300, 310, 200, 30);
		// tf8.setBounds(300, 350, 200, 30);
		// tf9.setBounds(300, 390, 200, 30);
		// tf10.setBounds(300, 430, 200, 30);
		btn1.setBounds(100, 360, 100, 30);
		btn2.setBounds(250, 360, 100, 30);
		btn3.setBounds(1050, 50, 100, 30);
		tf5.requestFocus();

		jp.add(l1);
		jp.add(l2);
		jp.add(tf1);
		jp.add(l3);
		jp.add(tf2);
		jp.add(l4);
		jp.add(tf5);
		jp.add(l5);
		jp.add(jh);
		jp.add(jk);
		jp.add(l6);
		jp.add(tf7);
		jp.add(l7);
		jp.add(tf8);
		jp.add(btn3);
		//jp.add(l8);
		//jp.add(p1);
		// add(l9);
		// add(tf8);
		/*
		 * add(l10); add(tf9); add(i11); add(tf10);
		 */
		jp.add(btn1);
		jp.add(btn2);
		return jp;
	}

	public void actionPerformed(ActionEvent e) {

	}

	

	public void focusGained(FocusEvent e) {

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}
}