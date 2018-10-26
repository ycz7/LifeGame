 
  
import javax.swing.*;  

public class Frame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static GameTimer timer = new GameTimer();
	//static WorldMap world = new WorldMap();
	static LifeGame game = new LifeGame();
	
	//JPanel panel = new JPanel();
	
	Frame(){  
        this.setSize(610,610);  
        this.setTitle("LifeGame"); 
        this.add(game);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setLocationRelativeTo(null);  
        this.setResizable(false);  
    } 
	
	
      
    public static void main(String[] args){  
    	Frame frame = new Frame();  
    	frame.setVisible(true); 
        timer.init(game);
        timer.start();
    }  
}
