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
public class U4A3FinalProject_Lesson2E extends JFrame  implements ActionListener{
    

    JLabel lblWelcome;//This is Title Label
    JLabel lblDisplay;//Label to display the message
    JLabel lblDisplay2;//Label to display the message
    JLabel lblBackground;//This is the background
    JLabel lblDisplay3;//Label to display subtitle
    JTextField txtAnswer1;//To recieve the answer for Q1
    JTextField txtAnswer2;//To recieve the answer for Q1
    JTextField txtAnswer3;//To recieve the answer for Q2
    JTextField txtAnswer4;//To recieve the answer for Q2
    JButton btnNext; // The Enter Button to get to the next page
    JButton btnPrevious; // The Enter Button to get to the previous page
    JButton btnDisplay;//The Enter Button to display the right answer.
    ImageIcon icon1 = new ImageIcon("Background2.jpg");//adding images
    ImageIcon icon2 = new ImageIcon("Arrow1.jpg");//adding images
    ImageIcon icon3 = new ImageIcon("Arrow2.jpg");//adding images
    public U4A3FinalProject_Lesson2E(){
        super( "Lesson2" );//This will be displayed in the Title Bar
        //Let change the background color of the JFrame
        setLayout(null); // set frame layout
        //Let set up the lblWelcome Label
        lblWelcome = new JLabel();
        //Let set up the size of the labal
        lblWelcome.setSize(600, 60);
        lblWelcome.setLocation(10, 15);
        //Let set the text in the label
        lblWelcome.setText("Lesson2: Relationship Between Lines");
        //Let change the font size of the text in the label
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 33));
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
        lblDisplay3.setText("Lesson 2 Practice Questions");
        //Let change the font size of the text in the label
        lblDisplay3.setFont(new Font ("Arial", Font.BOLD,25));
        //Let change the display color of the Label text
        lblDisplay3.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblDisplay3);
        lblDisplay = new JLabel();
        lblDisplay.setSize(500, 500);
        lblDisplay.setLocation(25, -10);
        //Let set the text in the label
        lblDisplay.setText("<html>1.Identify then graph the pair of equations that are parallel.<br>"
        +"<br>"+ "A.y = −x + 2  B.y = 2/3x + 2  C.y = 2/3x − 5<br> D.y = x − 6  E.y = −2/3x − 7<br>"
        +"<br>"+ "2.Identify then graph the pair of equations that are perpendicular.<br>"
        +"<br>"+ "A.y = 3x + 2  B.y = 2x + 7    C.y = 1/2x − 5<br> D.y = −1/2x−6  E.y = 1/3x + 2</html>");
        //Let change the fnot size of the text in the label
        lblDisplay.setFont(new Font ("Arial", Font.BOLD, 20));
        //Let change the display color of the Label text
        lblDisplay.setForeground(Color.BLACK);
        add(lblDisplay);
        //we need to add this label into the JFrame
        //Name Text Field Set Up
        txtAnswer1= new JTextField();
        txtAnswer1.setSize(50, 30);
        txtAnswer1.setLocation(375, 210);
        //Let set the text in the label
        txtAnswer1.setText("");
        //Let change the fnot size of the text in the label
        txtAnswer1.setFont(new Font ("Arial", Font.PLAIN, 20));
        //Let change the display color of the Label text
        txtAnswer1.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(txtAnswer1);
        txtAnswer2= new JTextField();
        txtAnswer2.setSize(50, 30);
        txtAnswer2.setLocation(450, 210);
        //Let set the text in the label
        txtAnswer2.setText("");
        //Let change the fnot size of the text in the label
        txtAnswer2.setFont(new Font ("Arial", Font.PLAIN, 20));
        //Let change the display color of the Label text
        txtAnswer2.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(txtAnswer2);
        txtAnswer3= new JTextField();
        txtAnswer3.setSize(50, 30);
        txtAnswer3.setLocation(375, 350);
        //Let set the text in the label
        txtAnswer3.setText("");
        //Let change the fnot size of the text in the label
        txtAnswer3.setFont(new Font ("Arial", Font.PLAIN, 20));
        //Let change the display color of the Label text
        txtAnswer3.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(txtAnswer3);
        txtAnswer4= new JTextField();
        txtAnswer4.setSize(50, 30);
        txtAnswer4.setLocation(450, 350);
        //Let set the text in the label
        txtAnswer4.setText("");
        //Let change the fnot size of the text in the label
        txtAnswer4.setFont(new Font ("Arial", Font.PLAIN, 20));
        //Let change the display color of the Label text
        txtAnswer4.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(txtAnswer4);
        btnDisplay = new JButton();
        btnDisplay.setText("Display the Answers");
        btnDisplay.setSize(200, 50);
        btnDisplay.setLocation(200, 410);
        btnDisplay.setActionCommand("Display");
        btnDisplay.addActionListener(this);
        add(btnDisplay);
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
        lblBackground = new JLabel(icon1);
        lblBackground.setLocation(0,0);
        lblBackground.setBounds(0,0,600,500);
        this.add(lblBackground);
        
        
        
    }
    public void actionPerformed (ActionEvent e){
        if(e.getActionCommand().equals("Next")){
           U4A3FinalProject_Lesson3A f1 = new U4A3FinalProject_Lesson3A();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 600, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           f1.setLocationRelativeTo(null); 
           this.dispose();//closed the current working JFrame
            
        }
        if(e.getActionCommand().equals("Previous")){
           U4A3FinalProject_Lesson2D f1 = new U4A3FinalProject_Lesson2D();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 600, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           f1.setLocationRelativeTo(null); 
           this.dispose();//closed the current working JFrame
            
        }
        if(e.getActionCommand().equals("Display")){
          String strAnswer1 = txtAnswer1.getText().toUpperCase();
          String strAnswer2 = txtAnswer2.getText().toUpperCase();
          String strAnswer3 = txtAnswer3.getText().toUpperCase();
          String strAnswer4 = txtAnswer4.getText().toUpperCase();
          if(!strAnswer1.equals("B")){
              txtAnswer1.setText("B");
              txtAnswer1.setForeground(Color.RED);
              txtAnswer1.setFont(new Font ("Arial", Font.BOLD, 20)); 
          }
          if(!strAnswer2.equals("C")){
              txtAnswer2.setText("C");
              txtAnswer2.setForeground(Color.RED);
              txtAnswer2.setFont(new Font ("Arial", Font.BOLD, 20)); 
          }
          if(!strAnswer3.equals("B")){
              txtAnswer3.setText("B");
              txtAnswer3.setForeground(Color.RED);
              txtAnswer3.setFont(new Font ("Arial", Font.BOLD, 20)); 
          }
          if(!strAnswer4.equals("D")){
              txtAnswer4.setText("D");
              txtAnswer4.setForeground(Color.RED);
              txtAnswer4.setFont(new Font ("Arial", Font.BOLD, 20)); 
          }
          
        }
       }
    }
