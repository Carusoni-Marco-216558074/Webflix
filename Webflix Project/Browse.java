import java.awt.*;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Filename: Browse.java
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
*@author Marco, Aritra, Nicholas, Danny
* this class displays a selection of different movies for the user to choose from and from there
* allows them to see the movie information for that movie. It also has the option for the user to
* search for a certain movie
*/
public class  Browse{
   //initialize all variables
   JFrame window;
   Container con;
   JPanel titleNamePanel, backButtonPanel, searchButtonPanel, iconButtonPanel;
   JLabel titleNameLabel;
   Font titleFont = new Font("TimesRoman", Font.BOLD, 60);
   Font buttonFont = new Font("Helvetica", Font.PLAIN, 20);
   JButton searchButton, backButton, helpButton,iconButton, iconButton2, iconButton3, iconButton4,
   iconButton5, iconButton6, iconButton7, iconButton8, iconButton9, iconButton10;
   String userInput;
   public static void MainBrowse(){
   
      new Browse();
   }
      
   public Browse(){
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
      titleNamePanel.setBounds(100,0,300,75);
      titleNamePanel.setBackground (Color.black);
      //Create new label for title
      titleNameLabel = new JLabel(new ImageIcon("Program Images/WebflixTitle.png"));
      titleNameLabel.setForeground(Color.red);
      titleNameLabel.setFont(titleFont);
      //Create Panel for back button to go on
      backButtonPanel = new JPanel();
      backButtonPanel.setBounds(10, 10, 50, 50);
      backButtonPanel.setBackground(Color.black);
      backButtonPanel.setLayout(new GridLayout(1,1));
      //Create back button 
      backButton = new JButton();
      backButton.setIcon(new ImageIcon("Program Images/back.jpg"));
      backButtonPanel.add(backButton);
      
      backButton.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
             window.dispose(); //delete frame
             Main.MainRun();
         } 
      } );


      //Create panel for search button to go on
      searchButtonPanel = new JPanel();
      searchButtonPanel.setBounds(900, 0, 100, 75);
      searchButtonPanel.setBackground(Color.black);
      searchButtonPanel.setLayout(new GridLayout(1,1));
      //Create search button
      searchButton = new JButton("Search");
      searchButton.setBackground(Color.black);
      searchButton.setForeground(Color.white);
      searchButton.setFont(buttonFont);
      searchButtonPanel.add(searchButton);
	  //add action when search button is pressed
      searchButton.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            userInput = JOptionPane.showInputDialog("Search movie"); // User searches movie
            WebflixSearch.Search(userInput); //
            
            window.dispose(); //delete frame
            
            MovieInfo.MainInfo(WebflixMain.searchedMovie);//Call movie info class
         } 
      } );
      
      
      //Create poster panel #1
      iconButtonPanel = new JPanel();
      iconButtonPanel.setBounds(130, 150, 750, 445);
      iconButtonPanel.setBackground(Color.black);
      iconButtonPanel.setLayout(new GridLayout(2,10));       
      iconButton = new JButton();
      //Create poster #1
      WebflixResize.Resize(0);
      iconButton.setIcon(new ImageIcon("Posters/" + WebflixMain.title[0] + ".jpg"));
      iconButtonPanel.add(iconButton);
      
      //Add action to poster button
      iconButton.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
           MovieInfo.MainInfo(0);//Call movie info for movie
         } 
      } );

      //Create poster #2
      WebflixResize.Resize(1);
      iconButton2 = new JButton();
      iconButton2.setIcon(new ImageIcon("Posters/" + WebflixMain.title[1] + ".jpg"));
      iconButtonPanel.add(iconButton2);
      
      //Add action to poster button
      iconButton2.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
            MovieInfo.MainInfo(1);//Call movie info for movie
         } 
      } );

      //Create poster #3
      WebflixResize.Resize(2);
      iconButton3 = new JButton();
      iconButton3.setIcon(new ImageIcon("Posters/" + WebflixMain.title[2] + ".jpg"));
      iconButtonPanel.add(iconButton3);
      //Add action to poster button
      iconButton3.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
            MovieInfo.MainInfo(2);//Call movie info for movie
         } 
      } );

      
      //Create poster #4
      WebflixResize.Resize(3);
      iconButton4 = new JButton();
      iconButton4.setIcon(new ImageIcon("Posters/" + WebflixMain.title[3] + ".jpg"));
      iconButtonPanel.add(iconButton4);
      
      //Add action to poster button
      iconButton4.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
            MovieInfo.MainInfo(3);//Call movie info for movie
         } 
      } );

      
      //Create poster #5
      WebflixResize.Resize(4);
      iconButton5 = new JButton();
      iconButton5.setIcon(new ImageIcon("Posters/" + WebflixMain.title[4] + ".jpg"));
      iconButtonPanel.add(iconButton5);
      
      //Add action to poster button
      iconButton5.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
            MovieInfo.MainInfo(4);//Call movie info for movie
         } 
      } );


      //Create poster #6
      WebflixResize.Resize(5);
      iconButton6 = new JButton();
      iconButton6.setIcon(new ImageIcon("Posters/" + WebflixMain.title[5] + ".jpg"));
      iconButtonPanel.add(iconButton6);
      //Add action to poster button
      iconButton6.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
            MovieInfo.MainInfo(5);//Call movie info for movie
         } 
      } );

      
      
      //Create poster #7
      WebflixResize.Resize(6);
      iconButton7 = new JButton();
      iconButton7.setIcon(new ImageIcon("Posters/" + WebflixMain.title[6] + ".jpg"));
      iconButtonPanel.add(iconButton7);
      //Add action to poster button
      iconButton7.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
            MovieInfo.MainInfo(6);//Call movie info for movie
         } 
      } );

      
      //Create poster #8
      WebflixResize.Resize(7);
      iconButton8 = new JButton();
      iconButton8.setIcon(new ImageIcon("Posters/" + WebflixMain.title[7] + ".jpg"));
      iconButtonPanel.add(iconButton8);
      //Add action to poster button
      iconButton8.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
            MovieInfo.MainInfo(7);//Call movie info for movie
         } 
      } );
      
      //Create poster #9
      WebflixResize.Resize(8);
      iconButton9 = new JButton();
      iconButton9.setIcon(new ImageIcon("Posters/" + WebflixMain.title[8] + ".jpg"));
      iconButtonPanel.add(iconButton9);
      //Add action to poster button
      iconButton9.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose();//Delete previous frame
            MovieInfo.MainInfo(8);//Call movie info for movie
         } 
      } );
      
      //Create poster #10
      WebflixResize.Resize(9);
      iconButton10 = new JButton();
      iconButton10.setIcon(new ImageIcon("Posters/" + WebflixMain.title[9] + ".jpg"));
      iconButtonPanel.add(iconButton10);
	  //Add action to poster button
      iconButton10.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            window.dispose(); //Delete previous frame
            MovieInfo.MainInfo(9);//Call movie info for movie
         } 
      } );
        
      
      
      //Add all panels to the main frame
      con.add(iconButtonPanel);
      titleNamePanel.add(titleNameLabel);
      con.add(titleNamePanel);
      con.add(backButtonPanel);
      con.add(searchButtonPanel);
      window.setVisible(true);
      
      }
}