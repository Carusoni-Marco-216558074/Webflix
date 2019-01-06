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

public class WebflixInput{
    /**
    * This method reads and stores new movie information generated from user input
    *@param index   the index parameter is an integer that stores the index values in an array to access the same information across many files           
    *@param userTitleInput   the userTitleInput parameter is a string that stores the title name of a movie that the user inputs
    *@param userGenreInput   the userGenreInput parameter is a string that stores the genre of a movie that the user inputs
    *@param userPlotInput    the userPlotInput parameter is a string that stores the plot of a movie that the user inputs
    *@param userDateInput    the userDateInput parameter is a string that stores the release date of a movie that the user inputs
    *@param userRateInput    the userRateInput parameter is a string that stores the rating of a movie that the user inputs
    */
    public static void Input(int index, String userTitleInput, String userDirectorInput, String userGenreInput,
                              String userPlotInput, String userDateInput, String userRateInput)
                                 throws Exception
        {

        PrintWriter writer = new PrintWriter("Json Files/" + userTitleInput + ".json", "UTF-8");
        
        writer.print("{\"Title\":\"" + userTitleInput + "\",\"Year\":\"" + userDateInput + "\",\"Genre\":\"" + userGenreInput + "\",\"Director\":\"" + userDirectorInput + "\",\"Plot\":\"" + userPlotInput + "\",\"Metascore\":\"" + userRateInput + "\",\"Response\":\"" + "Error, Movie not Found" + "\"}");
        //add json reader in main class to be able to re-use previous movie inputs.
        writer.close();

        Object obj = new JSONParser().parse(new FileReader("Json Files/" + userTitleInput + ".json"));

        JSONObject jo = (JSONObject) obj;
        //calls every array from main in order to get info on movies  
        WebflixMain.title[index] = (String) jo.get("Title");
        WebflixMain.year[index] = (String) jo.get("Year");
        WebflixMain.plot[index] = (String) jo.get("Plot");
        WebflixMain.genre[index] = (String) jo.get("Genre");
        WebflixMain.director[index] = (String) jo.get("Director");
        WebflixMain.rate[index] = (String) jo.get("Metascore");    
        
        
        
        WebflixMain.yearInt[index] =  Integer.parseInt(WebflixMain.year[index]);
        WebflixMain.rateInt[index] =  Integer.parseInt(WebflixMain.rate[index]); 
        
        WebflixMain.finalIndex++;
    }
}


     

   