
import javax.swing.JFrame;
public class Welcome {
	public static void main(String args[]){
		Display t1 = new Display();
		Register t2 = new Register();
		t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1.setSize(250, 300);
		t1.setVisible(false);
		t2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t2.setSize(250, 300);
		t2.setVisible(true);
	}
}
