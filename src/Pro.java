import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Pro extends JFrame {
	
	
	Pro()
	{
		createPage1();
	}
	
	
	JPanel panel1;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,i11,kk;
    JTextField tf1, tf2, tf5, tf6, tf7,tf8,tf9,tf10;
    JButton btn1, btn2;
    JPasswordField p1, p2;
    public void createPage1()
    {
	
    //panel1 = new JPanel();
	setLayout( null );
	setVisible(true);

	/*JLabel label1 = new JLabel( "ID:" );
	label1.setBounds( 50, 15, 150, 30 );
	add( label1 );

	JTextField field = new JTextField();
	field.setBounds( 205, 15, 150, 30 );
	add( field );*/

	JLabel label2 = new JLabel( "Start Time:" );
	label2.setBounds( 50, 55, 150, 30 );
	add( label2 );

	final JTextField fieldPass = new JTextField("HH");
	fieldPass.setBounds( 205, 55, 40, 30 );
     add( fieldPass );
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
	add( fieldPass1 );
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
	add( fieldPass2 );
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
	add(jl);
	
	
	final JTextField fieldPas = new JTextField("HH");
	fieldPas.setBounds( 205, 95, 40, 30 );
	add( fieldPas );
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
	add( fieldPas1 );
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
	add( fieldPas2 );	
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
	add(jl1);
	
	JTextField fieldcount=new JTextField();
	fieldcount.setBounds(205, 135, 150, 30);
	add(fieldcount);
	
	JLabel j1=new JLabel("Department");
	j1.setBounds(50, 175,150, 30);
	add(j1);
	JComboBox<String> jc=new JComboBox<String>();
	jc.addItem("Software Dept");
	jc.addItem("Buissness Analyst");
	jc.addItem("Web Developer");
	jc.addItem("Android  Developer");
	jc.setBounds(205, 175, 150, 30);
	add(jc);
	JLabel jg=new JLabel("Salary");
	jg.setBounds(50, 215, 150, 30);
	add(jg);
	JTextField jn=new JTextField();
	jn.setBounds(205, 215, 150, 30);
	add(jn);
	final JLabel jg1=new JLabel("PL");
	jg1.setBounds(50, 255, 150, 30);
	
	add(jg1);
	final JTextField jn1=new JTextField("PL");
	jn1.setBounds(205, 255, 150, 30);
	add(jn1);
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
	add(jg2);
	JTextField jn2=new JTextField();
	jn2.setBounds(205, 295, 150, 30);
	add(jn2);
	JLabel jg3=new JLabel("SPL");
	jg3.setBounds(50, 335, 150, 30);
	add(jg3);
	JTextField jn3=new JTextField();
	jn3.setBounds(205, 335, 150, 30);
	add(jn3);
	JLabel jg4=new JLabel("ALLOWANCES");
	jg4.setBounds(50, 375, 150, 30);
	add(jg4);
	JTextField jn4=new JTextField();
	jn4.setBounds(205, 375, 150, 30);
	add(jn4);
	
	
	
	
	
	/*ImageIcon kk=new ImageIcon("lnm.png");
	kk.setDescription("LNMIIT");
	
	JLabel jj=new JLabel(kk);
	//jj.setBorder(null);
	jj.setBounds(500, 50, 700, 600);
	panel1.add(jj);*/
	
}
     public static void main(String args[])
     {
    	 new Pro();
     }
}
