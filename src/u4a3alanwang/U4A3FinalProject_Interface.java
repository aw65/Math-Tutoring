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
/**
 *
 * @author nanth
 */
public class U4A3FinalProject_Interface extends JFrame  implements ActionListener{

    JLabel lblWelcome;//This is Title Label
    JLabel lblBackground;//This is the background
    JButton btnIntro;//
    JButton btnLesson1;//
    JButton btnFinalTest;//
    ImageIcon icon = new ImageIcon("Background1.jpg");//adding images
   
    public U4A3FinalProject_Interface(){
        super( "Introduction to Equation ");//This will be displayed in the Title Bar
        //Let change the background color of the JFrame
        setLayout(null); // set frame layout
        
        
        
        //Let set up the lblWelcome Label
        lblWelcome = new JLabel();
        //Let set up the size of the labal
        lblWelcome.setSize(500, 50);
        lblWelcome.setLocation(100, 30);
        //Let set the text in the label
        lblWelcome.setText("Introduction to Equation");
        //Let change the fnot size of the text in the label
        lblWelcome.setFont(new Font ("Arial", Font.BOLD, 40));
        //Let change the display color of the Label text
        lblWelcome.setForeground(Color.BLACK);
        //we need to add this label into the JFrame
        add(lblWelcome);
        //The Name Label Code
        //Let set up the lblWelcome Label
        
        //Let's add the btnAveg button
        btnIntro = new JButton();
        btnIntro.setText("Intro");
        btnIntro.setSize(100, 50);
        btnIntro.setLocation(400, 200);
        btnIntro.setActionCommand("Intro");
        btnIntro.addActionListener(this);
        add(btnIntro);
        btnLesson1 = new JButton();
        btnLesson1.setText("Lessons");
        btnLesson1.setSize(100, 50);
        btnLesson1.setLocation(400, 300);
        btnLesson1.setActionCommand("Lesson1");
        btnLesson1.addActionListener(this);
        add(btnLesson1);
        btnFinalTest = new JButton();
        btnFinalTest.setText("Final Test");
        btnFinalTest.setSize(100, 50);
        btnFinalTest.setLocation(400, 400);
        btnFinalTest.setActionCommand("Final Test");
        btnFinalTest.addActionListener(this);
        add(btnFinalTest);
        lblBackground = new JLabel(icon);
        lblBackground.setLocation(0,0);
        lblBackground.setBounds(0,0,600,500);
        this.add(lblBackground);
        
        
    }
    public void actionPerformed (ActionEvent e){
       //Let check what event is invoke
       if(e.getActionCommand().equals("Intro")){
           U4A3FinalProject_WelcomeMessage f1 = new U4A3FinalProject_WelcomeMessage();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 600, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           f1.setLocationRelativeTo(null); 
           this.dispose();//closed the current working JFrame   
       }
       if(e.getActionCommand().equals("Lesson1")){
           U4A3FinalProject_Lesson1A f1 = new U4A3FinalProject_Lesson1A();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 600, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           f1.setLocationRelativeTo(null); 
           this.dispose();//closed the current working JFrame
       }
       if(e.getActionCommand().equals("Final Test")){
           U4A3FinalProject_FinalTest f1 = new U4A3FinalProject_FinalTest();
           f1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
           f1.setSize( 600, 500 ); // set frame size
           f1.setVisible( true ); // display frame
           f1.setLocationRelativeTo(null); 
           this.dispose();//closed the current working JFrame
           
       }
       
    }
}
