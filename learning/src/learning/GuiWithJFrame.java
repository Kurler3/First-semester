package learning;
import java.awt.FlowLayout; //gives the default layout management
import javax.swing.JFrame; //gives basic windows features.
import javax.swing.JLabel; //allows to output text and images
public class GuiWithJFrame extends JFrame { //needs to inherit all the stuff from Jframe

	private JLabel item1;
	public GuiWithJFrame() {
		super("The tittle bar"); //this is the title
		setLayout(new FlowLayout());
		item1 = new JLabel("this is a sentence."); //an item that is a sentence
		item1.setToolTipText("This is gonna show up on hover"); //this pops up when you over the mouse over the sentence of item1
		add(item1); //adds the item to the window
	}
	
	
	
	public static void main(String[] args) {
		

	}

}
