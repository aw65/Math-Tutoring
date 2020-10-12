/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4a3alanwang;

import java.awt.Color;
import java.awt.FlowLayout; // specifies how components are arranged
import java.awt.Font;
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.Icon; // interface used to manipulate images
import javax.swing.ImageIcon; // loads images
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
/**
 *
 * @author  Alan Wang
 * 
 */
public class U4A3FinalProject_Lesson1B extends JFrame  implements ActionListener{
    

    JLabel lblWelcome;//This is Title Label
    JLabel lblDisplay;//Label to display the message
    JLabel lblDisplay2;//Label to display the message
    JLabel lblBackground;//This is the background
    JLabel lblDisplay3;//Label to display subtitle
    JLabel lblDisplay4;//Label to display subtitle
    JLabel lblillustration;
    JButton btnNext; // The Enter Button to get to the next page
    JButton btnPrevious; // The Enter Button to get to the previous page
    ImageIcon icon1 = new ImageIcon("Background2.jpg");//adding images
    ImageIcon icon2 = new ImageIcon("Arrow1.jpg");//adding images
    ImageIcon icon3 = new ImageIcon("Arrow2.jpg");//adding images
    ImageIcon icon4 = new ImageIcon("Lesson1p2.jpg");//adding images
    public U4A3FinalProject_Lesson1B(){
        super( "Lesson1" );//This will be displayed in the Title Bar
        //Let change the background color of the JFrame
        setLayout(null); // set frame layout
        //Let set up the lblWelcome Label
        lblWelcome = new JLabel();
        //Let set up the size of the labal
        lblWelcome.setSize(600, 60);
        lblWelcome.setLocation(20, 15);
        //Let set the text in the label
        lblWelcome.setText("Lesson1: Two Forms of Equations");
        //Let change the font size of the text in the label
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 35));
        //Let change the display color of the Label text
        lblWelcome.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblWelcome);
        //The Name Label Code
        //Let set up the lblWelcome Label
        //Adding the the Name and Age output Label
        lblDisplay = new JLabel();
        lblDisplay.setSize(500, 500);
        lblDisplay.setLocation(25, -110);
        //Let set the text in the label
        lblDisplay.setText("<html>Example:Convert into standard form.<br>"
                +"Needs to be in the form Ax+By+C=0.<br> Algebra is used to convert into standard form.</html>");
        //Let change the fnot size of the text in the label
        lblDisplay.setFont(new Font ("Arial", Font.PLAIN, 20));
        //Let change the display color of the Label text
        lblDisplay.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblDisplay);
        lblDisplay2 = new JLabel();
        lblDisplay2.setSize(700, 30);
        lblDisplay2.setLocation(0, 50);
        //Let set the text in the label
        lblDisplay2.setText("_______________________________________________________________________________________________________________");
        //Let change the fnot size of the text in the label
        lblDisplay2.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        lblDisplay2.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblDisplay2);
        lblDisplay3 = new JLabel();
        lblDisplay3.setSize(550, 30);
        lblDisplay3.setLocation(25, 75);
        //Let set the text in the label
        lblDisplay3.setText("Converting to and from Y-intercept to Standard Form");
        //Let change the font size of the text in the label
        lblDisplay3.setFont(new Font ("Arial", Font.BOLD,22));
        //Let change the display color of the Label text
        lblDisplay3.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblDisplay3);
        lblDisplay4 = new JLabel();
        lblDisplay4.setSize(400, 30);
        lblDisplay4.setLocation(25, 175);
        //Let set the text in the label
        lblDisplay4.setText("y = -1/2x + 3");
        //Let change the font size of the text in the label
        lblDisplay4.setFont(new Font ("Arial", Font.PLAIN,25));
        //Let change the display color of the Label text
        lblDisplay4.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblDisplay4);
        //Name Text Field Set Up
        btnNext = new JButton();
        btnNext.setLocation(475, 410);
        btnNext.setSize(110, 50);
        //Now we need to make this button listen to us
        btnNext.setActionCommand("Next");
        btnNext.addActionListener(this);//Make this button to react to the action command
        btnNext.setIcon(icon3);
        //ENTER
        add(btnNext);
        btnPrevious = new JButton();
        btnPrevious.setLocation(25, 410);
        btnPrevious.setSize(110, 50);
        //Now we need to make this button listen to us
        btnPrevious.setActionCommand("Previous");
        btnPrevious.addActionListener(this);//Make this button to react to the action command
        btnPrevious.setIcon(icon2);
        //ENTER
        add(btnPrevious);
        lblillustration = new JLabel(icon4);
        lblillustration.setLocation(0,0);
        lblillustration.setBounds(50,200,500,200);
        this.add(lblillustration);
        lblBackground = new JLabel(icon1);
        lblBackground.setLocation(0,0);
        lblBackground.setBounds(0,0,600,500);
        this.add(lblBackground);
        
        
        
    }
    public void actionPerformed (ActionEvent e){
       //Let check what event is invoke
       if(e.getActionCommand().equals("Next")){
           U4A3FinalProject_Lesson1C f1 = new U4A3FinalProject_Lesson1C();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 600, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           f1.setLocationRelativeTo(null); 
           this.dispose();//closed the current working JFrame
           }
       if(e.getActionCommand().equals("Previous")){
           U4A3FinalProject_Lesson1A f1 = new U4A3FinalProject_Lesson1A();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 600, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           f1.setLocationRelativeTo(null); 
           this.dispose();//closed the current working JFrame
           
       }
           
    
      
    }
  }
