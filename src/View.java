import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class View  extends JPanel implements ActionListener{
	JPanel panel4,pan;
	
		
		
	public JPanel createPage4()
	{
		/* Personal up=new Personal();
		 pan=new JPanel();
		 pan=up.createPage1();*/
	
		panel4 = new JPanel();
		panel4.setLayout( null );
		JLabel jn=new JLabel("ENTER EMPLOYEE ID");
		jn.setBounds(400, 100, 200, 30);
		panel4.add(jn);
		JTextField jm=new JTextField();
		jm.setBounds(540, 100, 100, 30);
		panel4.add(jm);
		final JButton jk=new JButton("View Personal");
		jk.setBounds(510, 180, 150, 30);
		panel4.add(jk);
		JButton jk1=new JButton("View Proffesional");
		jk1.setBounds(700, 180, 150, 30);
		panel4.add(jk1);
		panel4.setVisible(true);
		jk.addActionListener(new ActionListener()
				{
					 public void actionPerformed(ActionEvent e)
					 {
						 Reg reg=new Reg();
						 
						 panel4.setVisible(false);
						
					 }
			
		});
		
		jk1.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				 Pro reg1=new Pro();
				 
				 panel4.setVisible(false);
				
			 }
	
});

		return panel4;
				
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
