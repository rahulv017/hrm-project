import javax.swing.*;
import java.util.*;
public class Pane extends JFrame
{
	Pane()
	{
		setTitle("This is by Jtabbed Pane");
		setSize(400,400);
	//	JPanel jp=new JPanel();
		JLabel jl= new JLabel("FRONT END");
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Personal info",  JPanel());
		jtp.addTab("update info", jp2);
		
		public  JPanel jp ()
		{
			
		
		JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,i11;
	    JTextField tf1, tf2, tf5, tf6, tf7,tf8,tf9,tf10;
	    JButton btn1, btn2;
	    JPasswordField p1, p2;
	    l2 = new JLabel("Name:");
        l3 = new JLabel("Email-ID:");
        l4 = new JLabel("Create Passowrd:");
        l5 = new JLabel("Confirm Password:");
        l6 = new JLabel("Country:");
        l7 = new JLabel("State:");
        l8 = new JLabel("Phone No:"); 
        tf1 = new JTextField();
        tf2 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        //l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 150, 200, 30);
        p2.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        add(jp1);
        
        jp.add(l2);
        jp.add(tf1);
        jp.add(l3);
        jp.add(tf2);
        jp.add(l4);
        jp.add(p1);
        jp.add(l5);
        jp.add(p2);
        jp.add(l6);
        jp.add(tf5);
        jp.add(l7);
        jp.add(tf6);
        jp.add(l8);
        jp.add(tf7);
        jp1.add(jp);;
		}
        setVisible(true);

		
	}
	public static void main(String args[])
	{
		new Pane();
	}
}