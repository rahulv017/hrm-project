import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Update implements ActionListener {
	
	JPanel panel2;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,i11,kk;
    JTextField tf1, tf2, tf5, tf6, tf7,tf8,tf9,tf10,tf11;
    JButton btn1, btn2,jbl;
    JPasswordField p1, p2;
	
	
	public JPanel createPage2()
	{
		 panel2=new JPanel();
		 panel2.setLayout(null);
		
		l1 = new JLabel("Registration Form in Windows Form:");
        //l1.setForeground(Color.blue);
       // l1.setFont(new Font("Serif", Font.BOLD, 20));
        
        l2 = new JLabel("Name:(*)");
        l3 = new JLabel("Email-ID:(*)");
       // l4 = new JLabel("Create Passowrd:(*)");
        l5 = new JLabel("Confirm Password:(*)");
       // l6 = new JLabel("Country:(*)");
       // l7 = new JLabel("State:(*)");
        l8 = new JLabel("Phone No:(*)"); 
         l9= new JLabel("ADDRESS:(*)");
         l10= new JLabel("E-MAIL;(*)");
         i11=new JLabel("QUALIFIACTION:(*)");
        tf1 = new JTextField();
        tf2 = new JTextField();
      //  p1 = new JPasswordField();
        p2 = new JPasswordField();
      //  tf5 = new JTextField();
      //  tf6 = new JTextField();
        tf7 = new JTextField();
         tf8=new JTextField();
         tf9=new JTextField();
         tf10=new JTextField();
       
 
        btn1 = new JButton("Submit");
        btn2 = new JButton("Clear");
 
        //btn1.addActionListener(this);
        //btn2.addActionListener(this);
 
        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
       // l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 150, 200, 30);
       // l6.setBounds(80, 230, 200, 30);
      //  l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 190, 200, 30);
        l9.setBounds(80, 230, 200, 30);
        l10.setBounds(80, 270, 200, 30);
        i11.setBounds(80, 310, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
       // p1.setBounds(300, 150, 200, 30);
        p2.setBounds(300, 150, 200, 30);
      //  tf5.setBounds(300, 230, 200, 30);
     //   tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 190, 200, 30);
        tf8.setBounds(300, 230, 200, 30);
        tf9.setBounds(300, 270, 200, 30);
        tf10.setBounds(300, 310, 200, 30);
        btn1.setBounds(100, 370, 100, 30);
        btn2.setBounds(250, 370, 100, 30);
       // kk.setBounds(350, 500, 20, 25);
       // tf1.addKeyListener(this);
        //tf2.addKeyListener(this);
      jbl=new JButton("Enter");
        jbl.setBounds(550, 110, 100, 30);
        jbl.addActionListener(this);
                
        panel2.add(l1);
        panel2.add(l2);
        panel2.add(tf1);
        panel2.add(l3);
        panel2.add(tf2);
        panel2.add(jbl);
       // panel2.add(tf11);
     //   panel2.add(l4);
      //  panel2.add(p1);
        panel2.add(l5);
        panel2.add(p2);
       // panel2.add(l6);
       // panel2.add(tf5);
       // panel2.add(l7);
      //  panel2.add(tf6);
        panel2.add(l8);
        panel2.add(tf7);
        panel2.add(l9);
        panel2.add(tf8);
        panel2.add(l10);
        panel2.add(tf9);
        panel2.add(i11);
        panel2.add(tf10);
        panel2.add(btn1);
        panel2.add(btn2);
		JLabel jj1=new JLabel("(*) fields are mandatory");
		jj1.setBounds(600, 300, 400, 90);
		panel2.add(jj1);

      //  btn1.addActionListener(this);
        //panel2.add(kk);
		return panel2;
        
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	   tf11=new JTextField();
		tf11.setBounds(400, 600, 200, 30);
		 panel2.add(tf11);
		// tf11.setVisible(true);
		

	}


}
