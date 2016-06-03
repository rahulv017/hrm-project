import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Delete {
	
	
	JPanel panel4,pan;
	
	
	
	public JPanel createPage7()
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
		final JButton jk=new JButton("SUBMIT");
		jk.setBounds(510, 180, 100, 30);
		panel4.add(jk);
		panel4.setVisible(true);
		jk.addActionListener(new ActionListener()
				{
					 public void actionPerformed(ActionEvent e)
					 {
						 
					 }
			
		});
		JButton btn=new JButton("LOGOUT");
		btn.setBounds(1050, 50, 100, 30);
		panel4.add(btn);
		return panel4;
				
	}

}
