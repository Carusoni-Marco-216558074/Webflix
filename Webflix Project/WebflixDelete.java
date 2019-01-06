//Filename: WebflixDelete
//Date: january 15th, 2018

import java.io.*;
public class WebflixDelete{
   /**
   * This method takes the integer inside the array and replaces it with a blank or 0
   * so that it deletes the desired movie
   *@param index   the index parameter is an integer that stores the index values in an array to access the same information across many files 
   */
   public static void Delete ( int index){
   
   
  File file = new File("Posters/" + WebflixMain.title[index] + ".jpg"); //makes an object from File class named file which has parameters for the title of the movie
  file.delete();  //deletes the file called from previous line.
   
    try {
               
      PrintWriter writer = new PrintWriter("Json Files/" + WebflixMain.title[index] + ".json", "UTF-8");
          writer.print("{\"Response\":\"False\"}");
          writer.close();
          
    }
    catch (Exception j) {}


        
   // replaces title, genre, rate, plot, year, director, rateInt, yearInt with blank places in their respective arrays or replaces with a 0 accroding to the type of the array                 
   WebflixMain.title[index] = ""; 
   WebflixMain.genre[index] = "";
   WebflixMain.rate[index] = "";
   WebflixMain.plot[index] = "";
   WebflixMain.year[index] = "";
   WebflixMain.director[index] = ""; 
   WebflixMain.rateInt[index] = 0;
   WebflixMain.yearInt[index] = 0;   

   

        file.delete();

   }
}
 