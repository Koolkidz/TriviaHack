import java.awt.AWTException;
import java.awt.Robot;
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

			robot.delay(4000);
			robot.keyPress(KeyEvent.VK_F);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_K);
			robot.keyPress(KeyEvent.VK_PERIOD);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_M);
			robot.keyPress(KeyEvent.VK_ENTER);

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

}
