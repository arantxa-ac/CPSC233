import java.awt.Font;
import java.awt.Label;
import java.util.Timer;
import java.util.TimerTask;

public class ScoreManager {
	private int tenthsecondsPassed = 0;
	private double obstacle = 1000;
	/**
	 *  Add a timer for the score to take place
	 */
	Timer scoreCalculator = new Timer();
	TimerTask task = new TimerTask() {

		public void run() {
			tenthsecondsPassed++;
			obstacle = obstacle - 10;
	
		}
	};
	
	/**
	 *  Increment score for every tenth of a second and print it
	 */
	public void start() {
		scoreCalculator.scheduleAtFixedRate(task, 0, 10);
	}
	
	/**
	 *  Where the score label will be placed in the GUI version
	 * @param score
	 */
	public void scoreLabel(int score){
		Label scoreLabel = new Label();
		scoreLabel.setFont(new Font("arial", Font.PLAIN, 14));
	}
	/**
	 *  Start of the score
	 * @param args
	 */
	public static void main(String[] args) {
		ScoreManager currenttime = new ScoreManager();
		currenttime.start();
	}
	/**
	 *  Returns the time in tenthsecondsPassed
	 */
	public int gettime()
	{
	return  tenthsecondsPassed;
	}
	public double getobstacle()
	{
		return obstacle;
	}
}

