//Filename:WebflixInputAuto
//Date: 20/12/2017
//Done

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.net.*;
import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
/**
*@author Marco, Aritra, Nicholas, Danny
* This class looks through files in the archive that already has information stored
* and outputs the information on the screen
*/
public class OfflineInputAuto{

       static boolean tryParseInt(String value) {  
            try {  
               Integer.parseInt(value);  
               return true;  
        } catch (NumberFormatException e) {  
          return false;  
         }  
        }


    public static void AutoInput() throws Exception {
    
      //creates an object called folder from the file class and looks for "Json files"
      File folder = new File("Json Files/");
      File[] listOfFiles = folder.listFiles();
      String response;
      //for loop searches for movie in the archive
      for (int fileCounter = 0; fileCounter < listOfFiles.length; fileCounter++) {
      
         if (listOfFiles[fileCounter].isFile()) {
               //read movies from json files
               Object obj = new JSONParser().parse(new FileReader("Json Files/" + listOfFiles[fileCounter].getName()));
               JSONObject jo = (JSONObject) obj;
               //calls every array from main in order to get info on movies  
               

               
                     response = (String)jo.get("Response"); 
                        
 
                     
                     if(((String)jo.get("Response")).trim().equalsIgnoreCase("True") && tryParseInt((String) jo.get("Metascore")) == true &&  tryParseInt((String) jo.get("Year")) == true){
                                                          
                        WebflixMain.title[WebflixMain.index] = (String) jo.get("Title");
                        WebflixMain.year[WebflixMain.index] = (String) jo.get("Year");
                        WebflixMain.plot[WebflixMain.index] = (String) jo.get("Plot");
                        WebflixMain.genre[WebflixMain.index] = (String) jo.get("Genre");
                        WebflixMain.director[WebflixMain.index] = (String) jo.get("Director");
                        WebflixMain.rate[WebflixMain.index] = (String) jo.get("Metascore");   
                        WebflixMain.poster[WebflixMain.index] = (String) jo.get("Poster");
                        WebflixMain.yearInt[WebflixMain.index] =  Integer.parseInt(WebflixMain.year[WebflixMain.index]);
                        WebflixMain.rateInt[WebflixMain.index] =  Integer.parseInt(WebflixMain.rate[WebflixMain.index]); 
                     }
                     
                     if(((String)jo.get("Response")).trim().equalsIgnoreCase("False")){
                     
                        WebflixMain.title[WebflixMain.index] = "Error, Movie not Found";
                        WebflixMain.year[WebflixMain.index] = "0";
                        WebflixMain.plot[WebflixMain.index] = "";
                        WebflixMain.genre[WebflixMain.index] = "";
                        WebflixMain.director[WebflixMain.index] = "";
                        WebflixMain.rate[WebflixMain.index] = "0";   
                        WebflixMain.poster[WebflixMain.index] = "";
                        WebflixMain.yearInt[WebflixMain.index] =  Integer.parseInt(WebflixMain.year[WebflixMain.index]);
                        WebflixMain.rateInt[WebflixMain.index] =  Integer.parseInt(WebflixMain.rate[WebflixMain.index]); 
                     }
                  
                     if(((String)jo.get("Response")).trim().equalsIgnoreCase("Error, Movie not Found") && tryParseInt((String) jo.get("Metascore")) == true &&  tryParseInt((String) jo.get("Year")) == true){
                     
                     
                        WebflixMain.title[WebflixMain.index] = (String) jo.get("Title");
                        WebflixMain.year[WebflixMain.index] = (String) jo.get("Year");
                        WebflixMain.plot[WebflixMain.index] = (String) jo.get("Plot");
                        WebflixMain.genre[WebflixMain.index] = (String) jo.get("Genre");
                        WebflixMain.director[WebflixMain.index] = (String) jo.get("Director");
                        WebflixMain.rate[WebflixMain.index] = (String) jo.get("Metascore");  
                       WebflixMain.yearInt[WebflixMain.index] =  Integer.parseInt(WebflixMain.year[WebflixMain.index]);
                       WebflixMain.rateInt[WebflixMain.index] =  Integer.parseInt(WebflixMain.rate[WebflixMain.index]);
                        
                        URL url = new URL("http://www.filmfodder.com/reviews/images/poster-not-available.jpg");
                        InputStream Input = new BufferedInputStream(url.openStream());
                        OutputStream Output = new BufferedOutputStream(new FileOutputStream("Posters/" + WebflixMain.title[WebflixMain.index] + ".jpg"));
                     
                        for ( int i; (i = Input.read()) != -1; ) {
                           Output.write(i);
                        }
                        
                        Input.close();
                        Output.close();
                                       
                                       
                     }
                  
                  
                     
               WebflixMain.index++;
                     
            }
        }
        
      
      WebflixMain.finalIndex = WebflixMain.index;
      
    }
}

      
