import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class Personal implements ActionListener,FocusListener {
	
	
	JPanel panel1;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,i11,kk;
    JTextField tf1, tf2, tf5, tf6, tf7,tf8,tf9,tf10;
    JButton btn1, btn2;
    JPasswordField p1, p2;
    public JPanel createPage1()
    {
	
    panel1 = new JPanel();
	panel1.setLayout( null );

	JLabel label1 = new JLabel( "ID:" );
	label1.setBounds( 50, 15, 150, 30 );
	panel1.add( label1 );

	final JTextField field = new JTextField();
	field.setBounds( 205, 15, 150, 30 );
	panel1.add( field );

	JLabel label2 = new JLabel( "Start Time:" );
	label2.setBounds( 50, 55, 150, 30 );
	panel1.add( label2 );

	final JTextField fieldPass = new JTextField("HH");
	fieldPass.setBounds( 205, 55, 40, 30 );
	panel1.add( fieldPass );
	fieldPass.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPass)
		{
			fieldPass.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPass)
		{
			
			fieldPass.setText(fieldPass.getText());
			
		}
		
	}
	});
	
	final JTextField fieldPass1 = new JTextField("MM");
	fieldPass1.setBounds( 250, 55, 40, 30 );
	panel1.add( fieldPass1 );
	fieldPass1.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPass1)
		{
			fieldPass1.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPass1)
		{
			if(fieldPass1.getText()=="")
			
			fieldPass1.setText("MM");
			
		}
		
	}
	});
	
	final JTextField fieldPass2 = new JTextField("SS");
	fieldPass2.setBounds( 295, 55, 40, 30 );
	panel1.add( fieldPass2 );
	fieldPass2.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPass2)
		{
			fieldPass2.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPass2)
		{
			
			fieldPass2.setText(fieldPass2.getText());
			
		}
		
	}
	});
	JLabel jl=new JLabel("Finish Time");
	jl.setBounds(50,95,150,30);
	panel1.add(jl);
	
	
	final JTextField fieldPas = new JTextField("HH");
	fieldPas.setBounds( 205, 95, 40, 30 );
	panel1.add( fieldPas );
	fieldPas.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPas)
		{
			fieldPas.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPas)
		{
			
			fieldPas.setText(fieldPas.getText());
			
		}
		
	}
	});
	
	final JTextField fieldPas1 = new JTextField("MM");
	fieldPas1.setBounds( 250, 95, 40, 30 );
	panel1.add( fieldPas1 );
	fieldPas1.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPas1)
		{
			fieldPas1.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPas1)
		{
			
			fieldPas1.setText(fieldPas1.getText());
			
		}
		
	}
	});
	
	final JTextField fieldPas2 = new JTextField("SS");
	fieldPas2.setBounds( 295, 95, 40, 30 );
	panel1.add( fieldPas2 );	
	fieldPas2.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==fieldPas2)
		{
			fieldPas2.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==fieldPas2)
		{
			
			fieldPas2.setText(fieldPas2.getText());
			
		}
		
	}
	});
	
	JLabel jl1=new JLabel("Past Experience");
	jl1.setBounds(50,135,150,30);
	panel1.add(jl1);
	
	final JTextField fieldcount=new JTextField();
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
	final JTextField jn=new JTextField();
	jn.setBounds(205, 215, 150, 30);
	panel1.add(jn);
	final JLabel jg1=new JLabel("PL");
	jg1.setBounds(50, 255, 150, 30);
	
	panel1.add(jg1);
	final JTextField jn1=new JTextField("PL");
	jn1.setBounds(205, 255, 150, 30);
	panel1.add(jn1);
	jn1.addFocusListener(new FocusListener()
	{
      public void focusGained(FocusEvent e) {
		if(e.getSource()==jn1)
		{
			jn1.setText("");
		}
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource()==jn1)
		{
			
				jn1.setText("pl");
			
		}
		
	}
	});
	
	JLabel jg2=new JLabel("CL");
	jg2.setBounds(50, 295, 150, 30);
	panel1.add(jg2);
	final JTextField jn2=new JTextField();
	jn2.setBounds(205, 295, 150, 30);
	panel1.add(jn2);
	JLabel jg3=new JLabel("SPL");
	jg3.setBounds(50, 335, 150, 30);
	panel1.add(jg3);
	final JTextField jn3=new JTextField();
	jn3.setBounds(205, 335, 150, 30);
	panel1.add(jn3);
	JLabel jg4=new JLabel("ALLOWANCES");
	jg4.setBounds(50, 375, 150, 30);
	panel1.add(jg4);
	final JTextField jn4=new JTextField();
	jn4.setBounds(205, 375, 150, 30);
	panel1.add(jn4);
	JButton jbt=new JButton("SUBMIT");
	JButton jbt1=new JButton("CLEAR");
	jbt.setBounds(50, 490,90, 40);
	jbt1.setBounds(160, 490,90, 40);
	panel1.add(jbt);
	panel1.add(jbt1);
	jbt1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			field.setText("");
			fieldPass.setText("");
			jn.setText("");
			jn1.setText("");
			jn2.setText("");
			jn3.setText("");
			fieldcount.setText("");
			fieldPas1.setText("");
			fieldPass1.setText("");
			fieldPas2.setText("");
			jn4.setText("");
			fieldPass2.setText("");
			fieldPas.setText("");
			
		}
			
		
	});
	JLabel jk=new JLabel("CATEGORY");
	jk.setBounds(50,435,80,30);
    panel1.add(jk);
	JRadioButton jb=new JRadioButton("Employee");
	JRadioButton jb1=new JRadioButton("HOD");
	JRadioButton jb2=new JRadioButton("HR MANAGER");
	ButtonGroup bg=new ButtonGroup();
	bg.add(jb);;
	bg.add(jb1);
	bg.add(jb2);
	jb.setBounds(150,435,80,30);
	jb1.setBounds(250,435,80,30);
	jb2.setBounds(340,435,120,30);
	panel1.add(jb);
	panel1.add(jb1);
	panel1.add(jb2);
	JButton btn=new JButton("LOGOUT");
	btn.setBounds(1050, 50, 100, 30);
	panel1.add(btn);
	/*ImageIcon kk=new ImageIcon("lnm.png");
	kk.setDescription("LNMIIT");
	
	JLabel jj=new JLabel(kk);
	//jj.setBorder(null);
	jj.setBounds(500, 50, 700, 600);
	panel1.add(jj);*/
	return panel1;
	
	
	
}
     
	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

}
