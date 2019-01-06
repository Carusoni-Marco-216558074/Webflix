import java.awt.*;
import java.awt.Color;
import java.awt.Container;
//Filename: Input.java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
**@author Marco, Aritra, Nicholas, Danny
* this class displays the screen for users to input information on a movie to go on
* the records
*/
public class  Input{
   //Initialize all variables
   JFrame window;
   Container con;
   static JPanel titleNamePanel, submitButtonPanel,labelPanel, inputPanel,backButtonPanel5, helpButtonPanel5;
   static JLabel titleNameLabel, lb, lb2, lb3, lb4, lb5, lb6;
   static JTextField text, text2, text3, text4, text5, text6;
   Font titleFont = new Font("TimesRoman", Font.BOLD, 60);
   Font buttonFont = new Font("Helvetica", Font.PLAIN, 30);
   Font labelFont = new Font("Helvetica", Font.PLAIN, 20);
   JButton submitButton, backButton5, helpButton5;

   public static void MainInput(){
   
      new Input();
   }
      
   public Input(){
      //Create new frame for panels to go on
      window = new JFrame("WEBFLIX");
      window.setSize(1020,720);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.getContentPane().setBackground(Color.black);
      window.setLayout(null);
      window.setResizable(false);
      con = window.getContentPane();
      //Creates panel for title to go on
      titleNamePanel = new JPanel();
      titleNamePanel.setBounds(350,25,500,150);
      titleNamePanel.setBackground (Color.black);
      //Create Label for title
      titleNameLabel = new JLabel(new ImageIcon("Program Images/INPUT.png"));
      titleNameLabel.setForeground(Color.red);
      titleNameLabel.setFont(titleFont);
      titleNamePanel.add(titleNameLabel);

      //Create Panel for submit button to go on
      submitButtonPanel = new JPanel();
      submitButtonPanel.setBounds(450, 600, 200, 50);
      submitButtonPanel.setBackground(Color.black);
      submitButtonPanel.setLayout(new GridLayout(1,1));
      //Create back button
      submitButton = new JButton("Submit");
      submitButton.setBackground(Color.black);
      submitButton.setForeground(Color.white);
      submitButton.setFont(buttonFont);
      submitButtonPanel.add(submitButton);
      //Create Panel for back button to go on
      backButtonPanel5 = new JPanel();
      backButtonPanel5.setBounds(10, 10, 50, 50);
      backButtonPanel5.setBackground(Color.black);
      backButtonPanel5.setLayout(new GridLayout(1,1));
      //Create back button 
      backButton5 = new JButton();
      backButton5.setIcon(new ImageIcon("Program Images/back.jpg"));
      backButtonPanel5.add(backButton5);
      
       backButton5.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
             window.dispose(); //delete frame
             AutoInput.MainInput();
         } 
      } );

      
      //Create Panel for help button to go on      
      helpButtonPanel5 = new JPanel();
      helpButtonPanel5.setBounds(950, 625, 50, 50);
      helpButtonPanel5.setBackground(Color.black);
      helpButtonPanel5.setLayout(new GridLayout(1,1));
      //Create help button  
      helpButton5 = new JButton();
      helpButton5.setIcon(new ImageIcon("Program Images/question.jpg"));
      helpButtonPanel5.add(helpButton5);
      //Create action for help button
      
      helpButton5.addActionListener(new ActionListener(){
      
         public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "type in a movies information in the fields available.");//Display popup message
         
         }
      
      
      });
	  //Create input panel for textfield to go on
      inputPanel = new JPanel();
      inputPanel.setBounds(200,150,700,400);
      inputPanel.setBackground(Color.blue);
      inputPanel.setLayout(new GridLayout(6,2));
      //Create textfields to input/output information
      text = new JTextField();
      inputPanel.add(text);
      text2 = new JTextField();
      inputPanel.add(text2);
      text3 = new JTextField();
      inputPanel.add(text3);
      text4 = new JTextField();
      inputPanel.add(text4);
      text5 = new JTextField();
      inputPanel.add(text5);
      text6 = new JTextField();
      inputPanel.add(text6);
	
      //Create panel for labels of textfields
      labelPanel = new JPanel(); //Panel showing labels of textfields
      labelPanel.setBounds(0,150,150,400);
      labelPanel.setBackground(Color.black);
      labelPanel.setLayout(new GridLayout(6,1));
      //Create labels for textfields
      lb = new JLabel("Movie Title");
      lb.setForeground(Color.white);
      lb.setFont(labelFont);
      labelPanel.add(lb);
      lb2 = new JLabel("Year Released");
      lb2.setForeground(Color.white);
      lb2.setFont(labelFont);
      labelPanel.add(lb2);
      lb3 = new JLabel("Genre");
      lb3.setForeground(Color.white);
      lb3.setFont(labelFont);
      labelPanel.add(lb3);
      lb4 = new JLabel("Director");
      lb4.setForeground(Color.white);
      lb4.setFont(labelFont);
      labelPanel.add(lb4);
      lb5 = new JLabel("Rating");
      lb5.setForeground(Color.white);
      lb5.setFont(labelFont);
      labelPanel.add(lb5);
      lb6 = new JLabel("Description");
      lb6.setForeground(Color.white);
      lb6.setFont(labelFont);
      labelPanel.add(lb6);
      
      submitButton.addActionListener(new ActionListener(){
      
         public void actionPerformed(ActionEvent e){
         
                  text.getText();
                  text2.getText();
                  text3.getText();
                  text4.getText();
                  text5.getText();
                  text6.getText();
                  JOptionPane.showMessageDialog(null, "Please reboot program to see changes.");                  
                  try {
               
      WebflixInput.Input(WebflixMain.finalIndex,text.getText(),text4.getText(),text3.getText(), text6.getText(), text2.getText(), text5.getText());  
      
    }
    catch (Exception d) {}

             window.dispose(); //delete frame
             Main.MainRun();
                 }
      });

      //Add all panels to the frame
      con.add(helpButtonPanel5);
      con.add(backButtonPanel5);
      con.add(inputPanel);
      con.add(labelPanel);
      con.add(titleNamePanel);
      con.add(submitButtonPanel);
      window.setVisible(true);


   }
   
}