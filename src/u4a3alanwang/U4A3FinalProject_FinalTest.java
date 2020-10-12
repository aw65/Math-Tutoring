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
import java.util.*;
/**
 *
 * @author  Alan Wang
 * 
 */
public class U4A3FinalProject_FinalTest extends JFrame  implements ActionListener{
    

    JLabel lblWelcome;//This is Title Label
    JLabel lblDisplay;//Label to display the message
    JLabel lblDisplay2;//Label to display the message
    JLabel lblBackground;//This is the background
    JLabel lblDisplay3;//Label to display subtitle
    JLabel lblQuestion1;//Label to display subtitle
    JLabel lblQuestion2;//Label to display subtitle
    JLabel lblAnswer;
    JTextField txtAnswer1;//To recieve the answer for Q1
    JTextField txtAnswer2;//To recieve the answer for Q1
    JButton btnStart; // The Enter Button to get to start the test
    JButton btnPrevious; // The Enter Button to get to the previous page
    JButton btnDisplay;//The Enter Button to display the right answer.
    ImageIcon icon1 = new ImageIcon("Background2.jpg");//adding images
    ImageIcon icon2 = new ImageIcon("Arrow1.jpg");//adding images
    ImageIcon icon3 = new ImageIcon("Arrow2.jpg");//adding images
    ArrayList <String> strQuestion1 = new ArrayList();
    ArrayList <String> strQuestion2 = new ArrayList();
    ArrayList <String> strAnswer = new ArrayList();
    public U4A3FinalProject_FinalTest(){
        super( "Final Test" );//This will be displayed in the Title Bar
        //Let change the background color of the JFrame
        setLayout(null); // set frame layout
        //Let set up the lblWelcome Label
        lblWelcome = new JLabel();
        //Let set up the size of the labal
        lblWelcome.setSize(600, 60);
        lblWelcome.setLocation(200, 15);
        //Let set the text in the label
        lblWelcome.setText("Final Test");
        //Let change the font size of the text in the label
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 35));
        //Let change the display color of the Label text
        lblWelcome.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblWelcome);
        //The Name Label Code
        //Let set up the lblWelcome Label
        //Adding the the Name and Age output Label
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
        lblDisplay3.setText("This test contains 7 differen questions ");
        //Let change the font size of the text in the label
        lblDisplay3.setFont(new Font ("Arial", Font.BOLD,25));
        //Let change the display color of the Label text
        lblDisplay3.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblDisplay3);
        lblDisplay = new JLabel();
        lblDisplay.setSize(500, 30);
        lblDisplay.setLocation(25, 110);
        //Let set the text in the label
        lblDisplay.setText("Please choose a number between 1-7:");
        //Let change the fnot size of the text in the label
        lblDisplay.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        lblDisplay.setForeground(Color.BLACK);
        add(lblDisplay);
        lblQuestion1 = new JLabel();
        lblQuestion1.setSize(600, 30);
        lblQuestion1.setLocation(25, 200);
        //Let set the text in the label
        lblQuestion1.setText("The question will be display here.");
        //Let change the fnot size of the text in the label
        lblQuestion1.setFont(new Font ("Arial", Font.PLAIN, 17));
        //Let change the display color of the Label text
        lblQuestion1.setForeground(Color.BLACK);
        add(lblQuestion1);
        lblQuestion2 = new JLabel();
        lblQuestion2.setSize(500, 30);
        lblQuestion2.setLocation(25, 275);
        //Let set the text in the label
        lblQuestion2.setText("");
        //Let change the fnot size of the text in the label
        lblQuestion2.setFont(new Font ("Arial", Font.PLAIN, 18));
        //Let change the display color of the Label text
        lblQuestion2.setForeground(Color.BLACK);
        add(lblQuestion2);
        lblAnswer = new JLabel();
        lblAnswer.setSize(500, 30);
        lblAnswer.setLocation(75, 350);
        //Let set the text in the label
        lblAnswer.setText("Answer:");
        //Let change the fnot size of the text in the label
        lblAnswer.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        lblAnswer.setForeground(Color.BLACK);
        add(lblAnswer);
        //we need to add this label into the JFrame
        //Name Text Field Set Up
        txtAnswer1= new JTextField();
        txtAnswer1.setSize(50, 30);
        txtAnswer1.setLocation(425, 110);
        //Let set the text in the label
        txtAnswer1.setText("");
        //Let change the fnot size of the text in the label
        txtAnswer1.setFont(new Font ("Arial", Font.PLAIN, 20));
        //Let change the display color of the Label text
        txtAnswer1.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(txtAnswer1);
        txtAnswer2= new JTextField();
        txtAnswer2.setSize(200, 30);
        txtAnswer2.setLocation(200, 350);
        //Let set the text in the label
        txtAnswer2.setText("");
        //Let change the fnot size of the text in the label
        txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
        //Let change the display color of the Label text
        txtAnswer2.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(txtAnswer2);
        btnDisplay = new JButton();
        btnDisplay.setText("Display the Answers");
        btnDisplay.setSize(200, 50);
        btnDisplay.setLocation(200, 410);
        btnDisplay.setActionCommand("Display");
        btnDisplay.addActionListener(this);
        add(btnDisplay);
        btnStart = new JButton();
        btnStart.setText("Start!");
        btnStart.setSize(50,20);
        btnStart.setLocation(425, 150);
        btnStart.setActionCommand("Start");
        btnStart.addActionListener(this);
        add(btnStart);
        btnPrevious = new JButton();
        btnPrevious.setLocation(25, 410);
        btnPrevious.setSize(110, 50);
        //Now we need to make this button listen to us
        btnPrevious.setActionCommand("Previous");
        btnPrevious.addActionListener(this);//Make this button to react to the action command
        btnPrevious.setIcon(icon2);
        //ENTER
        add(btnPrevious);
        lblBackground = new JLabel(icon1);
        lblBackground.setLocation(0,0);
        lblBackground.setBounds(0,0,600,500);
        this.add(lblBackground);
        
        
        
    }
    public void actionPerformed (ActionEvent e){
        Collections.addAll(strQuestion1, "Show by substitution which of the following pairs satisfies y = −5x − 2."
        ,"Convert the following linear equation from y-intercept form to standard form."
        ,"Convert the following linear equation from standard form to y - intercept form."
        ,"Identify which of the following equation is parallel to y = -2/3x-5."
        ,"Identify which of the following equation is perpendicular to y = -3x+2."
        ,"Find the x intercept for the following equation. "
        ,"Find the y intercept for the following equation. ");
        Collections.addAll(strQuestion2,"A.(-3,-5) B.(4,-4) C.(-1,3) D.(3,-10)"
        ,"y = 2x+7"
        ,"6x−3y+9=0"
        ,"A.y = −x + 2 B.y = 2/3x + 2 C.y = −x − 6  D.y = −2/3x − 7"
        ,"A.y = 1/3x + 2 B.y = 2x + 7 C.y = 1/2x − 5 D.y = 1/2x − 6 "
        ,"5x−y+3=0"
        ,"y=2x−3");
        Collections.addAll(strAnswer,"C","-2x+y-7=0","y=2x+3","D","A","-3/5","-3");
        if(e.getActionCommand().equals("Previous")){
           U4A3FinalProject_Interface f1 = new U4A3FinalProject_Interface();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 600, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           f1.setLocationRelativeTo(null); 
           this.dispose();//closed the current working JFrame
            
        }
        if(e.getActionCommand().equals("Start")){
        int intNum = Integer.parseInt(txtAnswer1.getText());
        switch(intNum){
            case 1: txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
                    txtAnswer2.setForeground(Color.BLACK);
                    lblQuestion1.setText(strQuestion1.get(0));
                    lblQuestion2.setText(strQuestion2.get(0));break;
            case 2: txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
                    txtAnswer2.setForeground(Color.BLACK);
                    lblQuestion1.setText(strQuestion1.get(1));
                    lblQuestion2.setText(strQuestion2.get(1));break;
            case 3: txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
                    txtAnswer2.setForeground(Color.BLACK);
                    lblQuestion1.setText(strQuestion1.get(2));
                    lblQuestion2.setText(strQuestion2.get(2));break;
            case 4: txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
                    txtAnswer2.setForeground(Color.BLACK);
                    lblQuestion1.setText(strQuestion1.get(3));
                    lblQuestion2.setText(strQuestion2.get(3));break;
            case 5: txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
                    txtAnswer2.setForeground(Color.BLACK);
                    lblQuestion1.setText(strQuestion1.get(4));
                    lblQuestion2.setText(strQuestion2.get(4));break;
            case 6: txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
                    txtAnswer2.setForeground(Color.BLACK);
                    lblQuestion1.setText(strQuestion1.get(5));
                    lblQuestion2.setText(strQuestion2.get(5));break;
            case 7: txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
                    txtAnswer2.setForeground(Color.BLACK);
                    lblQuestion1.setText(strQuestion1.get(6));
                    lblQuestion2.setText(strQuestion2.get(6));break;
            default: lblQuestion1.setText("Invalid input");
                     lblQuestion2.setText("");break;
                
      }
            
        }
        if(e.getActionCommand().equals("Display")){
          String strAnswers = txtAnswer2.getText();
          int intNum = Integer.parseInt(txtAnswer1.getText());
          switch(intNum){
            case 1: if(!strAnswers.toUpperCase().equals(strAnswer.get(0))){
              txtAnswer2.setText(strAnswer.get(0));
              txtAnswer2.setForeground(Color.RED);
              txtAnswer2.setFont(new Font ("Arial", Font.BOLD, 20)); 
              }break;
            case 2: if(!strAnswers.equals(strAnswer.get(1))){
              txtAnswer2.setText(strAnswer.get(1));
              txtAnswer2.setForeground(Color.RED);
              txtAnswer2.setFont(new Font ("Arial", Font.BOLD, 20)); 
              }break;
            case 3: if(!strAnswers.equals(strAnswer.get(2))){
              txtAnswer2.setText(strAnswer.get(2));
              txtAnswer2.setForeground(Color.RED);
              txtAnswer2.setFont(new Font ("Arial", Font.BOLD, 20)); 
              }break;
            case 4: if(!strAnswers.toUpperCase().equals(strAnswer.get(3))){
              txtAnswer2.setText(strAnswer.get(3));
              txtAnswer2.setForeground(Color.RED);
              txtAnswer2.setFont(new Font ("Arial", Font.BOLD, 20)); 
              }break;
            case 5: if(!strAnswers.toUpperCase().equals(strAnswer.get(4))){
              txtAnswer2.setText(strAnswer.get(4));
              txtAnswer2.setForeground(Color.RED);
              txtAnswer2.setFont(new Font ("Arial", Font.BOLD, 20)); 
              }break;
            case 6: if(!strAnswers.equals(strAnswer.get(5))){
              txtAnswer2.setText(strAnswer.get(5));
              txtAnswer2.setForeground(Color.RED);
              txtAnswer2.setFont(new Font ("Arial", Font.BOLD, 20)); 
              }break;
            case 7: if(!strAnswers.equals(strAnswer.get(6))){
              txtAnswer2.setText(strAnswer.get(6));
              txtAnswer2.setForeground(Color.RED);
              txtAnswer2.setFont(new Font ("Arial", Font.BOLD, 20)); 
              }break;
            default: lblQuestion1.setText("Invalid input");
                     lblQuestion2.setText("");break;
          
         
          }
          
        }
       }
    }
