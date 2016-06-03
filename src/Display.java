
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
public class Display extends JFrame{
	private JLabel item1;
	private JLabel item2;
	protected JTextField r1;
	protected JPasswordField r2;
	/*protected JRadioButton res1;
	protected JRadioButton res2;
	protected JRadioButton res3;*/
	protected JButton calc;
	public Display(){
		super("Login Form");
		setLayout(new FlowLayout());
		item1 = new JLabel("ID  ");
		item2 = new JLabel("Password");
		r1 = new JTextField("");
		r2 = new JPasswordField("");
		/*res1 = new JRadioButton("Employee");
		res2 = new JRadioButton("Department Manager");
		res3 = new JRadioButton("HR Manager");*/
		calc = new JButton("Login");
		r1.setPreferredSize(new Dimension(50,20));
		r2.setPreferredSize(new Dimension(50,20));
		add(item1);
		add(r1);
		add(item2);
		add(r2);
		/*add(res1);
		add(res2);
		add(res3);*/
		add(calc);
		Handler result = new Handler();
		r1.addActionListener(result);
		r2.addActionListener(result);
		/*res1.addActionListener(result);
		res2.addActionListener(result);
		res3.addActionListener(result);*/
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
