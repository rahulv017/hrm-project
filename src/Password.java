import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Password extends JFrame implements ItemListener  {
	public JPanel createPage6()
	{
		final JPanel jv=new JPanel();
		jv.setLayout(null);
		//setLayout(null);
		//setVisible(true);
		//JPanel jp=new JPanel();
		//add(jp);
		//jp.setLayout(null);
		JLabel j1=new JLabel("Password");
		j1.setBounds(100, 50, 100, 30);
		jv.add(j1);
		JLabel jl=new JLabel("OLD PASSWORD");
		jl.setBounds(50,100,120,30);
		jv.add(jl);
		final JTextField ju=new JTextField();
		ju.setBounds(600, 100, 120, 30);
		ju.setVisible(false);
		final JPasswordField jt=new JPasswordField();
		JCheckBox jc=new JCheckBox();
		jc.setBounds(400, 100, 30, 30);
		JLabel jm=new JLabel("show password");
		jm.setBounds(450, 100, 1100, 30);
		jv.add(jm);
		jc.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)
				{
				ju.setText(jt.getText());
				ju.setVisible(true);
				jv.add(ju);
				}
				else
				{
					ju.setVisible(false);
				}
				
			}
			
		});
		jc.add(jt);
		jv.add(jc);
		jt.setBounds(190, 100, 120, 30);
		jv.add(jt);
		JLabel jk=new JLabel("NEW PASSWORD");
		jk.setBounds(50,200,120,30);
	     jv.add(jk);
		final JPasswordField jt1=new JPasswordField();
		jt1.setBounds(190, 200, 120, 30);
		jv.add(jt1);
		final JTextField ju1=new JTextField();
		ju1.setBounds(600, 200, 120, 30);
		ju1.setVisible(false);
		jv.add(ju1);
		//final JPasswordField jt=new JPasswordField();
		JCheckBox jc1=new JCheckBox();
		jc1.setBounds(400, 200, 30, 30);
		JLabel jm1=new JLabel("show password");
		jm1.setBounds(450, 200, 110, 30);
		jv.add(jm1);
		jc1.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)
				{
				ju1.setText(jt1.getText());
				ju1.setVisible(true);
				jv.add(ju1);
				}
				else
				{
					ju1.setVisible(false);
				}
				
			}
			
		});
		jv.add(jc1);
		
		JLabel jk1=new JLabel("RE TYPE-PASSWORD");
		jk1.setBounds(50,300,120,30);
		jv.add(jk1);
		final JPasswordField jt2=new JPasswordField();
		jt2.setBounds(190, 300, 120, 30);
		jv.add(jt2);
	
		final JTextField ju2=new JTextField();
		ju2.setBounds(600, 300, 120, 30);
		ju2.setVisible(false);
		jv.add(ju2);
		//final JPasswordField jt=new JPasswordField();
		JCheckBox jc2=new JCheckBox();
		jc2.setBounds(400, 300, 30, 30);
		JLabel jm2=new JLabel("show password");
		jm2.setBounds(450, 300, 110, 30);
		jv.add(jm2);
		jc2.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED)
				{
				ju2.setText(jt2.getText());
				ju2.setVisible(true);
				jv.add(ju2);
				}
				else
				{
					ju2.setVisible(false);
				}
				
			}
					});
		jv.add(jc2);

        JButton jbl=new JButton("SUBMIT");
        jbl.setBounds(100, 400, 100, 30);
        jv.add(jbl);
        JButton btn=new JButton("LOGOUT");
    	btn.setBounds(1050, 50, 100, 30);
    	jv.add(btn);
		return jv;
         

	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
