
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
public class Register extends JPanel{
	private JLabel item1;
	private JLabel item2;
	private JLabel item3;
	private JLabel item4;
	private JLabel item5;
	private JLabel item6;
	private JLabel item7;
	private JLabel item8;
	private JLabel item9;
	private JLabel item10;
	private JLabel item11;
	private JTextField r1;
	private JPasswordField r2;
	private JTextArea r3;
	private JTextField r4;
	private JTextField r5;
	private JTextField r6;
	private JTextField r7;
	private JTextField r8;
	private JTextField r9;
	private JTextField r10;
	private JTextField r11;
	private JPanel p2;
	private JRadioButton s1;
	private JRadioButton s2;
	private JButton calc;
	public Register(){
		//super("Login Form");
		setLayout(new FlowLayout());
		item1 = new JLabel("Name");
		item2 = new JLabel("Password");
		item3 = new JLabel("Experience");
		item4 = new JLabel("DOB");
		item5 = new JLabel("Qualifications");
		item6 = new JLabel("Address");
		item7 = new JLabel("E-mail");
		item8 = new JLabel("Phone-No");
		item9 = new JLabel("Start Time");
		item10 = new JLabel("End Time");
		item11 = new JLabel("Department");
		r1 = new JTextField("");
		r2 = new JPasswordField("");
		r3 = new JTextArea("");
		r4 = new JTextField("");
		r5 = new JTextField("");
		r6 = new JTextField("");
		r7 = new JTextField("");
		r8 = new JTextField("");
		r9 = new JTextField("");
		r10 = new JTextField("");
		r11 = new JTextField("");
		s1 = new JRadioButton("Male");
		s2 = new JRadioButton("Female");
		calc = new JButton("Login");
		p2 = new JPanel();
		p2.setName("Gender");
		p2.add(s1);
		p2.add(s2);
		r1.setPreferredSize(new Dimension(50,20));
		r2.setPreferredSize(new Dimension(50,20));
		r3.setPreferredSize(new Dimension(200,100));
		r4.setPreferredSize(new Dimension(50,20));
		r5.setPreferredSize(new Dimension(50,20));
		r6.setPreferredSize(new Dimension(50,20));
		r7.setPreferredSize(new Dimension(50,20));
		r8.setPreferredSize(new Dimension(50,20));
		r9.setPreferredSize(new Dimension(50,20));
		r10.setPreferredSize(new Dimension(50,20));
		r11.setPreferredSize(new Dimension(50,20));
		add(item1);
		add(r1);
		add(item2);
		add(r2);
		add(item5);
		add(r3);
		add(item3);
		add(r4);
		add(item4);
		add(r5);
		add(item6);
		add(r6);
		add(item7);
		add(r7);
		add(item8);
		add(r8);
		add(item9);
		add(r9);
		add(item10);
		add(r10);
		add(item11);
		add(r11);
		add(p2);
		add(calc);
		Handler result = new Handler();
		r1.addActionListener(result);
		r2.addActionListener(result);
		
		r4.addActionListener(result);
		r5.addActionListener(result);
		r6.addActionListener(result);
		r7.addActionListener(result);
		r8.addActionListener(result);
		r9.addActionListener(result);
		r10.addActionListener(result);
		r11.addActionListener(result);
		calc.addActionListener(result);
	}
	private class Handler implements ActionListener {
		public void actionPerformed(ActionEvent ev){
			String n1 = r1.getText();
			String n2 = r2.getText();
			if(n1=="")
				JOptionPane.showMessageDialog(null,"Enter your ID ");
			if(n2=="")
				JOptionPane.showMessageDialog(null,"Enter your Password ");
			if(n1!="" && n2!=""){
				
			}
		}
	}
}
