/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 Athlete pete = new Athlete(1, 1, Display.EAST, 0);
		 
       int count1 = 0;
       int count2 = 0;
       int count3 = 0;
       int count4 = 0;
       int count5 = 0;
       int count6 = 0;
       int count7 = 0;
       
       while (pete.nextToABeeper()) {
       pete.pickBeeper();
       count1++;
       }
       pete.move();
       
       while (pete.nextToABeeper()) {
       pete.pickBeeper();
       count2++;
       }

       if (pete.hasBeepers()){
         for (int k = 0; k < count1; count1--){
            pete.putBeeper();
       }
       }
       pete.move();
       
       while (pete.nextToABeeper()) {
       pete.pickBeeper();
       count3++;
       }

       if (pete.hasBeepers()){
         for (int t = 0; t < count2; count2--){
            pete.putBeeper();
       }     
    } 
       pete.move();
      
       while (pete.nextToABeeper()) {
       pete.pickBeeper();
       count4++;
       }
       
      
       if (pete.hasBeepers()){
         for (int t = 0; t < count3; count3--){
            pete.putBeeper();
      }
      pete.move();
      
      while (pete.nextToABeeper()) {
       pete.pickBeeper();
       count5++;
       }
       
      
       if (pete.hasBeepers()){
         for (int t = 0; t < count4; count4--){
            pete.putBeeper();
      }
}
      pete.move();
      
      while (pete.nextToABeeper()) {
       pete.pickBeeper();
       count6++;
       }
       
      
       if (pete.hasBeepers()){
         for (int t = 0; t < count5; count5--){
            pete.putBeeper();
            
}
}
      pete.move();
      
      while (pete.nextToABeeper()) {
       pete.pickBeeper();
       count7++;
       }
       
      
       if (pete.hasBeepers()){
         for (int t = 0; t < count6; count6--){
            pete.putBeeper();
      }
}
      pete.move();

      if (pete.hasBeepers()){
         for (int t = 0; t < count7; count7--){
            pete.putBeeper();
}
}
      
      pete.turnAround();
      while (pete.frontIsClear()){
         pete.move();
	 }
    }
 }
 }