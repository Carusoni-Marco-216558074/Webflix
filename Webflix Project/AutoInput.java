import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
//Filename: AutoInput.java
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
*@author Marco, Aritra, Nicholas, Danny
* this class runs the GUI code containing the auto-input page
* this class allows the user to input a movie title and get the
* movie information from an online source 
*/
public class  AutoInput{
	//initialize variables
   JFrame window;
   Container con;
   JPanel titleNamePanel, startButtonPanel, backButtonPanel4, helpButtonPanel4, submitButtonPanel, inputPanel, labelPanel, mInputPanel;
   JLabel titleNameLabel, lb, lb2, lb3, lb4, lb5, lb6;
   Font titleFont = new Font("TimesRoman", Font.BOLD, 60);
   Font buttonFont = new Font("Helvetica", Font.PLAIN, 30);
   Font labelFont = new Font("Helvetica", Font.PLAIN, 20);
   JButton startButton, inputButton, helpButton, backButton4, helpButton4, submitButton, mInputButton;
   JTextField text, text2, text3, text4, text5, text6;

   public static void MainInput(){
   
      new AutoInput();
   }
      
   public AutoInput(){
   	  //Create new JFrame for panels to be put on
      window = new JFrame("WEBFLIX");
      window.setSize(1020,720);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.getContentPane().setBackground(Color.black);
      window.setLayout(null);
      window.setResizable(false);
      con = window.getContentPane();
      //Creates panel for title to go on
      titleNamePanel = new JPanel();
      titleNamePanel.setBounds(250,25,500,150);
      titleNamePanel.setBackground (Color.black);
      //Create Label for title
      titleNameLabel = new JLabel(new ImageIcon("Program Images/AUTO-INPUT.png"));
      titleNameLabel.setForeground(Color.red);
      titleNameLabel.setFont(titleFont);
      titleNamePanel.add(titleNameLabel);
      //Create submit panel for button to go on
      submitButtonPanel = new JPanel();
      submitButtonPanel.setBounds(850, 165, 150, 50);
      submitButtonPanel.setBackground(Color.black);
      submitButtonPanel.setLayout(new GridLayout(1,1));
      //Create submit button
      submitButton = new JButton("Submit");
      submitButton.setBackground(Color.black);
      submitButton.setForeground(Color.white);
      submitButton.setFont(buttonFont);
      submitButtonPanel.add(submitButton);
      //Create input panel for textfield to go on
      inputPanel = new JPanel();
      inputPanel.setBounds(400,150,450,400);
      inputPanel.setBackground(Color.blue);
      inputPanel.setLayout(new GridLayout(6,2));
      //Create textfields to input/output information
      text = new JTextField();
      inputPanel.add(text);
      text2 = new JTextField();
      inputPanel.add(text2);
      text2.setEditable(false);
      text3 = new JTextField();
      inputPanel.add(text3);
      text3.setEditable(false);
      text4 = new JTextField();
      inputPanel.add(text4);
      text4.setEditable(false);
      text5 = new JTextField();
      inputPanel.add(text5);
      text5.setEditable(false);
      text6 = new JTextField();
      inputPanel.add(text6);
      text6.setEditable(false);
      
      
             submitButton.addActionListener(new ActionListener(){
      
         public void actionPerformed(ActionEvent e){
           
           WebflixMain.tempTitle = text.getText();
            JOptionPane.showMessageDialog(null, "Please reboot program to see changes.");
               try {
               
      WebflixInputAuto.AutoInput(WebflixMain.finalIndex,WebflixMain.tempTitle);  
      
    }
    catch (Exception d) {}
           
         }
       });
       
       
      //Create panel for labels of textfields
      labelPanel = new JPanel(); //Panel showing labels of textfields
      labelPanel.setBounds(200,150,150,400);
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
      //Create panel for Manual Input Button
      mInputPanel = new JPanel();
      mInputPanel.setBounds(650, 625, 250, 50);
      mInputPanel.setBackground(Color.black);
      mInputPanel.setLayout(new GridLayout(1,1));
      //Create Manual Input button
      mInputButton = new JButton("Manual Input");
      mInputButton.setBackground(Color.black);
      mInputButton.setForeground(Color.white);
      mInputButton.setFont(buttonFont);
      mInputPanel.add(mInputButton);
	  //Create action for manual input button to take you to manual input screen
      mInputButton.addActionListener(new ActionListener(){
      
         public void actionPerformed(ActionEvent e){
            window.dispose();//delete previous frame
            Input.MainInput();//Call input class
           

         }
       });

      //Create panel for the back button
      backButtonPanel4 = new JPanel();
      backButtonPanel4.setBounds(10, 10, 50, 50);
      backButtonPanel4.setBackground(Color.black);
      backButtonPanel4.setLayout(new GridLayout(1,1));
      //Create the back button
      backButton4 = new JButton();
      backButton4.setIcon(new ImageIcon("Program Images/back.jpg"));
      backButtonPanel4.add(backButton4);
      
       backButton4.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
             window.dispose(); //delete frame
             Main.MainRun();
         } 
      } );

      
      
      
      //Create panel for the help button
      helpButtonPanel4 = new JPanel();
      helpButtonPanel4.setBounds(950, 625, 50, 50);
      helpButtonPanel4.setBackground(Color.black);
      helpButtonPanel4.setLayout(new GridLayout(1,1));
      //Create help button
      helpButton4 = new JButton();
      helpButton4.setIcon(new ImageIcon("Program Images/question.jpg"));
      helpButtonPanel4.add(helpButton4);
      //Add action to help button to show popup message
      helpButton4.addActionListener(new ActionListener(){
      	
         public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "Input the name of the Movie you would like to input");// Create popup button to display help message
         
         }
      
      
      });
      

      
      
      //Add all panels to the main frame
      con.add(mInputPanel);
      con.add(labelPanel);
      con.add(inputPanel);
      con.add(submitButtonPanel);
      con.add(helpButtonPanel4);
      con.add(backButtonPanel4);
      con.add(titleNamePanel);
      window.setVisible(true);

      }
}