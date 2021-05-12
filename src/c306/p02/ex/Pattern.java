package c306.p02.ex;

public class Pattern {

   public static void main(String args[]) {

      System.out.println("Pattern A");
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      System.out.println("Pattern B");
      for (int i = 0; i < 5; i++) {
         for (int j = i; j < 5 ; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      System.out.println("Pattern C");
      for (int i = 5; i > 0; i--) {
         for (int j = i; j < 6; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }

      System.out.println("Pattern D");
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
        	 if (i == j) {
        		 System.out.print("* ");
        	 }
        	 else {
        		 System.out.print("  ");
        	 }
            
         }
         System.out.println();
      }

      System.out.println("Pattern E");
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            if ((j+i) % 2 == 0) {
        	 System.out.print("* ");
            }
            else {
            	System.out.print("  ");
            }
         }
         System.out.println();
      }

   }
}

//19024523 Chang Qi Xiang 