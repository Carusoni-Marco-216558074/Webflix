public class WebflixSearch{
    /**
    * the Search method compares the string that the user inputs to that in the files and if it matches, it outputs that movie 
    *@param searchInput   the searchInput parameter is the string that the user inputs to search for a movie
    */
    public static void Search(String searchInput){ //Makes Search method
    
      int i = 0;
      int foundI = 0;
      int counter = 0;
      int len = 0;
      char char2;
      char char1;
      boolean movieFound = false;
      
      while(i <= WebflixMain.finalIndex){
// for loop used for matching the length of the input length and searches for it, compares the characters and when it matches, boolean is turned to true.
             while(len < searchInput.length() && len < WebflixMain.title[i].length()){
             
                     char1 = searchInput.toUpperCase().charAt((len));
                     char2 = WebflixMain.title[i].toUpperCase().charAt((len));
      
                     
                        if(char1 == char2)
                           counter++;
                           
                        if (counter == searchInput.length()){
                             
                             movieFound = true;
                             foundI = i;
                        }
                        len++;
                      
             }
         len = 0;
         counter = 0;
          i++; 
      }
      
      if (movieFound == true){
         WebflixMain.searchedMovie = foundI;// movie is at index i
         
      }else{
      
         WebflixMain.searchedMovie = 999;
      
      }
   }
}