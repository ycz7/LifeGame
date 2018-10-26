import java.util.Random;

//package lifegame;  
  
/** 
 *  
  */  
  
public class WorldMap { 

   final int rows = 26;
   final int cols = 26;
   private int map[][] = new int[rows][cols];
	
   
   WorldMap() {
	   reset();
   }
   
   int getNeighborCount(int row,int col) {
	   
	   int count = 0;
	   
	   for (int r = row - 1; r <= row + 1; r++) {  
           for (int c = col - 1; c <= col + 1; c++) {  
               if (r < 0 || r >= rows || c < 0  
                       || c >= cols) {  
                   continue;  
               }  
               if (get(r, c) == 1) {  
                   count++;  
               }  
           }  
       }  
       if (map[row][col] == 1) {  
           count--;  
       }  
	   return count;
   }
   
   void set(int row,int col,int val){
	   if (row < 0 || row >= rows || col < 0 || col >= cols)
		   return;
	   map[row][col] = val;
   }
   
   int get(int row,int col) {
	   if (row < 0 || row >= rows || col < 0 || col >= cols)
		   return -1;
	   
	   return map[row][col];
   }
   
   void reset() {
	   Random random = new Random();
	   for (int i = 0; i < rows; i++) {
		  for (int j = 0; j < cols; j++) {
			  map[i][j] = random.nextInt(2);
			  //System.out.print(random.nextInt(2) + " ");
		  }
		  //System.out.println();
	   }
   }
   
   /*
   public static void main(String[] args) {
	   
	   WorldMap world = new WorldMap();
	   
	   for (int i = 0; i < rows; i++) {
			  for (int j = 0; j < rows; j++)
				  System.out.print(map[i][j] + " ");
			  System.out.println();
	   }
	   //reset();
	   
	   
   }
   */
}  