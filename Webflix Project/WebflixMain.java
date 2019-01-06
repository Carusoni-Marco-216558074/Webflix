//Filename: WebflixMain
//Date: 20/12/2017


import java.awt.*;
import java.io.*;

/**
*@author   Marco, Aritra, Nicholas, Danny
* this class is the main class that calls the main screen, 
* initializes all the variables, and runs the whole program.
*/
public class WebflixMain extends Frame {
      //initializes variables and arrays in the form of strings and integers
   static String[] title = new String [1000];
   static String[] rate = new String[1000];
   static String[] director = new String [1000];
   static String[] plot = new String [1000];
   static String[] genre = new String [1000];
   static String[] year = new String [1000];
   static String[] poster = new String [1000];
   
   static String tempTitle;
   static String tempYear;
   static String tempDirector;
   static String tempPlot;
   static String tempGenre;
   static String tempRating;
   static int tempYearInt;
   static String tempPoster;
   
   
   static int[] rateInt = new int [1000];
   static int[] yearInt = new int [1000];
   
   static int searchedMovie;
   static int index;
   static int finalIndex;
   static int Type;
   static String fileName;  
   static int posterIndex;
   static int pictureIndex;
   public static void main(String[] args) throws Exception { 
// creates initial values for variables,, leaves strings as blanks and leaves integers as 0
      index = 0; 
      posterIndex = 0;
      
      tempTitle = "";
      tempDirector = "";
      tempGenre = "";
      tempPlot = "";
      tempRating = "0";
      tempYear = "0";
      
      while(posterIndex <= 999){
         title[posterIndex] = "File Not Found";
         posterIndex++;
      }
            OfflineInputAuto.AutoInput();
            
     
      while(pictureIndex <= finalIndex){
         WebflixResize.Resize(pictureIndex);
         pictureIndex++;
      }
            
                
            Main.MainRun(); //calling method from main
            
       

   }
}