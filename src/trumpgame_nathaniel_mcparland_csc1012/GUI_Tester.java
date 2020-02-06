/**
 * The GUI_Tester class contains the code which runs the program by creating a new object of the GUI
 * and using a runner to run it under the main statement.
 * The use of invokeLater enables the runner to run on a new separate thread for more efficient
 * use of system resources.
 * @version 1.8.0
 * @author Nathaniel McParland
 **/

// Declaring The Package :
package trumpgame_nathaniel_mcparland_csc1012;

// Importing The Java API Packages :
import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UIManager.*;

// Declaring The GUI_Tester :
public class GUI_Tester {
	public static void main(String[] args) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus Is Not Available, You Can Set The GUI To Another Look And Feel.
			// In This Case It Will Use The Default If Nimbus Is Not Available.
		}
		
		// Creating A New Runnable Object
		Runnable runner =  new Runnable(){
			public void run()
			{
				new GUI(null, null, 0, 0, null, 0, 0, 0, null, null, null, null); // Running The Graphical User Interface
				
			}
		};
		EventQueue.invokeLater(runner); // Forces GUI_Tester() To Run On A Separate Thread.
	}
}