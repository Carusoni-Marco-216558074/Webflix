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

public class WebflixInputAuto{

    /** generates and outputs information from the internet when given a movie title name
    *@param Index index number of item in stored data list
    *@param userMovieInput name of string that is typed in by user
    */
    public static void AutoInput(int Index,String userMovieInput)throws Exception {

        String formattedMovie; // Name of the movie given in the form         
        formattedMovie = userMovieInput.replaceAll("\\s+","+");
      
      
        //source of movie information
        URL movieArchives = new URL("http://www.omdbapi.com/?t=" + formattedMovie + "&apikey=e02c9485");
        //read movie information
        BufferedReader in = new BufferedReader(new InputStreamReader( movieArchives.openStream()));

        String inputLine;
        PrintWriter writer = new PrintWriter("Json Files/" + userMovieInput + ".json", "UTF-8");
        
        while ((inputLine = in.readLine()) != null){
        
            writer.println(inputLine);
        }
        
        
        in.close();
        writer.close();

        Object obj = new JSONParser().parse(new FileReader("Json Files/" + userMovieInput + ".json"));
         

        JSONObject jo = (JSONObject) obj;
          //calls every array from main in order to get info on movies 
        String title = (String) jo.get("Title");
        WebflixMain.title[Index] = (String) jo.get("Title");
        WebflixMain.year[Index] = (String) jo.get("Year");
        WebflixMain.plot[Index] = (String) jo.get("Plot");
        WebflixMain.genre[Index] = (String) jo.get("Genre");
        WebflixMain.director[Index] = (String) jo.get("Director");
        WebflixMain.rate[Index] = (String) jo.get("Metascore");   
        WebflixMain.poster[Index] = (String) jo.get("Poster");
        String poster = (String) jo.get("Poster");
        WebflixMain.yearInt[Index] =  Integer.parseInt(WebflixMain.year[Index]);
        WebflixMain.rateInt[Index] =  Integer.parseInt(WebflixMain.rate[Index]); 
        
        //Generate the poster image
        URL url = new URL(poster);
      InputStream Input = new BufferedInputStream(url.openStream());
      OutputStream Output = new BufferedOutputStream(new FileOutputStream("Posters/" + title + ".jpg"));

      for ( int i; (i = Input.read()) != -1; ) {
         Output.write(i);
      }
      
      Input.close();
      Output.close();
      
      WebflixMain.finalIndex++;
    }
}

      
