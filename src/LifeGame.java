//package lifegame;

import java.awt.Graphics;

import javax.swing.JPanel;  


  
    
/** 
 * ������Ϸ 
 *  
 */  
  
public class LifeGame extends JPanel{  
      
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final int width = 22;  
	  
    private final int height = 22;  
    
    private WorldMap oldMap;
    
    private WorldMap newMap;
	
	LifeGame(){
		
		oldMap = new WorldMap();
		
		newMap = new WorldMap();
		
	}

	void gameCycle() {
		
		for (int row = 0; row < oldMap.rows; row++) {  
            for (int col = 0; col < oldMap.cols; col++) {  
  
                switch (oldMap.getNeighborCount(row, col)) {  
                case 0:  
                case 1:  
                case 4:  
                case 5:  
                case 6:  
                case 7:  
                case 8:  
                	newMap.set(row, col, 0);  
                    break;  
                case 2:  
                	newMap.set(row, col, oldMap.get(row, col)); 
                    break;  
                case 3:  
                	newMap.set(row, col, 1);  
                    break;  
                }  
            }  
        }  
    	oldMap = newMap;
    	
    	repaint();
    }
      
    WorldMap getMap() {
  		return oldMap;
  	}
    
    protected void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        for (int i = 0; i < oldMap.rows; i++) {  
            for (int j = 0; j < oldMap.cols; j++) {  
                if (oldMap.get(i, j) == 1) {  
                    g.fillRect( j * width, i * height, width, height);  
                   
                } else {  
                	 g.drawRect( j * width, i * height, width, height); 
                }  
            }  
        }  
    }  
  
}
