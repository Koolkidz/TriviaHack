import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("vroom vroom");

		try {

			Robot robot = new Robot();
			//open browser (chrome 4 lyfe)
			//run pulogulamu
			//clic address bar
			//???

			robot.delay(100); //833, 41 266 748, 885 745
			
			System.out.println("start after 500ms");
			
			robot.mouseMove(885, 745);
			
			robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
			
			robot.delay(1500);
			
			
			robot.mouseMove(266, 748);
			
			robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            
			/* seems like alt+tab does not work with window
			robot.keyPress(KeyEvent.VK_ALT); robot.delay(100);
			robot.keyPress(KeyEvent.VK_TAB); robot.delay(500); robot.keyRelease(KeyEvent.VK_ALT); robot.keyRelease(KeyEvent.VK_TAB);
			*/
			
			robot.delay(1000);
			
			robot.keyPress(KeyEvent.VK_CONTROL); 
			robot.keyPress(KeyEvent.VK_T); robot.delay(100); robot.keyRelease(KeyEvent.VK_T); robot.keyRelease(KeyEvent.VK_CONTROL);

			robot.delay(200);
			
			
			
			robot.mouseMove(833, 41);
			
			
			
			robot.delay(200);
			
			robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            
            robot.delay(200);
			
			
			robot.keyPress(KeyEvent.VK_F); 		robot.keyRelease(KeyEvent.VK_F);
			robot.keyPress(KeyEvent.VK_A); 		robot.keyRelease(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_C); 		robot.keyRelease(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_E);		robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_B);		robot.keyRelease(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_O);		robot.keyRelease(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_O);		robot.keyRelease(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_K); 		robot.keyRelease(KeyEvent.VK_K);
			robot.keyPress(KeyEvent.VK_PERIOD);	robot.keyRelease(KeyEvent.VK_PERIOD);
			robot.keyPress(KeyEvent.VK_C);		robot.keyRelease(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_O);		robot.keyRelease(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_M);		robot.keyRelease(KeyEvent.VK_M);
			robot.keyPress(KeyEvent.VK_ENTER);	robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
