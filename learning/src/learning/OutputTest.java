package learning;
import javax.swing.JFrame;
public class OutputTest {

	public static void main(String[] args) {
		GuiWithJFrame miguel= new GuiWithJFrame();
		miguel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //so the program ends when you click the  x box
        miguel.setSize(275,180); //the dimensions
        miguel.setVisible(true); //so you can see it
	}

}
