import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class End extends JFrame implements ActionListener{
	JPanel jp=new JPanel();
	JPanel jp1=new JPanel();

	  End()
  {
	 
	  //JPanel jp1=new JPanel();
	  JPanel jp2=new JPanel();
  
	  setSize(400,400);
	  JButton jt= new JButton("personal info");
	  JButton jt1= new JButton("update info");
	  JButton jt2= new JButton("Leave info");

	  //jt.addTab("personal info",jp);
	 // jt.add("Attandance", jp1);
	  //jt.add("Update INFO",jp2);
	  jt.addActionListener(this);
	  jt1.addActionListener(this);
	  jt2.addActionListener(this);

	  //add(jp1);
	  jp1.add(jt);
	  jp1.add(jt1);
	  jp1.add(jt2);
	//  jp1.add(jp);
	  add(jp1);
	      
	  setVisible(true);
	   
  }
	  public static void main(String args[])
	  {
		  new End();
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
		Registration reg= new Registration();
		//add(reg);
		//setVisible(true);
		
	}
		      }



   
  
