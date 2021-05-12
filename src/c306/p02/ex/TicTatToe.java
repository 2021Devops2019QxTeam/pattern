package c306.p02.ex;

public class TicTatToe {

   // Define the enum Mark here
public enum Mark {
	CROSS, NOUGHT, EMPTY
}

   public static void main(String[] args) {
      // Create a 2D array "game" for the tic-tat-toe
	   Mark[][] game = new Mark[3][3]; 
	   game[0][0] = Mark.NOUGHT;
	   game[0][1] = Mark.EMPTY;
	   game[0][2] = Mark.EMPTY;
	   game[1][0] = Mark.EMPTY;
	   game[1][1] = Mark.CROSS;
	   game[1][2] = Mark.EMPTY;
	   game[2][0] = Mark.EMPTY;
	   game[2][1] = Mark.EMPTY;
	   game[2][2] = Mark.NOUGHT;

      
     
      for (Mark[] row : game) {
         for (Mark cell : row) {
            System.out.print(cell + " ");
         }
         System.out.println();
      }
   }

}

//19024523 Chang Qi Xiang 