/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4a3alanwang;
import javax.swing.JFrame;

/**
 *
 * @author Alan Wang
 */
public class U4A3FinalProjectTester {
      public static void main( String[] args )
   { 
       U4A3FinalProject_Interface myFrame = new   U4A3FinalProject_Interface(); // create new Frame
       myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );//when we click the x button
       //the JFrame will be closed
       myFrame.setSize(600, 500 ); // set frame size
       myFrame.setVisible( true ); // display frame
       myFrame.setLocationRelativeTo(null);
   } // end main
}
