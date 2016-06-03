
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.xml.bind.ValidationEvent;

class TabbedPaneExample 
		extends 	JFrame implements KeyListener,ActionListener
{
	private		JTabbedPane tabbedPane;
	private		JPanel		panel1;
	private		JPanel		panel2;
	private		JPanel		panel3;
	private		JPanel		panel4;


	JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,i11,kk;
    JTextField tf1, tf2, tf5, tf6, tf7,tf8,tf9,tf10;
    JButton btn1, btn2;
    JPasswordField p1, p2;
	public TabbedPaneExample()
	{
				
		setTitle( "Tabbed Pane Application" );
		setSize( 300, 200 );
		setBackground( Color.gray );

		JPanel topPanel = new JPanel();
		kk=new JLabel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create the tab pages
		Personal per=new Personal();
		panel1=per.createPage1();
		Update up=new Update();
		panel2=up.createPage2();
		Leaves lev=new Leaves();
		panel3=lev.createPage3();
        Password pass=new Password();
        panel4=pass.createPage6();
		// Create a tabbed pane
		tabbedPane = new JTabbedPane();
		tabbedPane.addTab( "Pesonal Info", panel1 );
		tabbedPane.addTab( "Update info", panel2 );
		tabbedPane.addTab( "Leave info", panel3 );
		tabbedPane.addTab( "Password", panel4);
		topPanel.add( tabbedPane, BorderLayout.CENTER );
	}

	/*public void createPage1()
	{
		panel1 = new JPanel();
		panel1.setLayout( null );

		JLabel label1 = new JLabel( "ID:" );
		label1.setBounds( 50, 15, 150, 30 );
		panel1.add( label1 );

		JTextField field = new JTextField();
		field.setBounds( 205, 15, 150, 30 );
		panel1.add( field );

		JLabel label2 = new JLabel( "Start Time:" );
		label2.setBounds( 50, 55, 150, 30 );
		panel1.add( label2 );

		JTextField fieldPass = new JTextField("HH");
		fieldPass.setBounds( 205, 55, 40, 30 );
		panel1.add( fieldPass );
		
		JTextField fieldPass1 = new JTextField("MM");
		fieldPass1.setBounds( 250, 55, 40, 30 );
		panel1.add( fieldPass1 );
		
		JTextField fieldPass2 = new JTextField("SS");
		fieldPass2.setBounds( 295, 55, 40, 30 );
		panel1.add( fieldPass2 );
		
		JLabel jl=new JLabel("Finish Time");
		jl.setBounds(50,95,150,30);
		panel1.add(jl);
		
		
		JTextField fieldPas = new JTextField("HH");
		fieldPas.setBounds( 205, 95, 40, 30 );
		panel1.add( fieldPas );
		
		JTextField fieldPas1 = new JTextField("MM");
		fieldPas1.setBounds( 250, 95, 40, 30 );
		panel1.add( fieldPas1 );
		
		JTextField fieldPas2 = new JTextField("SS");
		fieldPas2.setBounds( 295, 95, 40, 30 );
		panel1.add( fieldPas2 );	
		
		JLabel jl1=new JLabel("Past Experience");
		jl1.setBounds(50,135,150,30);
		panel1.add(jl1);
		
		JTextField fieldcount=new JTextField();
		fieldcount.setBounds(205, 135, 150, 30);
		panel1.add(fieldcount);
		
		JLabel j1=new JLabel("Department");
		j1.setBounds(50, 175,150, 30);
		panel1.add(j1);
		JComboBox<String> jc=new JComboBox<String>();
		jc.addItem("Software Dept");
		jc.addItem("Buissness Analyst");
		jc.addItem("Web Developer");
		jc.addItem("Android  Developer");
		jc.setBounds(205, 175, 150, 30);
		panel1.add(jc);
		JLabel jg=new JLabel("Salary");
		jg.setBounds(50, 215, 150, 30);
		panel1.add(jg);
		JTextField jn=new JTextField();
		jn.setBounds(205, 215, 150, 30);
		panel1.add(jn);
		JLabel jg1=new JLabel("PL");
		jg1.setBounds(50, 255, 150, 30);
		panel1.add(jg1);
		JTextField jn1=new JTextField();
		jn1.setBounds(205, 255, 150, 30);
		panel1.add(jn1);
		JLabel jg2=new JLabel("CL");
		jg2.setBounds(50, 295, 150, 30);
		panel1.add(jg2);
		JTextField jn2=new JTextField();
		jn2.setBounds(205, 295, 150, 30);
		panel1.add(jn2);
		JLabel jg3=new JLabel("SPL");
		jg3.setBounds(50, 335, 150, 30);
		panel1.add(jg3);
		JTextField jn3=new JTextField();
		jn3.setBounds(205, 335, 150, 30);
		panel1.add(jn3);
		JLabel jg4=new JLabel("ALLOWANCES");
		jg4.setBounds(50, 375, 150, 30);
		panel1.add(jg4);
		JTextField jn4=new JTextField();
		jn4.setBounds(205, 375, 150, 30);
		panel1.add(jn4);
		JButton jbt=new JButton("SUBMIT");
		JButton jbt1=new JButton("CLEAR");
		jbt.setBounds(50, 415,90, 40);
		jbt1.setBounds(160, 415,90, 40);
		panel1.add(jbt);
		panel1.add(jbt1);
		/*ImageIcon kk=new ImageIcon("lnm.png");
		kk.setDescription("LNMIIT");
		
		JLabel jj=new JLabel(kk);
		//jj.setBorder(null);
		jj.setBounds(500, 50, 700, 600);
		panel1.add(jj);*/
		
		
	

	/*public void createPage2()
	{
		 panel2=new JPanel();
		 panel2.setLayout(null);
		
		l1 = new JLabel("Registration Form in Windows Form:");
        //l1.setForeground(Color.blue);
       // l1.setFont(new Font("Serif", Font.BOLD, 20));
        
        l2 = new JLabel("Name:");
        l3 = new JLabel("Email-ID:");
        l4 = new JLabel("Create Passowrd:");
        l5 = new JLabel("Confirm Password:");
        l6 = new JLabel("Country:");
        l7 = new JLabel("State:");
        l8 = new JLabel("Phone No:"); 
         l9= new JLabel("ADDRESS");
         l10= new JLabel("E-MAIL");
         i11=new JLabel("QUALIFIACTION");
        tf1 = new JTextField();
        tf2 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        tf5 = new JTextField();
        tf6 = new JTextField();
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
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30);
        l9.setBounds(80, 350, 200, 30);
        l10.setBounds(80, 390, 200, 30);
        i11.setBounds(80, 430, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 150, 200, 30);
        p2.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        tf8.setBounds(300, 350, 200, 30);
        tf9.setBounds(300, 390, 200, 30);
        tf10.setBounds(300, 430, 200, 30);
        btn1.setBounds(100, 470, 100, 30);
        btn2.setBounds(250, 470, 100, 30);
        kk.setBounds(350, 500, 20, 25);
       // tf1.addKeyListener(this);
        tf2.addKeyListener(this);
         
        panel2.add(l1);
        panel2.add(l2);
        panel2.add(tf1);
        panel2.add(l3);
        panel2.add(tf2);
        panel2.add(l4);
        panel2.add(p1);
        panel2.add(l5);
        panel2.add(p2);
        panel2.add(l6);
        panel2.add(tf5);
        panel2.add(l7);
        panel2.add(tf6);
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
        btn1.addActionListener(this);
        panel2.add(kk);
        
	}*/

	/*public void createPage3()
	{
		panel3 = new JPanel();
		panel3.setLayout( null );
        JLabel jl=new JLabel("Employee ID");
        JTextField jt1=new JTextField();
        JLabel jl1=new JLabel("FROM DATE");
        JTextField jt2=new JTextField();
        JLabel jl2=new JLabel("TO DATE");
        JTextField jt3=new JTextField();
        JLabel jl4=new JLabel("TOTAL LEAVES");
        JTextField jt5=new JTextField();
        JLabel jl3=new JLabel("REASON");
        JTextField jt4=new JTextField();
        JLabel jl5=new JLabel("TYPE OF LEAVES");
        JRadioButton jb=new JRadioButton("Paid");
       // panel3.add(jb);
        JRadioButton jb1=new JRadioButton("MEDICAL");
       // panel3.add(jb1);
        JRadioButton jb2=new JRadioButton("NON");
        //panel3.add(jb2);
        JRadioButton jb3=new JRadioButton("Special");
        //panel3.add(jb3);
        ButtonGroup bg=new ButtonGroup();
        bg.add(jb);
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);
        JButton jk=new JButton("SUBMIT");
        JButton jk1=new JButton("CLEAR");
        
        jl.setBounds(200, 50, 100, 30);
        jt1.setBounds(300, 50, 100, 30);
        jl1.setBounds(200, 100, 100, 30);
        jt2.setBounds(300, 100, 100, 30);
        jl2.setBounds(450, 100, 100, 30);
        jt3.setBounds(550, 100, 100, 30);
        jl4.setBounds(200, 150, 100, 30);
        jt5.setBounds(300, 150, 100, 30);
        jl3.setBounds(200, 200, 100, 30);
        jt4.setBounds(300, 200, 400, 50);
        jl5.setBounds(200, 270, 100, 30);
        jb.setBounds(200, 300,150, 40);
        jb1.setBounds(350, 300,150, 40);
        jb2.setBounds(500, 300,150, 40);
        jb3.setBounds(650, 300,150, 40);
        jk.setBounds(200, 350, 80, 40);
        jk1.setBounds(350, 350, 80, 40);
        panel3.add(jl);
        panel3.add(jt1);
        panel3.add(jl1);
        panel3.add(jt2);
        panel3.add(jl2);
        panel3.add(jt3);
        panel3.add(jl4);
        panel3.add(jt5);
       panel3.add(jl3);
        panel3.add(jt4);
       panel3.add(jl5);
      panel3.add(jb);
      panel3.add(jb1);
      panel3.add(jb2);
      panel3.add(jb3);
      panel3.add(jk);
      panel3.add(jk1);

       
        
        
		
	}*/

    // Main method to get things started
	public static void main( String args[] )
	{
		// Create an instance of the test application
		TabbedPaneExample mainFrame	= new TabbedPaneExample();
		mainFrame.setVisible( true );
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
		 
			         
		
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		 String txt=tf2.getText();
		  if(txt=="kk")
		  {
			  int tt=JOptionPane.showConfirmDialog(tf2, "please enter some values","hello",JOptionPane.NO_OPTION);
			  if(tt==JOptionPane.NO_OPTION)
			  {
				  tf2.setText("ok");
				  //panel2.add(tf2);
			  }
		  }
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		 String txt=tf2.getText();
		  if(txt=="kk")
		  {
			  int tt=JOptionPane.showConfirmDialog(tf2, "please enter some values","hello",JOptionPane.NO_OPTION);
			  if(tt==JOptionPane.NO_OPTION)
			  {
				  tf2.setText("ok");
				  //panel2.add(tf2);
			  }
		  }
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
}
}