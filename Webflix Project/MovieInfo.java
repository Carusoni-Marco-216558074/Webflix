//Filename: MovieInfo.java
import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
*@author Marco, Aritra, Nicholas, Danny
* this class displays the information for each movie the user selects
* it also allows the user to add the movie to a shopping cart and redirects them to the main screen
*/
public class  MovieInfo{
	//Initialize all variables
   JFrame window;
   Container con;
   JPanel titleNamePanel, addButtonPanel, inputPanel2, backButtonPanel2, posterPanel, labelPanel;
   JLabel titleNameLabel, imageIcon, posterLabel, lb, lb2, lb3, lb4, lb5, lb6, lb7;
   Font titleFont = new Font("TimesRoman", Font.BOLD, 60);
   Font buttonFont = new Font("Helvetica", Font.PLAIN, 20);
   JButton addButton, backButton2;
   JTextField text, text2, text3, text4, text5, text6, text7;
   String num1;
   public static void MainInfo(int index){
   
      new MovieInfo(index);
   }
      
   public MovieInfo(int index){
   	  //Create new frame for panels to go on
      window = new JFrame("WEBFLIX");
      window.setSize(1020,720);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.getContentPane().setBackground(Color.black);
      
      
      
      window.setLayout(null);
      window.setResizable(false);
      con = window.getContentPane();
      //Create panel for title to go on
      
      titleNamePanel = new JPanel();
      titleNamePanel.setBounds(250,25,500,150);
      titleNamePanel.setBackground (Color.black);
      //Create new label for title
      
      titleNameLabel = new JLabel(new ImageIcon("Program Images/MOVIEINFO.png"));
      titleNameLabel.setForeground(Color.red);
      titleNameLabel.setFont(titleFont);
      
      //Create Panel for button to go on
      addButtonPanel = new JPanel();
      addButtonPanel.setBounds(800, 550, 200, 200);
      addButtonPanel.setBackground(Color.black);
      addButtonPanel.setLayout(new GridLayout(1,2));
      //Create back button
      addButton = new JButton("Shopping Cart");
      addButton.setIcon(new ImageIcon("Program Images/shoppingcart.png"));
      addButton.setBackground(Color.black);
      addButton.setForeground(Color.white);
      addButton.setFont(buttonFont);

      
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////"Posters/" + WebflixMain.title[index] + ".jpg"
      
      
      
      
      //Add action to button
      addButton.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
               
               JOptionPane.showMessageDialog(window,"Thank you for your purchase, you will be redirected to the home page.");
               window.dispose();
               Main.MainRun();
         } 
      } );

      
      //Create input panel for textfield to go on
      inputPanel2 = new JPanel();
      inputPanel2.setBounds(150,150,850,300);
      inputPanel2.setBackground(Color.blue);
      inputPanel2.setLayout(new GridLayout(7,2));
      //Create textfields to input/output information
      text = new JTextField(WebflixMain.title[index]);
      inputPanel2.add(text);
      text.setEditable(false);
      text2 = new JTextField(WebflixMain.year[index]);
      inputPanel2.add(text2);
      text2.setEditable(false);
      text3 = new JTextField(WebflixMain.genre[index]);
      inputPanel2.add(text3);
      text3.setEditable(false);
      text4 = new JTextField(WebflixMain.rate[index]);
      inputPanel2.add(text4);
      text4.setEditable(false);
      text5 = new JTextField(WebflixMain.director[index]);
      inputPanel2.add(text5);
      text5.setEditable(false);
      text6 = new JTextField(WebflixMain.plot[index]);
      inputPanel2.add(text6);
      text6.setEditable(false);
      text7 = new JTextField("$0.99");
      inputPanel2.add(text7);
      text7.setEditable(false);
      
      //Create panel for labels of textfields
      labelPanel = new JPanel(); //Panel showing labels of textfields
      labelPanel.setBounds(0,150,150,300);
      labelPanel.setBackground(Color.black);
      labelPanel.setLayout(new GridLayout(7,1));
      //Create labels for textfields
      lb = new JLabel("Movie Title:");
      lb.setForeground(Color.white);
      lb.setFont(buttonFont);
      labelPanel.add(lb);
      lb2 = new JLabel("Year Released:");
      lb2.setForeground(Color.white);
      lb2.setFont(buttonFont);
      labelPanel.add(lb2);
      lb3 = new JLabel("Genre:");
      lb3.setForeground(Color.white);
      lb3.setFont(buttonFont);
      labelPanel.add(lb3);
      lb4 = new JLabel("Rating:");
      lb4.setForeground(Color.white);
      lb4.setFont(buttonFont);
      labelPanel.add(lb4);
      lb5 = new JLabel("Director:");
      lb5.setForeground(Color.white);
      lb5.setFont(buttonFont);
      labelPanel.add(lb5);
      lb6 = new JLabel("Description:");
      lb6.setForeground(Color.white);
      lb6.setFont(buttonFont);
      labelPanel.add(lb6);
      lb7 = new JLabel("Price:");
      lb7.setForeground(Color.white);
      lb7.setFont(buttonFont);
      labelPanel.add(lb7);


      
	  //Create Panel for back button to go on
      backButtonPanel2 = new JPanel();
      backButtonPanel2.setBounds(10, 10, 50, 50);
      backButtonPanel2.setBackground(Color.black);
      backButtonPanel2.setLayout(new GridLayout(1,1));
      //Create back button  
      backButton2 = new JButton();
      backButton2.setIcon(new ImageIcon("Program Images/back.jpg"));
      backButtonPanel2.add(backButton2);


       backButton2.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
             window.dispose(); //delete frame
             Browse.MainBrowse();
         } 
      } );
      
      //Create panel for movie poster to go on
      
      posterPanel = new JPanel();
      posterPanel.setBounds(250,460,500,240);
      posterPanel.setBackground (Color.black);
      //Create new label for title
      
      posterLabel = new JLabel(new ImageIcon("Posters/" + WebflixMain.title[index] + ".jpg"));
      posterPanel.add(posterLabel);
      
 

	  //Add all panels to the frame
      con.add(labelPanel);	
      con.add(posterPanel);
      con.add(inputPanel2);
      titleNamePanel.add(titleNameLabel);
      addButtonPanel.add(addButton);
      con.add(titleNamePanel);
      con.add(addButtonPanel);
      con.add(backButtonPanel2);
      window.setVisible(true);
      }
}