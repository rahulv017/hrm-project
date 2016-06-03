
 import java.awt.*;
  import java.awt.event.*;
  import java.applet.*;
  import javax.swing.*;
  import java.util.*;

 public class refrence extends JFrame implements ActionListener
 {
      public JPanel pane;
      public JButton b1;
      public TextArea t;


 public refrence()
   {
		setTitle("References prefered");
		pane=(JPanel)getContentPane();
		pane.setLayout(null);
		

		JLabel j=new JLabel(" References  ");
		j.setFont(new Font("monotype corsiva",Font.ITALIC,16));
		j.setBounds(300,20,250,50);
		pane.add(j);

		

		String val="      "
       "+"
                           "      
       "+
                           "      
       "+
                           "      
       "+
                           "      
       "+
                           " Project Title: HRMS Automation



"+

                         





  "References



"+

    " 1.  Java Swing Programming Published by : Rock's Publication 



"+

	
 
    " 2.  SQL Server 7.0  Published by : TMH Publications



"+


	" 3.  Java2 Complete Refference   Published by : Techmedia    Author : Arman Danesh



"+
 


   "  4.  The Complete Reference of Java2  Published by : Tata McGraw HillAuthor : Patric Naughton, Herbert Schildt 



"+
	
	
	" 5.  HTML4.0  Published by : BPB Publications



"+

"For more information mail us at:

"+

"mr_pandey@rediffmail.com
"+





"WEB REFERENCES:

"+

	"http:www.sun.com
"+
	"http:www.jsptut.com
"+
"

";


t=new TextArea(10,6);
	t.setText(val);
	t.setBounds(30,50,700,450);
     t.setBackground(Color.pink);	
              t.setForeground(Color.black);
              Font f2=new Font("Arial",Font.ITALIC,12);
		t.setFont(f2);	
		t.setEnabled(true);
              
               b1=new JButton("Cancle");
               pane.add(b1);          
               b1.setBounds(600,10,100,30);
               b1.setFont(f2);
		   b1.setBackground(Color.blue);
           b1.setForeground(Color.white);
               pane.add(t);
               b1.addActionListener(this);
               
     }

public void actionPerformed(ActionEvent a)
{
String s3="Cancle";
String str=a.getActionCommand();

if(s3.equals(str))
{
 this.dispose();
}
}  
public static void main(String args[])
{
ref f=new ref();
f.setVisible(true);
f.setSize(800,600);
f.show();
}  	
} 
