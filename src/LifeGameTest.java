import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LifeGameTest {
	
	private static LifeGame lifeGame = new LifeGame();
	private static WorldMap oldMap;
	private static WorldMap newMap;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGameCycle() {
		oldMap = lifeGame.getMap();
		lifeGame.gameCycle();
		newMap = lifeGame.getMap();
		
		//测试
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
                	assertEquals(0, newMap.get(row, col));  
                    break;  
                case 2:  
                	assertEquals(newMap.get(row, col), oldMap.get(row, col)); 
                    break;  
                case 3:  
                	assertEquals(1, newMap.get(row, col));  
                    break;  
                }  
            }  
        }  
	}

}
