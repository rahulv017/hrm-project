
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
