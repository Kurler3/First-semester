package learning;
import javax.swing.JOptionPane;
public class GuiTest {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter first number: "); //shows a box and asks for input 
		String sn = JOptionPane.showInputDialog("Enter second number: ");
		
		int num1= Integer.parseInt(fn);
		int num2= Integer.parseInt(sn);
		int sum=num1+num2;
		
		JOptionPane.showMessageDialog(null, "This is the sum: " + sum,"the ultimate calculator" , JOptionPane.PLAIN_MESSAGE);
		
	}

}
