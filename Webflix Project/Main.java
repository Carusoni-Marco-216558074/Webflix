import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
//Filename: Main.java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
*@author Marco, Aritra, Nicholas, Danny
* This class controls the home screen of the GUI that people first see
* when they run this program. This includes 3 main buttons that direct
* the user to different screens on this program
*/
public class Main {
	//Initialize all variables
   JFrame window;
   Container con;
   JPanel titleNamePanel, startButtonPanel;
   JLabel titleNameLabel;
   Font titleFont = new Font("TimesRoman", Font.BOLD, 60);
   Font buttonFont = new Font("Helvetica", Font.PLAIN, 30);
   JButton startButton, inputButton, movieButton;
   
   

   public static void MainRun(){
   
      new Main();

   }

   public Main(){
   
 

   
   	  //Create new frame for panels to go on
      window = new JFrame("WEBFLIX");
      window.setSize(1020,720);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.getContentPane().setBackground(Color.black);
      window.setContentPane(new JLabel(new ImageIcon("Program Images/webflixMainPage.png")));
      window.setLayout(null);
      window.setResizable(false);
      con = window.getContentPane();
 
      //Create Panel for start button to go on
      startButtonPanel = new JPanel();
      startButtonPanel.setBounds(100, 550, 800, 50);
      startButtonPanel.setBackground(Color.black);
      startButtonPanel.setLayout(new GridLayout(1,3));
      con.add(startButtonPanel);
      //Create start button
      startButton = new JButton("Browse");
      startButton.setBackground(Color.black);
      startButton.setForeground(Color.white);
      startButton.setFont(buttonFont);
      startButtonPanel.add(startButton);
      //Add action to start button
      startButton.addActionListener(new ActionListener(){
      
         public void actionPerformed(ActionEvent e){
            window.dispose();//delete previous frame
           Browse.MainBrowse(); // call browse class and open new frame
           
            
         
         }
       });
      //Create input button
      inputButton = new JButton("Input");
      inputButton.setBackground(Color.black);
      inputButton.setForeground(Color.white);
      inputButton.setFont(buttonFont);
      startButtonPanel.add(inputButton);
      
      inputButton.addActionListener(new ActionListener(){
      
         public void actionPerformed(ActionEvent e){
            window.dispose();//delete previous frame
            AutoInput.MainInput();//call autoinput class and open new frame
           
            
         
         }
       });


      //Create movies button
      movieButton = new JButton("Movie List");
      movieButton.setBackground(Color.black);
      movieButton.setForeground(Color.white);
      movieButton.setFont(buttonFont);
      startButtonPanel.add(movieButton);
    
       movieButton.addActionListener(new ActionListener(){
      
         public void actionPerformed(ActionEvent e){
         
            window.dispose();//delete previous frame
            Menu.MainMenu();//call autoinput class and open new frame
           
            
         
         }
       });

      
      con.add(startButtonPanel);
      window.setVisible(true);

      }
}