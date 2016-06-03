



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class progressbar extends JFrame implements ActionListener
{
static ProgressMonitor pbar;
static int counter =0;
JButton b=new JButton("Click here");

public progressbar()
{
super("progress monitor demo");
setSize(300,400);
pbar=new ProgressMonitor(null,"monitor progress","Initializing....",0,100);
Timer t=new Timer(250,this);
t.start();
setVisible(true);
}
public static void main(String args[])
{
UIManager.put("progressbar.progressText","HRMS System");
UIManager.put("OptionPane.cancelButtonText","Go away");
 
 new progressbar();
       welcome f=new  welcome();
         f.setVisible(true);
         f.setSize(800,600);
        f.show();	
}
public void actionPerformed(ActionEvent e)
{
SwingUtilities.invokeLater(new Update());
if(counter==100)
{
b.setEnabled(false);
this.dispose();
} 
}

class Update implements Runnable
{
public void run()
{
if(pbar.isCanceled())
{
pbar.close();
System.exit(1);
}
pbar.setProgress(counter);
pbar.setNote("operation is"+counter+" % complete");
counter+=2;
}
}
}



/*

////////////////   welcome.java //////////////////////   
                                                              */

import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class welcome  extends JFrame implements ActionListener
{
public JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l12,l13,l14,l15,l16,l17;
public JButton b;
public JPanel panel;
Font g,h,i;
Color c; 

public welcome()
{
        g=new Font("",Font.BOLD,25);
        h=new Font("",Font.ITALIC,18);
        i=new Font("",Font.BOLD,12);
    	c =new Color(210,100,205);
        

getContentPane().setBackground(Color.orange);
panel=(JPanel)getContentPane();
panel.setLayout(null);


l=new JLabel("WELCOME");
l1=new JLabel("TO");
l2=new JLabel("WONDERFUL");
l14=new JLabel("WORLD");
l3=new JLabel("OF");
l4=new JLabel("HUMAN RESOURCE MANAGEMENT SYSTEM");
l5=new JLabel("Created by:");
l6=new JLabel("Mahaveer Pandey");
l7=new JLabel("Kanchan Pandey");
l8=new JLabel("Sushil Kumar Pandey");
l13=new JLabel("Manisha Pandey");
l9=new JLabel("Under the Guidance of:");
l10=new JLabel("Mr. Ajit Kumar Singh");
l15=new JLabel("Mr. N.K.Tyagi");
l16=new JLabel("Mr. M.R.Pandey");
l17=new JLabel("M.I.T., Bulandshahr");

l12=new JLabel("Marathawada Institute of Technology Bulandshahr, up-203001");
b=new JButton("Click here");

panel.add(l); 
l.setBounds(300,0,180,60);
l.setFont(g);

panel.add(l1);
l1.setBounds(340,70,100,30);
l1.setFont(g);

panel.add(l2);
l2.setBounds(70,100,200,60);
l2.setFont(g);
panel.add(l14);
l14.setBounds(490,100,130,60);
l14.setFont(g);


panel.add(l3);
l3.setBounds(340,140,100,30);
l3.setFont(g);

panel.add(l4);
l4.setFont(g);
l4.setBounds(100,250,700,30);

panel.add(l5);
l5.setFont(h);
l5.setBounds(60,350,150,30);

panel.add(l6);
l6.setFont(i);
l6.setBounds(100,370,150,30);

panel.add(l7);
l7.setFont(i);
l7.setBounds(100,390,150,30);

panel.add(l8);
l8.setFont(i);
l8.setBounds(100,410,150,30);

panel.add(l13);
l13.setFont(i);
l13.setBounds(100,430,150,30);

panel.add(l9);
l9.setFont(h);
l9.setBounds(450,350,200,30);


panel.add(l10);
l10.setFont(i);
l10.setBounds(470,370,180,30);

panel.add(l15);
l15.setFont(i);
l15.setBounds(470,390,180,30);

panel.add(l16);
l16.setFont(i);
l16.setBounds(470,410,180,30);

panel.add(l17);
l17.setFont(i);
l17.setBounds(470,430,180,30);

panel.add(l12);
l12.setFont(h);
l12.setBounds(180,500,500,30);

panel.add(b);
b.setBounds(320,300,110,30);
b.addActionListener(this);

}
public void actionPerformed(ActionEvent a)
{
String s1="Click here";
String str=a.getActionCommand();
if(s1.equals(str))
{
Login f=new Login();
f.setVisible(true);
f.setSize(800,600);
f.show();
Toolkit tk=f.getToolkit();
Dimension wsize=tk.getScreenSize();
f.setBounds(wsize.width/5,wsize.height/5,wsize.width/2,wsize.height/2);
this.dispose();
}
repaint();
}
public static void main(String args[])
{
        welcome f=new  welcome();
        f.setVisible(true);
        f.setSize(800,600);

        f.show();
}
}



/*

////////////////   Login.java     //////////////////////  
                                                            */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener
{ 
public JTextField t1;
public TextField t2;
public JLabel l1,l2,l3;
public JButton b1,b2;
public JPanel panel;
public Font g;

public Login()
{
g=new Font("",Font.BOLD,18);
getContentPane().setBackground(Color.magenta);
panel=(JPanel)getContentPane();
panel.setLayout(null);
l1=new JLabel("LOGIN FORM");

l2=new JLabel("LOGIN");
l3=new JLabel("PASSWORD");
t1=new JTextField(20);
t2=new TextField(20);
t2.setEchoChar('*');
b1=new JButton("OK");
b2=new JButton("EXIT");

panel.add(l1);
l1.setFont(g);
panel.add(l2);
panel.add(l3);

panel.add(t1);
panel.add(t2);
panel.add(b1);
panel.add(b2);


l1.setBounds(100,5,150,40);
l2.setBounds(30,60,100,30);
l3.setBounds(30,110,100,30);

t1.setBounds(140,60,150,30);
t2.setBounds(140,110,150,30);

b1.setBounds(140,180,60,30);
b2.setBounds(220,180,65,30);

t1.addActionListener(this);
t2.addActionListener(this);

b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent a)
{
String s1="mrp";
String s2="pandey";
String s3="OK";
String s4="EXIT";
String str=a.getActionCommand();

if(s3.equals(str))
{
if(s1.equals(t1.getText()) && s2.equals(t2.getText()))
{
this.dispose();
menu p=new menu();
        p.setVisible(true);
        p.setSize(800,700);
        p.show();
this.dispose();
}
else
{
if(s3.equals(str))
{
t1.setText("");
t2.setText("");   
JOptionPane.showMessageDialog(null,"Please varify the correct Login and Password","Warning",JOptionPane.OK_CANCEL_OPTION);
}
}
}

if( str=="EXIT")
{ 
JOptionPane.showMessageDialog(null,"The project is still in progress,do u want to quit now","Warning",JOptionPane.OK_CANCEL_OPTION);
if(s4.equals(str))
    {
   System.exit(0);
    }
    repaint();
}

}
public static void main(String args[])
{
Login f=new Login();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}

}  




/*

////////////////     menu.java         //////////////////////   
                                                                  */




import java.awt.*;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.awt.event.*;

 public class menu extends JFrame implements ActionListener
 {
public JMenu jb1,jb2,jb3,jb4,jb5,jb6,jb7;
public JPanel panel;
public  ImageIcon i,j;
public JFrame jf;

public menu()
 {
 setTitle("Main_Screen");
 setJMenuBar(menubar);
 jb1=new JMenu("About Project");
 jb7=new JMenu("Placement_Information");
 jb2=new JMenu("Training_Information");
 jb3=new JMenu("Important_Information");
 jb4=new JMenu("Available_Jobs");
 jb5=new JMenu("Help");
 jb6=new JMenu("Exit");
 JMenuItem e=new JMenuItem("Exit");
     
 menubar.add(jb1);
 menubar.add(jb7);
 menubar.add(jb2);
 menubar.add(jb3);
 menubar.add(jb4);
 menubar.add(jb5);
 menubar.add(jb6);

  JMenuItem jm1=new JMenuItem("Introduction");
 jb1.add(jm1); 
 jb6.add(e);
 jb1.addSeparator();

 JMenuItem jm2=new JMenuItem("References");
 jb1.add(jm2);
 JMenuItem jm3=new JMenu("Trainee_information");
 jb2.add(jm3);
 
 JMenuItem jm13=new JMenuItem("Master_Details");
 jm3.add(jm13);
 JMenuItem jm14=new JMenuItem("Dpt_Details");
 jm3.add(jm14);

 JMenuItem jm6=new JMenuItem("Candidate_Aggregate");
 jb3.add(jm6);
 JMenuItem jm7=new JMenuItem("Shortlisted_candidates");
 jb3.add(jm7);
  
 JMenuItem jm5=new JMenuItem("Training_Plan");
 jb4.add(jm5);
 JMenuItem jm15=new JMenuItem("Training_Criteria");
 jb4.add(jm15);
 JMenuItem jm9=new JMenuItem("Department_Training");
 jb4.add(jm9);
 JMenuItem jm8=new JMenuItem("Agencies_Information");
 jb7.add(jm8);
 JMenuItem jm12=new JMenuItem("Training_registration");
 jb7.add(jm12);

 
 JMenuItem jm10=new JMenuItem("Help");
 jb5.add(jm10);
 

  
  panel=(JPanel)getContentPane( );
       panel.setLayout(new BorderLayout());
       i=new ImageIcon("ball_ani.GIF");
       JLabel lb1=new JLabel("",i,JLabel.CENTER);
       panel.add(lb1,BorderLayout.CENTER);
      
e.addActionListener(this);

jm9.addActionListener(this);
jm1.addActionListener(this);
jm2.addActionListener(this);
jm3.addActionListener(this);
jm12.addActionListener(this);
jm5.addActionListener(this);
jm6.addActionListener(this);
jm7.addActionListener(this);
jm8.addActionListener(this);
jm10.addActionListener(this);
jm13.addActionListener(this);
jm14.addActionListener(this);
jm15.addActionListener(this);
}

public void actionPerformed(ActionEvent a)
{
  String s1="OK";
  String s2="CANCEL";
  String str=a.getActionCommand();

if( str=="Exit")
{ 
JOptionPane.showMessageDialog(null,"ARE YOU WANT TO EXIT CLICK OK","Alert",JOptionPane.OK_CANCEL_OPTION);


if(str=="Exit")
{
    System.exit(0);
    }
if(s2.equals(str))
{
    this.dispose();
    }
}
if(str=="Help")
{
help f=new help();
f.setVisible(true);
f.setSize(800,600);
f.show();
}




if(str=="Introduction")
{
intro f=new intro();
f.setVisible(true);
f.setSize(800,600);
f.show();
}
if(str=="References")
{
ref f=new ref();
f.setVisible(true);
f.setSize(800,600);
f.show();
}
if(str=="Training_Plan")
{
Plan f=new Plan();
f.setVisible(true);
f.setSize(800,600);
f.show();
}
if(str=="Shortlisted_candidates")
{
Shortlist f=new Shortlist();
f.setVisible(true);
f.setSize(800,600);
f.show();
}


if(str=="Training_Criteria")
{
job_req f=new job_req();
f.setVisible(true);
f.setSize(800,600);
f.show();
}



if(str=="Department_Training")
{
Train_exe f=new Train_exe();
f.setVisible(true);
f.setSize(800,600);
f.show();
}

if(str=="Agencies_Information")
{
Placement f=new Placement();
f.setVisible(true);
f.setSize(800,600);
f.show();
}

if(str=="Master_Details")
{
masterdetails f=new masterdetails();
f.setVisible(true);
f.setSize(800,600);
f.show();
}

if(str=="Dpt_Details")
{
masterdetails01 f=new masterdetails01();
f.setVisible(true);
f.setSize(800,600);
f.show();
}

if(str=="Candidate_Aggregate")
{
cd_per f=new cd_per();
f.setVisible(true);
f.setSize(800,600);
f.show();
}

if(str=="Training_registration")
{
tr_reg f=new tr_reg();
f.setVisible(true);
f.setSize(800,600);
f.show();
}
}
 private JMenuBar menubar=new JMenuBar(); 
 /* mostly menubar class is used in implementing menubar */
 public static void main(String args[])
 {
 menu m=new menu();
 m.setSize(800,600);
 m.setVisible(true);
 m.show();
 }
 }


/*

////////////////   introduction.java //////////////////////  
                                                               */


  import java.awt.*;
  import java.awt.event.*;
  import java.applet.*;
  import javax.swing.*;
  import java.util.*;


   public class intro extends JFrame implements ActionListener
 {
      public JPanel pane;
      public JButton b1,b2,b3;
      public TextArea t;
  
    
  public intro()
      {
		setTitle("Introduction");
		pane=(JPanel)getContentPane();
		pane.setLayout(null);
		

		JLabel j=new JLabel(" Project Introduction ");
		j.setFont(new Font("monotype corsiva",Font.ITALIC,16));
		j.setBounds(300,20,250,50);
		pane.add(j);

		

		String val="      
       "+
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

"Introduction:



       "+
"The presented project here is made in view overcoming the problems faced by the any Export firm regarding Maintenance,
       "+
"Recording and keeping of Data base, Employee information, Financial transactions, Payroll system, Training, Recruitment etc. i.e.
       "+ 
"General HRMS Automation.

       "+
"This project is an Application Project i.e. HRMS Automation System.

       "+
"Application run in a local area network of client where as web site run in wide area networks i.e. World Wide Web.
       "+
"Application run on user defined window where as website works in a browser.Hence this project is an Application and not a portal/website.

       "+ 
"This project can be widely used in any Export firm which contain different departments with various employees having different designations, salary profiles etc.
       "+
"Beside these it is very useful for the organizations having number of branches with a Head Branch connected by a LAN system through its other branches.
       "+
"These networks need a special kind of security feature. 


       "+

"Objective and Scope of the study:-  

       "+
"Objective of doing this project is to enhance my knowledge in the field of Distributed technology using J2EE and Oracle 8i. 
       "+
"Some of the client requirement and objectives of this project is as under: -


       "+
"The main objective of study: -


       "+

"* It should contain all the information of Company.
       "+
"* It should contain all the information of Company Infrastructure.
       "+
"* It should contain all the information of Company Employees.
       "+
"* It should contain all the information of Orders.
       "+
"* It should contain all the information of Item in stock.




       "+
"PURPOSE: -
       "+

"Computerized HRMS Automation System is developed to facilitate the general administration system to manage 
       "+
"the various information of the employees and the processes involved in an export firm. So, that organization 
       "+
"can access accurate information quickly and easily as and when required, thereby improving its operational efficiency 
       "+ 
"& effectiveness as well.

      "+
"Module Description :-


       "+
"HRMS Automation comprises with the following modules:

       "+

"1)	Manpower Planning System.
       "+
"2)	Training  & Planning System.
       "+
"3)	Employee Information System
       "+
"4)	Salary processing system 
       "+
"5)	Attendance recording system.


       "+

"Here we will work on the first module 'Training and Planning System'

       "+

" Training division: -
       "+
"•	Institute Training. It maintains all the details, information about the institute or company, which provide the training to the candidates or employees.



       "+
 "                 Following are the fields for training:-

       "+
"	Master Details.


       "+
"•	Institute Name.
       "+
"•	Institute details.
       "+
"•	Training criteria (training package).
       "+
"•	No. of batches.
       "+
"•	No. of candidate/batch.
       "+
"•	Details of the candidate in each batch.
       "+
"•	Duration of the training.
       "+
"•	Training program.
       "+
"•	Cost of training.
       "+
"•	Faculty assigned for the batch.


       "+

"•	Professional Training:- It maintain details of various training program undertaken by employee.


       "+
"•	Department name.
       "+
"•	Department details.
       "+
"•	No. of employees assigned/department.
       "+
"•	Name of training program.
       "+
"•	Duration of training.
       "+
"•	In charge details.
       "+
"•	Cost of training.
       "+
"•	Training criteria.
       "+
"•	Training role.
       "+
"•	Employee details.


      "+

"•	Training Program Master:-It contains the name of the training and all details under the particular training program.


       "+
"      Required fields are:-

       "+
"	Master Details.
       "+
"•	Institute/Department Name.
       "+
"•	Institute/Department details.
       "+
"•	Training criteria (training package).
       "+
".	Details of the candidate
       "+
"•	Duration of the training.
       "+
"•	Training program.
       "+
"•	Cost of training.
       "+
"•	Person assigned for the training.
       "+
"•	No. of employees assigned/department.
       "+
"•	Name of training program.
       "+
"•	Training role (for which post).


       "+

"•	Plan:-We can entered training plan/need and duration of training required for employee.


       "+
                               "Required fields are:-

       "+
"•	Training name.
       "+
"•	Objective of the training.
       "+
"•	Duration of training.
       "+
"•	Required employees.
       "+
"•	Employee's details.
       "+
"•	Criteria for training.
       "+
"•	Employee assigned for training/In charge.
       "+
"•	In charge details.
       "+
"•	Modification.
       "+
"•	Trainee data bank.


       "+
"•	Execution of training: - In this option details of training undertaken by employee and their performance is entered.

       "+
              " Required fields are: -
       "+
"•	Training name.
       "+
"•	Training status.
       "+
"•	Performance of the employee.
       "+
"•	Result of the training.
       "+

"Training and Planning (Recruitment)


       "+

"RECRUITMENT PROCESS

       "+
"			Recruitment Process is one of the eras of HRMS. 
       "+
"Recruitment of the employee is not very easy job choosing suitable candidate from the lot of candidate. This selection process is not single step process but consists of multiple processes, which involves different methods of recruitment, maintenance of lot of records.
       "+

"This Recruitment process can be divided in the two groups



       "+

"				Internal Recruitment
       "+
"				External Recruitment
       "+


"INTERNAL RECRUITMENT




       "+

			"Internal Recruitment basically consider with the Recruiting the person internally in an organization this may be giving promotion to the existing employee or recruiting the person by internal reference and this is not very big deal.
       "+

"EXTERNAL RECRUITMENT




      "+
"			External Recruitment is not very easy task. There are different methods of recruiting the person.
       "+

"				Giving Advertisement
       "+
"				Placement Agencies
       "+
"				Earlier Applied
       "+

				"Body Shoppers
       "+
			
"This Recruitment Process is not a single step process this may contain several steps like


       "+

"				Precheck
       "+
"				Initial Interview
       "+
"				Written
       "+
"				Final Interview
       "+



"INPUT OUTPUT FORMS




 "+
"1.Job requirement form
       "+
"2.Skill input form
       "+
"3.Job skill requirement
       "+
"4.Advertisement form
       "+
"5.Placement agencies record form
       "+
"6.Body shopper's form
       "+
"7.Short listed candidate
       "+
"8.Candidate Performance.




"+

"TABLE STRUCTURE	




"+

"Job_Requirement


"+

"Field name      Data type           Size		     Remark
"+
"jid			 Number		           3      Primary key
"+
"jname		 Varchar2      	      20
"+
"jexperince		 number		          2
"+
"jvaccancies	 number		          4
"+
"jlocation		 varchar2		      20
 "+
"jdno			 number		          2
"+
"qualification	 Varchar2		      20



"+

"Skills


       "+
"Field name     data type       size		type
"+
"sid			varchar2		5
"+
"sname			varchar2		10


"+

"Job_skills



       "+
"Field name     data type      size		type
"+
"jid			number		   3
"+
"sid			varchar2	   5
"+
"yr_of_exp		number		   2




"+




"Advertisement



       "+
"Field name      data type      size		type
"+
"adid			varchar2		5
"+
"jid			varchar2		10



"+




"Candidateperformance
       "+

"Field name		    Data type		Size		Remark
"+
"Initial_interview	  Number		3
"+
"Written		      Number		3
"+
"Final_interview	  Number		3
"+
"Description		  Varchar2		200
"+
"			  
       " ;                                               
                           
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
intro f=new intro();
f.setVisible(true);
f.setSize(800,600);
f.show();
}  	
   } 


/*

////////////////  reference.java //////////////////////   
                                                               */

  import java.awt.*;
  import java.awt.event.*;
  import java.applet.*;
  import javax.swing.*;
  import java.util.*;

 public class ref extends JFrame implements ActionListener
 {
      public JPanel pane;
      public JButton b1;
      public TextArea t;


 public ref()
   {
		setTitle("References prefered");
		pane=(JPanel)getContentPane();
		pane.setLayout(null);
		

		JLabel j=new JLabel(" References  ");
		j.setFont(new Font("monotype corsiva",Font.ITALIC,16));
		j.setBounds(300,20,250,50);
		pane.add(j);

		

		String val="      
       "+
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


/*

////////////////  placement.java //////////////////////  
                                                          */



import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;



public class Placement  extends JFrame implements ActionListener
{
public JLabel l,l1,l2,l3,l4,l5,l6,l7,l8;
public JTextField t1,t2,t4,t5,t6,t7,t8;
public TextArea t3;
public String ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8;
public JButton b1,b2,b3,b4,b5;
public JPanel panel;
public Font g;

public Placement()
{
g=new Font("",Font.BOLD,18);
getContentPane().setBackground(Color.orange);
panel=(JPanel)getContentPane();
panel.setLayout(null);

l=new JLabel("Placement Agenicies");
l1=new JLabel("Agencies Id Number");
l2=new JLabel("Agencies Name");
l3=new JLabel("Agencies Address");
l4=new JLabel("Agencies Cont_Person");
l5=new JLabel("Agencies Cont_Phone");
l6=new JLabel("Agencies Charge");
l7=new JLabel("Agencies E-mail ID");
l8=new JLabel("Agencies WebSite");

t3=new TextArea(5,8);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);
t7=new JTextField(20);
t8=new JTextField(20);
t1=new JTextField(20);
t2=new JTextField(20);

b1=new JButton("submit");
b2=new JButton("Next");
b3=new JButton("search");
b4=new JButton("clear");
 
t1.setBounds(200,50,150,30);
t2.setBounds(200,100,150,30);
t3.setBounds(200,400,150,60);
t4.setBounds(200,150,150,30);
t5.setBounds(200,200,150,30);
t6.setBounds(200,250,150,30);
t7.setBounds(200,300,150,30);
t8.setBounds(200,350,150,30);


panel.add(b1);
b1.setBounds(450,400,80,30);
panel.add(b2);
b2.setBounds(450,450,80,30);
panel.add(b3);
b3.setBounds(550,400,80,30);
panel.add(b4);
b4.setBounds(550,450,80,30);
 
panel.add(l);
l.setBounds(250,1,300,35);
l.setFont(g);
panel.add(l1);
l1.setBounds(20,50,150,30);

panel.add(l2);
l2.setBounds(20,100,150,30);
panel.add(l3);
l3.setBounds(20,400,150,30);
l4.setBounds(20,150,150,30);
l5.setBounds(20,200,150,30);
panel.add(l4);
l6.setBounds(20,250,150,30);
l7.setBounds(20,300,150,30);
panel.add(l5);
panel.add(l6);
l8.setBounds(20,350,150,30);
panel.add(l7);
panel.add(l8);

panel.add(t1);
panel.add(t2);
panel.add(t3);
panel.add(t4);
panel.add(t5);
panel.add(t6);
panel.add(t7);
panel.add(t8);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str1=ae.getActionCommand();
if(str1=="Next")
{
tr_reg f=new tr_reg();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
try { 
 	       	System.out.println("starting Established..");


Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	       	System.out.println(" Established..");

		Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
		
System.out.println("Connection Established.. ........");
		
con.setAutoCommit(false);
		 Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);


if(str1=="submit")		
{
 ts1=t1.getText();	   
 ts2=t2.getText();
 ts3=t3.getText();
 ts4=t4.getText();
 ts5=t5.getText();
 int a1=Integer.parseInt(ts5);
 ts6=t6.getText();
int a2=Integer.parseInt(ts6);
 ts7=t7.getText();
 ts8=t8.getText();



System.out.println("query Established..");
sm.executeUpdate("create table placement(ag_id varchar2(8),ag_name varchar2(12),ag_add varchar2(15),cont_person varchar(12),cont_no number(12),ag_charge varchar2(7),ag_mail varchar2(20),ag_site varchar2(20))");
System.out.println("Table created........");


PreparedStatement psm=con.prepareStatement("insert into placement_agenci values(?,?,?,?,?,?,?,?)");

            psm.setString(1,ts1);	       
			psm.setString(2,ts2);				
           	psm.setString(3,ts3);				
            psm.setString(4,ts4);			
            psm.setInt(5,a1);                
	        psm.setInt(6,a2);	
	        psm.setString(7,ts7);
            psm.setString(8,ts5);  		
                 

 int i=psm.executeUpdate();
                   
System.out.println("query.");
con.commit();
		  JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);
		   System.out.println("Query Executed");
		  
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
}

if(str1=="search")
{
ts1=t1.getText();
ResultSet rs=sm.executeQuery("select * from placement_agenci where ag_id='"+ts1+"'");



if(rs.next())
{
String st1=rs.getString(1);
String st2=rs.getString(2);
String st3=rs.getString(8);
String st4=rs.getString(3);
String st5=rs.getString(4);
String st6=rs.getString(5);
String st7=rs.getString(6);
String st8=rs.getString(7);


         t1.setText(st1);
         t2.setText(st2);
         t3.setText(st3);
         t4.setText(st4);
         t5.setText(st5);
         t6.setText(st6);
         t7.setText(st7);
         t8.setText(st8);
}
else
{
 JOptionPane.showMessageDialog(this,"ID must be exist,may be id is not available","Search is possible",JOptionPane.WARNING_MESSAGE);
}
}
 if(str1=="clear")
{
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");

}		  
    	}
	       catch(ClassNotFoundException e)
		{
			  e.printStackTrace();
		}
		catch(SQLException es){}
		}
public static void main(String args[])
{
Placement f=new Placement();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}
}

 


/*

////////////////  trainee_registration.java //////////////////////   
                                                                      */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class tr_reg  extends JFrame implements ActionListener,ItemListener
{
public JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
public JTextField t1,t2,t3,t4,t5,t6,t7,t15;
public String ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8,ts9,ts10,ts11,ts12,ts13,ts14,ts15;
public String s1,s2,s3,s4,s5,s6;
public JToggleButton b1,b2,b3;
public Font g;
public JComboBox ch;
public Checkbox Cb1,Cb2,Cb3,Cb4;
public JPanel panel;
public JRadioButton r1,r2,r3,r4,r5;
public ButtonGroup g1,g2;

public tr_reg()
{
getContentPane().setBackground(Color.pink);
panel=(JPanel)getContentPane();
panel.setLayout(null);
g=new Font("",Font.BOLD,18);

l=new JLabel("Training Ragistration Form");
l1=new JLabel("Name of Candidate");
l2=new JLabel("Fathers Name");
l3=new JLabel("Roll Number");
l4=new JLabel(" Mailing Address");  
l5=new JLabel("Phone Number");
l6=new JLabel("Permanent Address");
l7=new JLabel("PROFF_Qualifications");
l8=new JLabel("Hobbies");
l9=new JLabel("Gender");
l10=new JLabel("Category");
l11=new JLabel("Nationality");
l12=new JLabel("Candidate_id");

b1=new JToggleButton("ADD");
b2=new JToggleButton("Next");
b3=new JToggleButton("Back");

t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);
t7=new JTextField(30);
t15=new JTextField(30);


ch=new JComboBox();
panel.add(l);

l.setBounds(240,0,380,60);
panel.add(l1);
l.setFont(g);
l1.setBounds(20,40,120,30);
panel.add(l2);
l2.setBounds(20,100,100,30);
panel.add(l3);
l3.setBounds(20,160,100,30);
panel.add(l4);
l4.setBounds(20,220,100,30);
panel.add(l5);
l5.setBounds(20,280,100,30);
panel.add(l6);
l6.setBounds(20,340,100,30);
panel.add(l7);
l7.setBounds(340,40,150,30);
panel.add(l8);
l8.setBounds(340,100,100,30);
panel.add(l9);
l9.setBounds(340,220,100,30);
panel.add(l10);
l10.setBounds(340,280,100,30);
panel.add(l11);
l11.setBounds(340,340,100,30);
panel.add(l12);
l12.setBounds(340,400,100,30);

panel.add(t1);
t1.setBounds(150,40,100,30);                       
panel.add(t2);
t2.setBounds(150,100,100,30);
panel.add(t3);
t3.setBounds(150,160,100,30);
panel.add(t4);
t4.setBounds(150,220,100,30);
panel.add(t5);
t5.setBounds(150,280,100,30);
panel.add(t6);
t6.setBounds(150,340,100,30);
panel.add(t7);
t7.setBounds(450,340,100,30);
panel.add(t15);
t15.setBounds(450,400,100,30);

panel.add(b1);
b1.setBounds(300,450,80,30);
panel.add(b2);
b2.setBounds(400,450,80,30);
panel.add(b3);
b3.setBounds(500,450,80,30);


ch.addItem("B.Tech.");
ch.addItem("M.Tech.");
ch.addItem("MCA");
ch.addItem("B.Sc.(CS)/M.Sc.(CS)");
ch.addItem("MBA");
panel.add(ch);
ch.setBounds(565,40,150,25);



Cb1=new Checkbox("Painting");
Cb2=new Checkbox("Music");
Cb3=new Checkbox("Playing games");
Cb4=new Checkbox("Solving puzzles");


panel.add(Cb1);
Cb1.setBounds(460,160,100,30);
panel.add(Cb2);
Cb2.setBounds(350,160,100,30);
panel.add(Cb3);
Cb3.setBounds(350,120,100,30);
panel.add(Cb4);
Cb4.setBounds(460,120,100,30);

JRadioButton r1=new  JRadioButton ("Male");
panel.add(r1);
r1.setBounds(350,250,45,25);
JRadioButton r2=new JRadioButton("Female");
panel.add(r2);
r2.setBounds(470,250,70,25);


g1=new ButtonGroup();
g1.add(r1);
g1.add(r2);

JRadioButton r3=new  JRadioButton ("Gen");
panel.add(r3);
r3.setBounds(350,310,70,20);
JRadioButton r4=new  JRadioButton ("OBC");
panel.add(r4);
r4.setBounds(470,310,70,20);
JRadioButton r5=new  JRadioButton ("SC/ST");
panel.add(r5);
r5.setBounds(590,310,70,20);

g2=new ButtonGroup();
g2.add(r3);
g2.add(r4);
g2.add(r5);

 Cb1.addItemListener(this);
Cb2.addItemListener(this);
Cb3.addItemListener(this);
Cb4.addItemListener(this);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
r4.addActionListener(this);
r5.addActionListener(this);

}

public void itemStateChanged(ItemEvent a1)
{
repaint();
}

public void actionPerformed(ActionEvent a)
{
String str=a.getActionCommand();
if(str=="Back")
{
menu f=new menu();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
       
 this.dispose();
}
if(str=="Next")
{
 masterdetails f=new masterdetails();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
 this.dispose();      
}
if(str=="ADD")
{
try { 
 	       	System.out.println("starting Established..");


Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	       	System.out.println(" Established..");
Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
		
System.out.println("Connection Established.. ........");
con.setAutoCommit(false);

Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);


  ts1=t1.getText();	   
  ts2=t2.getText();	   
  ts3=t3.getText();	   
int a1=Integer.parseInt(ts3);
 ts4=t4.getText();
 ts5=t5.getText();
int a2=Integer.parseInt(ts5);
 ts6=t6.getText();	   
ts7=(String)ch.getSelectedItem();
 ts8=Cb1.getLabel();
 ts9=Cb2.getLabel();
 ts10=Cb3.getLabel();
 ts11=Cb4.getLabel();
String sc=g1.getSelection().getActionCommand();
String sc1=g2.getSelection().getActionCommand();
ts14=t7.getText();
ts15=t15.getText();



System.out.println("query Established..");
sm.executeUpdate("create table tr_reg(candi_name varchar2(10),fathers_name varchar2(10),roll_no varchar2(10),mailing_add varchar2(12),phone_no number(12),permanent_add varchar2(20),qualifications varchar2(12),hobbie1 varchar2(12),hobbie2 varchar2(12),hobbie3 varchar2(12),hobbie4 varchar2(12),gender varchar2(7),category varchar2(10),nationality varchar2(10),candi_id varchar2(7))");
System.out.println("Trinee Registration Table  craeted.......");


PreparedStatement psm=con.prepareStatement("insert into tr_reg values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

                psm.setString(1,ts1);	       
				psm.setString(2,ts2);				
               	psm.setInt(3,a1);				
                psm.setString(4,ts4);			
                psm.setInt(5,a2);                
		        psm.setString(6,ts6);
				psm.setString(7,ts7);
			    psm.setString(8,ts8);
				psm.setString(9,ts9);
				psm.setString(10,ts10);
				psm.setString(11,ts11);
				psm.setString(12,sc);
				psm.setString(13,sc1);
				psm.setString(14,ts14);
				psm.setString(15,ts15);


 int i=psm.executeUpdate();
        
           
System.out.println("query.");
con.commit();
		  JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);
		   System.out.println("Query Executed");
		  
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
		 
}
	       catch(ClassNotFoundException e)
		{
			  e.printStackTrace();
		}
		catch(SQLException es)
		{
		es.printStackTrace();
		}
}
}
public static void main(String args[])
{
        tr_reg f=new tr_reg();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}
}




/*

////// mastredetails.java(availble training agenda) /////////////  
                                                                     */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*; 

public class masterdetails  extends JFrame implements ActionListener
{                  
public JLabel l,l0,l1,l2,l3,l4,l5,l6,l7,l8,l9;
public JTextField t,t0,t1,t2,t3;
public Choice ch1,ch2;
public String ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8;
public Font g;
public List list;
public JButton b1,b2,b3;

public JPanel panel;
public masterdetails()
{
getContentPane().setBackground(Color.pink);
panel=(JPanel)getContentPane();
panel.setLayout(null);
g=new Font("",Font.BOLD,18);



l=new JLabel("Available Training Agenda");
l0=new JLabel("Institute Name");
l1=new JLabel("Training Criteria");
 l2=new JLabel("Number of Batches");
 l3=new JLabel("Number of Candidates/Batch");
l4=new JLabel("Details of Candidates in each Batch");
 l5=new JLabel("Duration of Training");
 l6=new JLabel("Cost of Training");
 l7=new JLabel("Training Incharge");
  

l.setFont(g);
ch1=new Choice();
ch2=new Choice();
 
List list=new List(10,true);

 
t=new JTextField(20);
t0=new JTextField(20);
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);

b1=new JButton("ADD");
b2=new JButton("Next");
b3=new JButton("Back");
               
panel.add(l);
l.setBounds(200,5,350,40);

panel.add(l0);
l0.setBounds(20,50,350,50);
panel.add(l1);
l1.setBounds(20,100,350,50);
panel.add(l2);
l2.setBounds(20,150,350,50);
panel.add(l3);
l3.setBounds(20,200,350,50);
panel.add(l4);
l4.setBounds(20,250,350,50);
panel.add(l5);
l5.setBounds(20,300,350,50);
panel.add(l6);
l6.setBounds(20,350,350,50);
panel.add(l7);
l7.setBounds(20,400,350,50);
 

list.add("One");
list.add("Two");
list.add("Three");
list.add("Four");
panel.add(list);
list.setBounds(420,150,200,50);


ch1.addItem("B.Tech./M.Tech.");
ch1.addItem("BCA/MCA");
ch1.addItem("BBA/MBA");
panel.add(ch1);
ch1.setBounds(420,120,200,50);

ch2.addItem("60 Hours/90 Hours");
ch2.addItem("45 Days");
ch2.addItem("6 Months");
ch2.addItem("12 Months");
panel.add(ch2);
ch2.setBounds(420,320,200,50);

panel.add(t0);
t0.setBounds(420,50,120,30);
panel.add(t);
t.setBounds(420,260,120,30);
t1.setBounds(420,360,120,30);
panel.add(t1);
t2.setBounds(420,410,120,30);
panel.add(t2);
t3.setBounds(420,210,120,30);
panel.add(t3);
panel.add(b1);
b1.setBounds(300,450,80,30);
panel.add(b2);
b2.setBounds(400,450,80,30);
panel.add(b3);
b3.setBounds(500,450,80,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}

public void actionPerformed(ActionEvent a)
{  
String str=a.getActionCommand();
if(str=="Back")
{
tr_reg f=new tr_reg();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str=="Next")
{
masterdetails01 f=new masterdetails01();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str=="ADD")
{
try { 
 	       	System.out.println("starting Established..");

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	       	System.out.println(" Established..");

		Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
System.out.println("Connection Established.. ........");
		
con.setAutoCommit(false);

		 Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);


  ts1=t0.getText();	   
  ts2=ch1.getSelectedItem();
  ts3=list.getSelectedItem();
  ts4=t3.getText();
  ts5=t.getText();
  ts6=ch2.getSelectedItem();
  ts7=t1.getText();
  ts8=t2.getText();

System.out.println("query Established..");

sm.executeUpdate("create table mastredetails(insti_name varchar2(20),criteria number(5),total_batches number(2),candi/batch number(2),candi_details/batch varchar2(20),duration varchar2(10),charges number(6),incharge_name varchar2(12))");
System.out.println("query2 Established..");

PreparedStatement psm=con.prepareStatement("insert into masterdetails values(?,?,?,?,?,?,?,?)");

                psm.setString(1,ts1);	       
				psm.setString(2,ts2);				
               	psm.setString(3,ts3);				
                psm.setString(4,ts4);			
                psm.setString(5,ts5);                
  		        psm.setString(6,ts6);	
		        psm.setString(7,ts7);
                psm.setString(8,ts5);  		
                
 int i=psm.executeUpdate();                  
System.out.println("query.");

con.commit();
		  JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);
		   System.out.println("Query Executed");
		  
 t0.setText("");
  t.setText("");
 t1.setText("");
  t2.setText("");
  t3.setText("");    	 
}

	       catch(ClassNotFoundException e)
		{
			  e.printStackTrace();
		}
		catch(SQLException es){}
		}

}
public static void main(String args[])
{
        masterdetails f=new masterdetails();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}
}










/*

////////  masterdetails01.java(training dpt.info.)  /////////////  

                                                                       */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class masterdetails01  extends JFrame implements ActionListener
{                  
public JLabel l,l0,l1,l2,l3,l4,l5,l7,l8,l9,l10;
public JTextField t,t0,t1,t2,t3,t4,t5;
public Choice ch1,ch2;
public Font g;
public String ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8,ts9,ts10;
public List list;
public JButton b1,b2,b3;
public JPanel panel;

public masterdetails01()
{
getContentPane().setBackground(Color.pink);
panel=(JPanel)getContentPane();
panel.setLayout(null);
 g=new Font("",Font.BOLD,18);

 l=new JLabel("Training Department Information");
l0=new JLabel("Department Name");
l1=new JLabel("Cost of Training");
l2=new JLabel("Number of Departments");
l3=new JLabel("Number of Employees/Batch");
l4=new JLabel("Details of Employees");
l5=new JLabel("Duration of Training");
l7=new JLabel("Person Assigned for Training");
l8=new JLabel("Name of Training Program");
l9=new JLabel("Department Details");
l10=new JLabel("Training for which post");
ch1=new Choice();
ch2=new Choice();

l.setFont(g); 
List list=new List(10,true);
 
t=new JTextField(20);
t0=new JTextField(20);
t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);

b1=new JButton("ADD");
b2=new JButton("Next");
b3=new JButton("Back");
               
panel.add(l);
l.setBounds(250,5,400,40);
panel.add(l0);
l0.setBounds(20,30,350,50);
panel.add(l1);
l1.setBounds(20,80,350,50);
panel.add(l2);
l2.setBounds(20,130,350,50);
panel.add(l3);
l3.setBounds(20,180,350,50);
panel.add(l4);
l4.setBounds(20,230,350,50);
panel.add(l5);
l5.setBounds(20,280,350,50);
panel.add(l7);
l7.setBounds(20,330,350,50);
panel.add(l8);
l8.setBounds(20,380,350,50);
panel.add(l9);
l9.setBounds(20,430,350,50);
panel.add(l10);
l10.setBounds(20,480,350,50);
list.add("One");
list.add("Two");
list.add("Three");
list.add("Four");
panel.add(list);
list.setBounds(420,140,200,50);

ch1.addItem("Rs. 10000 upto 20000");
ch1.addItem("Above 20000 upto 50000");
ch1.addItem("Above 50000");
panel.add(ch1);
ch1.setBounds(420,100,200,50);

ch2.addItem("60 Hours/90 Hours");
ch2.addItem("45 Days");
ch2.addItem("6 Months");
ch2.addItem("12 Months");
panel.add(ch2);
ch2.setBounds(420,300,200,50);
 
panel.add(t);
t.setBounds(420,40,120,30);
panel.add(t0);
t0.setBounds(420,200,120,30);
panel.add(t1);
t1.setBounds(420,250,120,30);
panel.add(t2);
t2.setBounds(420,350,120,30);
panel.add(t3);
t3.setBounds(420,400,120,30);
panel.add(t4);
t4.setBounds(420,450,120,30);
panel.add(t5);
t5.setBounds(420,500,120,30);
 
panel.add(b1);
b1.setBounds(650,400,80,30);
panel.add(b2);
b2.setBounds(650,450,80,30);

panel.add(b3);
b3.setBounds(650,500,80,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent a)
{  
String str=a.getActionCommand();
if(str=="Back")
{
masterdetails f=new masterdetails();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str=="Next")
{
cd_per f=new cd_per();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str=="ADD")
{
try { 
 	       	System.out.println("starting Established..");


Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	       	System.out.println(" Established..");

		Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
		
System.out.println("Connection Established.. ........");
		
con.setAutoCommit(false);
		 Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

  ts1=t.getText();	   
  ts2=ch1.getSelectedItem();
  ts3=list.getSelectedItem();
  ts4=t0.getText();
 int a1=Integer.parseInt(ts4);
  ts5=t1.getText();
  ts6=ch2.getSelectedItem();
  ts7=t2.getText();
  ts8=t3.getText();
  ts9=t4.getText();
  ts10=t5.getText();

System.out.println("query Established..");

sm.executeUpdate("create table mastredetails01(dpt_name varchar2(20),charges varchar2(6),total_dpts varchar2(10),total_emp/batch varchar2(12),emp_details/batch,duration varchar2(12),incharge_name varchar2(10),taining_name avrchar2(12),dpt_details varchar2(12),train_designation varchar2(12))");
System.out.println("Table named masterdatils01 created.........");

PreparedStatement psm=con.prepareStatement("insert into masterdetails01 values(?,?,?,?,?,?,?,?,?,?)");

                psm.setString(1,ts1);	       
				psm.setString(2,ts2);				
               	psm.setString(3,ts3);				
                psm.setInt(4,a1);			
                psm.setString(5,ts5);                
		        psm.setString(6,ts6);	
	            psm.setString(7,ts7);
                psm.setString(8,ts8);  		
                psm.setString(9,ts9);  		
                psm.setString(10,ts10);  		
                 
 int i=psm.executeUpdate();     
 System.out.println("query.");
 
 con.commit();
		  JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);
		   System.out.println("Query Executed");
		  
t0.setText("");
 t.setText("");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");   	 
}

	       catch(ClassNotFoundException e)
		{
			  e.printStackTrace();
		}
		catch(SQLException es){}

}
}
public static void main(String args[])
{
        masterdetails01 f=new masterdetails01();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
  }
  }       






/*

////////   cd_per.java(candiadate performance)  /////////////  

                                                                       */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class cd_per extends JFrame implements ActionListener
{
public JLabel l,l1,l2,l3,l4,l5;
public JTextField t4,t1,t2,t3,t5;
public String ts1,ts2,ts3,ts4,ts5;
public JPanel panel;
public Font g;
public JButton b1,b2,b3,b4;

public cd_per()
{
 g=new Font("",Font.BOLD,18);
getContentPane().setBackground(Color.pink);
panel=(JPanel)getContentPane();
panel.setLayout(null);

l=new JLabel("Candidate Performnace ");
l1=new JLabel("Initial_interview");
l2=new JLabel("Written");
l3=new JLabel("Final_interview");
l4=new JLabel("Description");
l5=new JLabel("Candidate_id");

b1=new JButton("Submit");
b2=new JButton("Next");
b3=new JButton("Search");
b4=new JButton("Back");

t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);

t1.setBounds(200,50,150,30);
t2.setBounds(200,100,150,30);
t3.setBounds(200,150,150,30);
t4.setBounds(200,200,150,30);
t5.setBounds(200,250,150,30);

panel.add(b1);
b1.setBounds(500,400,80,30);
panel.add(b2);
b2.setBounds(500,450,80,30);
panel.add(b3);
b3.setBounds(600,400,80,30);
panel.add(b4);
b4.setBounds(600,450,80,30);

panel.add(l);
l.setBounds(250,1,300,35);
l.setFont(g);

panel.add(l1);
l1.setBounds(20,50,150,30);

panel.add(l2);
l2.setBounds(20,100,150,30);
panel.add(l3);
l3.setBounds(20,150,150,30);
l4.setBounds(20,200,150,30);
panel.add(l4);
l5.setBounds(20,250,150,30);
panel.add(l5);

panel.add(t1);
panel.add(t2);
panel.add(t3);
panel.add(t4);
panel.add(t5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
String str1=ae.getActionCommand();
if(str1=="Next")
{
Shortlist f=new Shortlist();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str1=="Back")
{
masterdetails01 f=new masterdetails01();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}

 if(str1=="Submit")
 {
		 
  try { 
	       
		System.out.println("starting Established..");
		
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
                 Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
		con.setAutoCommit(false);
             
		 System.out.println("Connection Established.. ........");
		
             Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);	

		   		 
		ts1=t1.getText();
        int a1=Integer.parseInt(ts1);
        ts2=t2.getText();
        int a2=Integer.parseInt(ts2);
        ts3=t3.getText();
		int a3=Integer.parseInt(ts3);
        ts4=t4.getText();		
		ts5=t5.getText();


sm.executeUpdate("create table performance(ini_interview number(20),written number(20),final_inter number(9),descr varchar2(20))");
System.out.println("query2 Established..");

	
PreparedStatement psm=con.prepareStatement("insert into can_perfor values(?,?,?,?,?)");
psm.setInt(1,a1);
psm.setInt(2,a2);
psm.setInt(3,a3);		
psm.setString(4,ts4);
psm.setString(5,ts5);

 int i=psm.executeUpdate();
 System.out.println("query.........Established..");               
        
                   
con.commit();
JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);
		   System.out.println("Query Executed");
		  

t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");    	 
}

	       catch(ClassNotFoundException e)
		{
			  e.printStackTrace();
		}
		catch(SQLException es){}
		}
}
public static void main(String args[])
{
cd_per f=new cd_per();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}
}



/*

//////////////////      shortlist.java        /////////////  

                                                                      */
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class Shortlist extends JFrame implements ActionListener
{
public JLabel l,l1,l2,l3,l4,l5,l6,l7;
public JTextField t1,t2,t4,t5,t6,t7;
public String ts1,ts2,ts3,ts4,ts5,ts6,ts7;
public TextArea t3;
public JButton b1,b2,b3;
public JPanel panel;
public Font g;

public Shortlist()
{
g=new Font("",Font.BOLD,22);
getContentPane().setBackground(Color.pink);
panel=(JPanel)getContentPane();
panel.setLayout(null);

l=new JLabel("Shortlisted Candidates ");
l1=new JLabel("Candidate's Id");
l2=new JLabel("Candidate's Name");
l3=new JLabel("Candidate's Address");
l4=new JLabel("Candidate's Phone");
l5=new JLabel("Candidate's Resume No.");
l6=new JLabel("Round Of Qualified");
l7=new JLabel("Candidate's E-mail");

t3=new TextArea(5,8);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);
t7=new JTextField(20);
t1=new JTextField(20);
t2=new JTextField(20);

b1=new JButton("Submit");
b2=new JButton("Next");
b3=new JButton("Back");

t1.setBounds(200,100,150,30);
t2.setBounds(200,150,150,30);
t3.setBounds(200,400,150,60);
t4.setBounds(200,200,150,30);
t5.setBounds(200,250,150,30);
t6.setBounds(200,300,150,30);
t7.setBounds(200,350,150,30);
 
panel.add(b1);
panel.add(b2);
panel.add(b3);

b1.setBounds(450,200,100,30);
b2.setBounds(450,300,100,30);
b3.setBounds(450,400,100,30);

panel.add(l);
l.setBounds(250,10,300,35);
l.setFont(g);
panel.add(l1);
l1.setBounds(20,100,150,30);

panel.add(l2);
l2.setBounds(20,150,150,30);
panel.add(l3);
l3.setBounds(20,200,150,30);
l4.setBounds(20,250,150,30);
l5.setBounds(20,300,150,30);
panel.add(l4);
l6.setBounds(20,350,150,30);
l7.setBounds(20,400,150,30);
panel.add(l5);
panel.add(l6);
panel.add(l7);
 
panel.add(t1);
panel.add(t2);
panel.add(t3);
panel.add(t4);
panel.add(t5);
panel.add(t6);
panel.add(t7);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
String str1=ae.getActionCommand();
if(str1=="Next")
{
Plan f=new Plan();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str1=="Back")
{
cd_per f=new cd_per();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}

if(str1=="Submit")
{
try { 
 	       	System.out.println("starting Established..");

		
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	       	System.out.println(" Established..");

		Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
		
System.out.println("Connection Established.. ........");
		
con.setAutoCommit(false);
		 Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

 ts1=t1.getText();	   
 ts2=t2.getText();
 ts3=t3.getText();
 ts4=t4.getText();
 int a1=Integer.parseInt(ts4);
 ts5=t5.getText();
 int a2=Integer.parseInt(ts5);
 ts6=t6.getText();
 ts7=t7.getText();
 int a3=Integer.parseInt(ts6);
System.out.println("query Established..");


sm.executeUpdate("create table shortlist(candi_id varchar2(10) primary key,candi_name varchar2(12),candi_add varchar2(12),candi_phone varchar2(10),resume_no varchar(6),round_no number(2),caindi_mail varchar2(12))");
System.out.println("shortlisted candiadtes info recieved..............");


PreparedStatement psm=con.prepareStatement("insert into shortlist_cand values(?,?,?,?,?,?,?)");

	            psm.setString(1,ts1);	       
				psm.setString(2,ts2);				
               	psm.setString(3,ts3);				
                psm.setInt(4,a1);			
		        psm.setInt(5,a2);                
		        psm.setInt(6,a3);	
				psm.setString(7,ts7);              

 int i=psm.executeUpdate();     
 System.out.println("query.");

con.commit();
		  JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);
		   System.out.println("Query Executed");
		  

t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");	 
}

	       catch(ClassNotFoundException e)
		{
			  e.printStackTrace();
		}
		catch(SQLException es)
		{
		}
		}

}
public static void main(String args[])
{
Shortlist f=new Shortlist();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}
}


/*

///////////////               plan.java   ///////////////////////  

                                                                       */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Plan extends JFrame  implements ActionListener,ItemListener
{
public JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9;
public JTextField t1,t2,t4,t5,t6,t7,t8,t9;
public JButton b1,b2,b3;
public String ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8,ts9;
public String st1,st2,st3,st4,st5,st6,st7,st8,st9;
public JPanel panel;
public Font g;
public JComboBox c;

public Plan()
{
g=new Font("",Font.BOLD,18);

getContentPane().setBackground(Color.orange);
panel=(JPanel)getContentPane();
panel.setLayout(null);

l=new JLabel("Plan For Job Training");
l1=new JLabel(" Training Name");
l2=new JLabel("Objective For Training");
l3=new JLabel("Duration Of Training");
l4=new JLabel(" Required Employees");
l5=new JLabel(" Employee's Id");
l6=new JLabel("Criteria For Training");
l7=new JLabel("Incharge");
l8=new JLabel("Incharge Details");
l9=new JLabel("Modification");

t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);
t7=new JTextField(20);
t8=new JTextField(20);
t1=new JTextField(20);
t2=new JTextField(20);
t9=new JTextField(20);

c=new JComboBox();

b1=new JButton("Submit");
b2=new JButton("Next");
b3=new JButton("Back");

c.addItem("one Month");
c.addItem("two Month");
c.addItem("six Month");
c.addItem("one Year");

t1.setBounds(200,50,150,30);
t2.setBounds(200,100,150,30);
t4.setBounds(200,200,150,30);
t5.setBounds(200,250,150,30);
t6.setBounds(200,300,150,30);
t7.setBounds(200,350,150,30);
t8.setBounds(200,400,150,30);
t9.setBounds(200,450,150,30);
c.setBounds(200,150,150,30);

panel.add(b1);
b1.setBounds(500,400,80,30);
panel.add(b2);
b2.setBounds(500,450,80,30);
panel.add(b3);
b3.setBounds(600,400,80,30);

panel.add(l);
l.setBounds(250,1,300,35);
l.setFont(g);

panel.add(l1);
l1.setBounds(20,50,150,30);

panel.add(l2);
l2.setBounds(20,100,150,30);
panel.add(l3);
l3.setBounds(20,150,150,30);
l4.setBounds(20,200,150,30);
l5.setBounds(20,250,150,30);
panel.add(l4);
l6.setBounds(20,300,150,30);
l7.setBounds(20,350,150,30);
panel.add(l5);
panel.add(l6);
l8.setBounds(20,400,150,30);
l9.setBounds(20,450,150,30);

panel.add(l7);
panel.add(l8);
panel.add(l9);

panel.add(t1);
panel.add(t2);
panel.add(t4);
panel.add(t5);
panel.add(t6);
panel.add(t7);
panel.add(t8);
panel.add(t9);

panel.add(c);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
c.addItemListener(this);
}

public void itemStateChanged(ItemEvent ie)
{
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();




if(str=="Back")
{
Shortlist f=new Shortlist();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str=="Next")
{
job_req f=new job_req();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str=="Submit")
{

  try { 
	       
		System.out.println("starting Established..");
		
                 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
                 Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
		con.setAutoCommit(false);
             
				 System.out.println("Connection Established.. ........");
				 		
             Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);	
	   	 
		ts1=t1.getText();
        ts2=t2.getText();
  ts3=(String)c.getSelectedItem();
		ts4=t4.getText();
        ts5=t5.getText();
		ts6=t6.getText();				
		ts7=t7.getText();	
		ts8=t8.getText();	    
		ts9=t9.getText();


System.out.println("query2 Established..");

sm.executeUpdate("create table plan(train_name varchar2(12),tain_objective varchar2(20),duration varchar2(10),emp_required number(3),emp_id varchar2(12),train_criteria varchar2(10),train_incharge varchar2(6),incharge_details varchar2(30),modification varchar2(10))");
System.out.println("plan for Job_Training Established..");


PreparedStatement psm=con.prepareStatement("insert into plane values(?,?,?,?,?,?,?,?,?)");
		psm.setString(1,ts1);
		psm.setString(2,ts2);
		psm.setString(3,ts3);		
		psm.setString(4,ts4);
		psm.setString(5,ts5);
		psm.setString(6,ts6);
		psm.setString(7,ts7);
		psm.setString(8,ts8);
		psm.setString(9,ts9);

int i=psm.executeUpdate();
                  
    
                  
con.commit();
JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);



t1.setText("");
t2.setText("");
/* t3.setText(""); */// as the choice has been encountered//
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");
t8.setText("");
t9.setText("");
}

	       catch(ClassNotFoundException e)
		{
			  e.printStackTrace();
		}
		catch(SQLException es){}
		}
}
public static void main(String args[])
{
Plan f=new Plan();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}
}


		
/*

///////////////////  job_req.java  //////////////////////////  

                                                                       */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class job_req extends JFrame implements ActionListener
{
public JLabel l,l1,l2,l3,l4,l5,l6,l7;
public JTextField t1,t2,t3,t4,t5,t6,t7;
public String ts1,ts2,ts3,ts4,ts5,ts6,ts7;
public JPanel panel;
public Font g;
public JButton b1,b2,b3;

public job_req()
{
 g=new Font("",Font.BOLD,18);
getContentPane().setBackground(Color.pink);
panel=(JPanel)getContentPane();
panel.setLayout(null);

l=new JLabel("Requirements for Job Training");
l1=new JLabel("Job ID");
l2=new JLabel("Job Name");
l3=new JLabel("Job Experience");
l4=new JLabel("Job Vacancies");
l5=new JLabel("Job Location");
l6=new JLabel("Job Dpt. no.");
l7=new JLabel("Qualification");

b1=new JButton("Submit");
b2=new JButton("Next");
b3=new JButton("Cancel");

t1=new JTextField(20);
t2=new JTextField(20);
t3=new JTextField(20);
t4=new JTextField(20);
t5=new JTextField(20);
t6=new JTextField(20);
t7=new JTextField(20);

t1.setBounds(200,50,150,30);
t2.setBounds(200,100,150,30);
t3.setBounds(200,150,150,30);
t4.setBounds(200,200,150,30);
t5.setBounds(200,250,150,30);
t6.setBounds(200,300,150,30);
t7.setBounds(200,350,150,30);

panel.add(b1);
b1.setBounds(500,400,80,30);
panel.add(b2);
b2.setBounds(500,450,80,30);
panel.add(b3);
b3.setBounds(500,350,80,30);

panel.add(l);
l.setBounds(250,1,300,35);
l.setFont(g);

panel.add(l1);
l1.setBounds(20,50,150,30);
panel.add(l2);
l2.setBounds(20,100,150,30);
panel.add(l3);
l3.setBounds(20,150,150,30);
l4.setBounds(20,200,150,30);
panel.add(l4);
l5.setBounds(20,250,150,30);
panel.add(l5);
l6.setBounds(20,300,150,30);
panel.add(l6);
l7.setBounds(20,350,150,30);
panel.add(l7);

panel.add(t1);
panel.add(t2);
panel.add(t3);
panel.add(t4);
panel.add(t5);
panel.add(t6);
panel.add(t7);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
String str1=ae.getActionCommand();
if(str1=="Cancel")
{
this.dispose();
}
if(str1=="Next")
{
Train_exe f=new Train_exe();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(str1=="Submit")		
{

try { 
 	       	System.out.println("starting Established..");

		
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	       	System.out.println(" Established..");

		Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
		
System.out.println("Connection Established.. ........");
		
con.setAutoCommit(false);
		 Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);


  ts1=t1.getText();	   
  ts2=t2.getText();
  ts3=t3.getText();
  ts4=t4.getText();
  ts5=t5.getText();
  ts6=t6.getText();
  ts7=t7.getText();

System.out.println("query Established..");

sm.executeUpdate("create table job_req(job_id varchar2(10),job_desig varchar2(12),job_exp varchar2(10),total_vacancies varchar(12),job_location varchar2(12),job_dpt_no varchar2(9),qualification varchar2(10))");
System.out.println("Requariments of candiadtes for job is recieved:as..................");

PreparedStatement psm=con.prepareStatement("insert into job_req values(?,?,?,?,?,?,?)");

	              psm.setString(1,ts1);	       
				psm.setString(2,ts2);				
               	psm.setString(3,ts3);				
                psm.setString(4,ts4);			
		       psm.setString(5,ts5);                
		         psm.setString(6,ts6);	
				 psm.setString(7,ts7);
              

 int i=psm.executeUpdate();         
System.out.println("query.");

con.commit();
		  JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);
		   System.out.println("Query Executed");
		  
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
t5.setText("");
t6.setText("");
t7.setText("");    	 
}
    	
	       catch(Exception e)
		{
			  e.printStackTrace();
		}	
}
}
public static void main(String args[])
{
job_req f=new job_req();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}
}
     

/*

///////////////////  train_exe.java  //////////////////////////  

                                                                   */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Train_exe  extends JFrame implements ActionListener
{
public JLabel l,l1,l2,l3,l4,l5;
public Choice ch1,ch2;
public JRadioButton b1,b2;
public String ts1,ts2,ts3,ts4;
public  TextArea t;
public Font g;
public JButton b3,b4;
public JPanel panel;

public Train_exe()
{
getContentPane().setBackground(Color.pink);
panel=(JPanel)getContentPane();
panel.setLayout(null);
g=new Font("",Font.BOLD,18);

l=new JLabel("Job Training Result");
l1=new JLabel("Training Name");
l2=new JLabel("Training Status");
l3=new JLabel("Performance of Employee");
l4=new JLabel("Result of Training");

ch1=new Choice();
ch2=new Choice();

JRadioButton b1=new JRadioButton("On Campus",true);
JRadioButton b2=new JRadioButton("Off Campus",false);

 
b3=new JButton("ADD");
b4=new JButton("Cancle");


t=new TextArea(4,4);

panel.add(l);
l.setBounds(200,5,350,50);
l.setFont(g);
panel.add(l1);
l1.setBounds(20,50,150,50);
panel.add(l2);
l2.setBounds(20,120,200,50);
panel.add(l3);
l3.setBounds(20,190,250,50);
panel.add(l4);
l4.setBounds(20,260,350,50);


ch1.addItem("Online Project Training");
ch1.addItem("Offline Project Training");
ch1.addItem("Vocational Training");
ch1.addItem("Dpt.Training/Workshop");
panel.add(ch1);
ch1.setBounds(200,65,250,50);

ch2.addItem("Avegrage");
ch2.addItem("Good");
ch2.addItem("Honourable");
panel.add(ch2);
ch2.setBounds(200,280,150,60);

panel.add(b1);
b1.setBounds(200,120,100,30);
panel.add(b2);
b2.setBounds(350,120,100,30);

panel.add(t);
t.setBounds(200,190,250,60);

panel.add(b3);
b3.setBounds(200,400,100,30);
panel.add(b4);
b4.setBounds(350,400,100,30);
b3.addActionListener(this);
b4.addActionListener(this);
}

public void actionPerformed(ActionEvent a)
{
String str=a.getActionCommand();



if(str=="Cancle")
{ 
  this.dispose();    
}
if(str=="ADD")
{
try { 
 	       	System.out.println("starting Established..");


Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 	       	System.out.println(" Established..");

		Connection con=DriverManager.getConnection("jdbc:odbc:mrp","scott","tiger");
		
System.out.println("Connection Established.. ........");
		
con.setAutoCommit(false);
		 Statement sm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);


  ts1=ch1.getSelectedItem();  
  ts3=t.getText();
  ts4=ch2.getSelectedItem();	   
   
System.out.println("query Established..");

sm.executeUpdate("create table execution(train_name varchar2(10),train_status varchar2(12),train_peformance avrcahr2(10),train_result avrchar2(9))");
System.out.println("The Selected Candiadtes are:......................");

PreparedStatement psm=con.prepareStatement("insert into train_exe values(?,?,?,?)");

	            psm.setString(1,ts1);	       
				psm.setString(2,ts2);				
               	psm.setString(3,ts3);				
                psm.setString(4,ts4);	    
 
con.commit();
		  JOptionPane.showMessageDialog(this,"Query Executed","Record Inserted",JOptionPane.WARNING_MESSAGE);
		   System.out.println("Query Executed");
		  
t.setText("");  	 
}
  catch(ClassNotFoundException e)
		{
			  e.printStackTrace();
		}
		catch(SQLException es){}
		}

repaint();
}
public static void main(String args[])
{
        Train_exe f=new Train_exe();
        f.setVisible(true);
        f.setSize(800,600);
        f.show();
}
}


/*

///////////////////  help.java  //////////////////////////  

                                                                                      */

  import java.awt.*;
  import java.awt.event.*;
  import java.applet.*;
  import javax.swing.*;
  import java.util.*;
public class help extends JFrame implements ActionListener
 {
      public JPanel pane;
      public JButton b1,b2,b3;
      public TextArea t;
  
      public help()
      {
		setTitle("help");
		pane=(JPanel)getContentPane();
		pane.setLayout(null);		

		JLabel j=new JLabel(" HELP FILE ");
		j.setFont(new Font("monotype corsiva",Font.ITALIC,30));
		j.setBounds(300,20,250,50);
		pane.add(j);

		String val="      
       "+
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

"Introduction:



       "+
"The presented project here is made in view overcoming the problems faced by the any Export firm regarding Maintenance, Recording and keeping of Data base, Employee information, Financial transactions, Payroll system, Training, Recruitment etc. i.e. 'General HRMS Automation'.
       "+
"This project is an Application Project i.e. HRMS Automation System.
       "+
"Application run in a local area network of client where as web site run in wide area networks i.e. World Wide Web. Application run on user defined window where as website works in a browser.Hence this project is an Application and not a portal/website.
       "+ 

"This project can be widely used in any Export firm which contain different departments with various employees having different designations, salary profiles etc. Beside these it is very useful for the organizations having number of branches with a Head Branch connected by a LAN system through its other branches. These networks need a special kind of security feature. 
       "+

"Objective and Scope of the study: -
       "+
"Objective of doing this project is to enhance my knowledge in the field of Distributed technology using J2EE and Oracle 8i. Some of the client requirement and objectives of this project is as under: -



       "+
"The main objective of study: -
       "+

"* It should contain all the information of Company.
       "+
"* It should contain all the information of Company Infrastructure.
       "+
"* It should contain all the information of Company Employees.
       "+
"* It should contain all the information of Orders.
       "+
"* It should contain all the information of Item in stock.




       "+
"PURPOSE: -
       "+

"Computerized HRMS Automation System is developed to facilitate the general administration system to manage the various
"+
"information of the employees and the processes involved in an export firm. So, that organization can access accurate information
"+
"quickly and easily as and when required, thereby improving its operational efficiency & effectiveness.



"+
"Module Description :-
       "+
"HRMS Automation comprises with the following modules:
       "+

"1)	Manpower Planning System.
       "+
"2)	Training  & Planning System.
       "+
"3)	Employee Information System
       "+
"4)	Salary processing system 
       "+
"5)	Attendance recording system.
     " 

			   ;                                                     
                           
		
		t=new TextArea(val,15,20);
		t.setBounds(50,70,700,400);
		t.setBackground(Color.pink);
		t.setForeground(Color.gray);
                Font f2=new Font("Arial",Font.ITALIC,12);
		t.setFont(f2);
		t.setEnabled(true);
		b1=new JButton("ABOUT THE PROJECT");
                b2=new JButton("Shortcut Keys");
                b3=new JButton("Cancle");
                
                pane.add(b1);
                pane.add(b2);
                pane.add(b3);
                                
                b1.setBounds(100,500,200,30);
                b2.setBounds(320,500,200,30);
                b3.setBounds(530,500,100,30);
                 
        b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
b1.setBackground(Color.black);
b1.setForeground(Color.white);
b2.setBackground(Color.black);
b2.setForeground(Color.white);
b3.setBackground(Color.blue);
b3.setForeground(Color.white);		
		                       pane.add(t);
                b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);	
}
public void actionPerformed(ActionEvent a)
{  
String s1="ABOUT THE PROJECT";
String s2="Shortcut Keys";
String s3="Cancle";
String str=a.getActionCommand();
if(s1.equals(str))
{
help1 f=new help1();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(s2.equals(str))
{
help2 f=new help2();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
if(s3.equals(str))
{
 this.dispose();
}
}      
public static void main(String args[])
{
help f=new help();
f.setVisible(true);
f.setSize(800,600);
f.show();
}   	
} 

/*

///////////////////  help1.java  //////////////////////////  

                                                                              */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class help1 extends JFrame implements ActionListener  
{
public TextArea t;
public Font g;
public JButton b;
public JLabel l1;
public JPanel panel;
public help1()
{
g=new Font("",Font.BOLD,24);
String str="





       "+
"Main Requirements of Project:- 



       "+
"Computerized HRMS Automation System is developed to facilitate the general administration system to manage the various
"+
"information of the employees and the processes involved in an export firm. So, that organization can access accurate information
"+
"quickly and easily as and when required, thereby improving its operational efficiency & effectiveness.



"+
"Module Description :-
       "+
"HRMS Automation comprises with the following modules:
       "+

"1)	Manpower Planning System.
       "+
"2)	Training  & Planning System.
       "+
"3)	Employee Information System
       "+
"4)	Salary processing system 
       "+
"5)	Attendance recording system.
     " 

			   ;                                                     

getContentPane().setBackground(Color.gray);
panel=(JPanel)getContentPane();
panel.setLayout(null);

t=new TextArea(str,600,500);
panel.add(t);
t.setBounds(50,50,700,500);
l1=new JLabel("About Project Requriments");
panel.add(l1);
l1.setBounds(250,5,400,40);
l1.setFont(g);
l1.setForeground(Color.red);
b=new JButton("BACK");
panel.add(b);
b.setBounds(650,5,100,30);   
b.setBackground

(Color. blue);
b.setFont(new Font("",Font.BOLD,18));             
b.setForeground(Color.pink);
b.addActionListener(this);

}
public void actionPerformed(ActionEvent a)
{
String s1="BACK";
String str=a.getActionCommand();
if(s1.equals(str))
{
help f=new help();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
}
public static void main(String args[])
{
help1 f=new help1();
f.setVisible(true);
f.setSize(800,600);
f.show();
}
}






/*

///////////////////  help2.java  //////////////////////////  

                                                                       */


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class help2 extends JFrame implements ActionListener  
{
public TextArea t;
public Font g;
public JButton b;
public JLabel l1;
public JPanel panel;
public help2()
{
g=new Font("",Font.BOLD,24);
String str="Press To 
       "+
"CTRL+C Copy.
       "+ 
"CTRL+X Cut.
       "+ 
"CTRL+V Paste.
       "+ 
"CTRL+Z Undo.
       "+ 
"DELETE Delete. 
       "+ 
"SHIFT+DELETE Delete selected item permanently without placing the item in the Recycle Bin.
       "+ 
"CTRL while dragging an item Copy selected item.
       "+ 
"CTRL+SHIFT while dragging an item Create shortcut to selected item.
       "+ 
"F2 Rename selected item.
       "+ 
"CTRL+RIGHT ARROW Move the insertion point to the beginning of the next word.
       "+ 
"CTRL+LEFT ARROW Move the insertion point to the beginning of the previous word.
       "+ 
"CTRL+DOWN ARROW Move the insertion point to the beginning of the next paragraph.
       "+ 
"CTRL+UP ARROW Move the insertion point to the beginning of the previous paragraph.
       "+ 
"CTRL+SHIFT with any of the arrow keys Highlight a block of text.
       "+ 
"SHIFT with any of the arrow keys Select more than one item in a window or on the desktop, or select text within a document.
       "+ 
"CTRL+A Select all. 
       "+ 
"F3 Search for a file or folder. 
       "+ 
"ALT+ENTER View properties for the selected item. 
       "+ 
"ALT+F4 Close the active item, or quit the active program. 
       "+ 
"ALT+Enter Displays the properties of the selected object. 
       "+ 
"ALT+SPACEBAR Opens the shortcut menu for the active window. 
       "+ 
"CTRL+F4 Close the active document in programs that allow you to have multiple documents open simultaneously. 
       "+
"ALT+TAB Switch between open items. 
       "+ 
"ALT+ESC Cycle through items in the order they were opened. 
       "+ 
"F6 Cycle through screen elements in a window or on the desktop. 
       "+ 
"F4 Display the Address bar list in My Computer or Windows Explorer. 
       "+ 
"SHIFT+F10 Display the shortcut menu for the selected item. 
       "+ 
"ALT+SPACEBAR Display the System menu for the active window. 
       "+ 
"CTRL+ESC Display the Start menu. 
       "+ 
"ALT+Underlined letter in a menu name Display the corresponding menu. 
       "+ 
"Underlined letter in a command name on an open menu Carry out the corresponding command. 
       "+ 
"F10 Activate the menu bar in the active program. 
       "+ 
"RIGHT ARROW Open the next menu to the right, or open a submenu. 
       "+ 
"LEFT ARROW Open the next menu to the left, or close a submenu. 
       "+ 
"F5 Refresh the active window. 
       "+ 
"BACKSPACE View the folder one level up in My Computer or Windows Explorer. 
       "+ 
"ESC Cancel the current task.  
       "+  "

";
getContentPane().setBackground(Color.yellow);
panel=(JPanel)getContentPane();
panel.setLayout(null);

t=new TextArea(str,600,500);
panel.add(t);
t.setBounds(50,50,700,500);
l1=new JLabel("Shortcut Keys");
panel.add(l1);
l1.setBounds(250,5,400,40);
l1.setFont(g);
l1.setForeground(Color.red);
b=new JButton("BACK");
panel.add(b);
b.setBounds(650,5,100,30);   
b.setBackground(Color.blue);
b.setFont(new Font("",Font.BOLD,18));             
b.setForeground(Color.white);
b.addActionListener(this);

}
public void actionPerformed(ActionEvent a)
{
String s1="BACK";
String str=a.getActionCommand();
if(s1.equals(str))
{
help f=new help();
f.setVisible(true);
f.setSize(800,600);
f.show();
this.dispose();
}
}
public static void main(String args[])
{
help2 f=new help2();
f.setVisible(true);
f.setSize(800,600);
f.show();
}
}



/*

////////// all hrms-codes end here  //////////////////// 


			