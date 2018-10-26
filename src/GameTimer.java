import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class GameTimer {
	
	private final int DELAY_TIME = 1200;
	
	private Timer timer;
	
	//LifeGame game = new LifeGame();
	
	void init (final LifeGame game) {  
		
		timer = new Timer(DELAY_TIME, new ActionListener() {  
			  
	        @Override  
	        public void actionPerformed(ActionEvent e) {  
	        	
	            game.gameCycle(); 
	        }  
	    }); 
	}
    
	public void start() {
		timer.start();  
	}
}
