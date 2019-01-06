import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
import java.util.*;
//Filename: Menu.java
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.util.Arrays;
import java.util.Collections;
/**
*@author Marco, Aritra, Nicholas, Danny
* this class displays the list of movies for the user to choose from and allows
* them to sort the movies by title, genre, date, and rating and also delete movies
*/
public class Menu {
   
   Font titleFont = new Font("TimesRoman", Font.BOLD, 60);
   
   public static void MainMenu(){
   
      new Menu();
   }
   public Menu(){
      //create the main frame for each panel to go on
       final JFrame frame = new JFrame("WEBFLIX");
      frame.setSize(1020,720);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setBackground(Color.black);
      frame.setLayout(null);
      frame.setResizable(false);
      Container con = frame.getContentPane();
      //Create the menubar 
      JMenuBar menubar = new JMenuBar();
      frame.setJMenuBar(menubar);
      JMenu file = new JMenu("Sort By:");
      menubar.add(file);
            
      JMenuItem ratingDown = new JMenuItem("Rating (Descending)");
      file.add(ratingDown);
      
      JMenuItem ratingUp = new JMenuItem("Rating (Ascending)");
      file.add(ratingUp);

      JMenuItem yearDown = new JMenuItem("Year (Descending)");
      file.add(yearDown);
      
      JMenuItem yearUp = new JMenuItem("Year (Ascending)");
      file.add(yearUp);
      
      JMenuItem titleDown = new JMenuItem("Title (Descending)");
      file.add(titleDown);
      
      JMenuItem titleUp = new JMenuItem("Title (Ascending)");
      file.add(titleUp);
      
      JMenuItem genre = new JMenuItem("Genre");
      file.add(genre);
      
      
      JMenu help = new JMenu("Delete:");
      menubar.add(help);
      
//sort rating       
 ratingDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            WebflixSort.Sort(0);
            
            frame.dispose();//delete previous frame
            Menu.MainMenu(); 

            }});

      
      yearDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            WebflixSort.Sort(1);
            
            frame.dispose();//delete previous frame
            Menu.MainMenu(); 

            }});
            
            
            
       ratingUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            WebflixSort.Sort(2);
            
            frame.dispose();//delete previous frame
            Menu.MainMenu(); 

            }});

      //sorts the movie by year
      yearUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            WebflixSort.Sort(3);
            
            frame.dispose();//delete previous frame
            Menu.MainMenu(); 

            }});       

      
      titleDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            WebflixSort.Sort(5);
            
            frame.dispose();//delete previous frame
            Menu.MainMenu(); 

            }});
       //sorts the movie by title     
       titleUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            WebflixSort.Sort(4);
            
            frame.dispose();//delete previous frame
            Menu.MainMenu(); 

            }});

      
      //sorts the movie by genre
      genre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            WebflixSort.Sort(6);
            
            frame.dispose();//delete previous frame
            Menu.MainMenu(); 

            }});

      
      
      
      
      JMenuItem about = new JMenuItem("Delete a movie");
      help.add(about);
      
       about.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
         
         String movieToDelete = JOptionPane.showInputDialog("Enter a movie to be deleted.");
            
         WebflixSearch.Search(movieToDelete);
         WebflixDelete.Delete(WebflixMain.searchedMovie); 
         JOptionPane.showMessageDialog(null, "Please reboot program to see changes.");   
            
         } 
      } );
      
      //Creates panel for title to go on
      JPanel titleNamePanel = new JPanel();
      titleNamePanel.setBounds(350,25,500,150);
      titleNamePanel.setBackground (Color.black);
      //Create Label for title
      JLabel titleNameLabel = new JLabel(new ImageIcon("Program Images/MOVIES.png"));
      titleNameLabel.setForeground(Color.red);
      titleNameLabel.setFont(titleFont);
      titleNamePanel.add(titleNameLabel);
      
      JPanel backButtonPanel6 = new JPanel();
      backButtonPanel6.setBounds(10, 10, 50, 50);
      backButtonPanel6.setBackground(Color.black);
      backButtonPanel6.setLayout(new GridLayout(1,1));
       
      JButton backButton6 = new JButton();
      backButton6.setIcon(new ImageIcon("Program Images/back.jpg"));
      backButtonPanel6.add(backButton6);
      
       backButton6.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            frame.dispose();//Delete previous frame
            Main.MainRun();//Go to the start
         } 
      } );

      
      JPanel helpButtonPanel6 = new JPanel();
      helpButtonPanel6.setBounds(950, 600, 50, 50);
      helpButtonPanel6.setBackground(Color.black);
      helpButtonPanel6.setLayout(new GridLayout(1,1));
       
      JButton helpButton6 = new JButton();
      helpButton6.setIcon(new ImageIcon("Program Images/question.jpg"));
      helpButtonPanel6.add(helpButton6);
      
      
      helpButton6.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
            
            JOptionPane.showMessageDialog(null, "double click a movie to view information about it.");
         } 
      } );

      
      JPanel movieList = new JPanel();
      movieList.setBounds(150,150,700,400);
      movieList.setLayout(new BorderLayout());
      DefaultListModel model = new DefaultListModel();
      JList list = new JList(model);
      
      //creates mouse listener to check when an element of the list has been double clicked
      MouseListener mouseListener = new MouseAdapter() { 
      public void mouseClicked(MouseEvent mouseEvent) {
        JList theList = (JList) mouseEvent.getSource();
        if (mouseEvent.getClickCount() == 2) {
          int index = theList.locationToIndex(mouseEvent.getPoint());
          if (index >= 0) {
            Object titleName = theList.getModel().getElementAt(index);
            WebflixSearch.Search(titleName.toString());
            MovieInfo.MainInfo(WebflixMain.searchedMovie);
            frame.dispose();
          }
        }
      }
    };
    list.addMouseListener(mouseListener);
      
      
      JScrollPane pane = new JScrollPane(list);
      list.setVisibleRowCount(15);
      list.setFixedCellHeight(30); 
      
      for (int i = 0; i < WebflixMain.finalIndex; i++)
         model.addElement(WebflixMain.title[i]);

   
      movieList.add(pane, BorderLayout.NORTH);
 
     /////////////////////////////////////////////////////model.removeElementAt(0);

      
      con.add(helpButtonPanel6);
      con.add(backButtonPanel6);
      con.add(movieList);
      con.add(titleNamePanel);
      frame.setVisible(true);
   }
}