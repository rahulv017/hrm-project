import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Front implements KeyListener {
	public static void main(String args[])
	{
		new Front();
	}
	
		Front()
		{
			GUI();
		}
		
	   public void GUI()
	   {
		   
	   
	  JFrame jf= new JFrame("hello");
	  jf.setLayout(new GridLayout(6,100));
	  jf.setSize(500, 500);
	  JPanel jp=new JPanel();
	  JPanel jp1=new JPanel();
	  jp1.setLayout(new FlowLayout());
	  //jp1.setSize(500,500);
	  
	  jp.setLayout(new GridLayout(10,1));
	 // jp.setSize(100,100);
	  JLabel jl= new JLabel("NAME");
	  jp.add(jl);
	  JLabel jl1= new JLabel("PASSWORD");
	  //jp.add(jl1);
	  JTextField jtf=new JTextField("Name");
	  jtf.setPreferredSize(new Dimension(200,20));//jtf.setBounds(10,10,1,1);
	  //jtf.setBounds(40, 10, 50, 100);
	  JTextField jtf1=new JTextField("Password");
	  jtf1.setPreferredSize(new Dimension(200,20));
	  jtf1.setBounds(10,10,1,1);
	  jtf.addKeyListener(this);
	  jtf1.addKeyListener(this);
	  jf.add(jp);
	  jp.add(jtf);
	  jp.add(jl1);
	  jp.add(jtf1);
	  jp1.setLayout(new FlowLayout());
	  JLabel j11= new JLabel("DOB");
	  JLabel j12= new JLabel("STATE");
	  JLabel j13= new JLabel("COUNTRY");
	  JLabel j14= new JLabel("PINCODE");
	  JTextField jtf11=new JTextField("DOB");
	  JTextField jtf12=new JTextField("STATE");
	  JTextField jtf13=new JTextField("COUNTRY");
	 // JTextField jtf14=new JTextField("PINCODE");
	  jtf11.setPreferredSize(new Dimension(200,20));//jtf
	  jtf12.setPreferredSize(new Dimension(200,20));//jtf
	  //jtf13.setPreferredSize(new Dimension(200,20));//jtf
	 // jtf14.setPreferredSize(new Dimension(200,20));//jtf
	  jtf11.addKeyListener(this);
	  jtf12.addKeyListener(this);
	  jtf13.addKeyListener(this);
	  //jtf14.addKeyListener(this);
	  jp.add(j11);
	  jp.add(jtf11);
	  jp1.add(j12);
	  jp1.add(jtf12);
	  jp1.add(j13);
	  jp1.add(jtf13);
	  //jp1.add(jp1);
	  jp1.add(j14);
	  //jp1.add(jtf14);
	  jp.add(jp1);
	 /* JLabel j22= new JLabel("EMAIL");
	  JLabel j23= new JLabel("QUALIFICATION");
	  JLabel j24= new JLabel("ADDRESS");
	  JTextField jtf121=new JTextField("EMAIL");
	  JTextField jtf122=new JTextField("QUALIFICATION");
	  JTextField jtf123=new JTextField("ADDRESS");
	  jp.add(j22);
	  jp.add(jtf121);
	  jp.add(j23);
	  jp.add(jtf122);
	  jp.add(j24);
	  jp.add(jtf123);
	  //jf.add(jp1);*/
	  
	  jf.setVisible(true);
	   }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	  
	  
       	  

    }

