import javax.swing.*;
import java.awt.*;
public class Leaves {

	
	JPanel panel3;
	
	public JPanel createPage3()
	{
		panel3 = new JPanel();
		panel3.setLayout( new FlowLayout() );
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
      JButton btn=new JButton("LOGOUT");
  	btn.setBounds(1050, 50, 100, 30);
  	panel3.add(btn);
	return panel3;
	}
	
}
