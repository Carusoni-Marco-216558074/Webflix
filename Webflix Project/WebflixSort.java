//Filename: Webflixwebflix.Main.TitleSort
//Date: 9th December


/**
*@author   Marco, Aritra, Nicholas, Danny
* This class implements a sort method that sorts all the movies inside the list
*/
public class WebflixSort {
   /**
   *This sorts the list of movies based on its category
   *@param category  the category (title, genre, release date, rating) that is sorted 
   */
   public static void Sort(int category){
         int ratingUp = 2;
         int ratingDown = 0;
         int yearUp = 3;
         int yearDown = 1;
         int titleUp = 4;
         int titleDown = 5;
         int genre = 6;
         int i = 0;
         int tempInt = 0;
         int titleCompare;
         
                          
         if (category == ratingDown){
           
             for (i = 0; i < WebflixMain.finalIndex; i++){ 
		         
			      for (int k = i + 1; k < WebflixMain.finalIndex; k++){ 

                     
				      if (WebflixMain.rateInt[i] < WebflixMain.rateInt[k]){
				            //rateInt
					         tempInt = WebflixMain.rateInt[i];
					         WebflixMain.rateInt[i] = WebflixMain.rateInt[k];
                        WebflixMain.rateInt[k] = tempInt;

                        //title
                        WebflixMain.tempTitle = WebflixMain.title[i];
                        WebflixMain.title[i] = WebflixMain.title[k];
                        WebflixMain.title[k] = WebflixMain.tempTitle;                   
                        
                        
                        //rate
                        WebflixMain.tempRating =  WebflixMain.rate[i];
                        WebflixMain.rate[i] = WebflixMain.rate[k];
                        WebflixMain.rate[k] = WebflixMain.tempRating;
                        
                        //director
                        WebflixMain.tempDirector = WebflixMain.director[i];
                        WebflixMain.director[i] = WebflixMain.director[k];
                        WebflixMain.director[k] = WebflixMain.tempDirector;
                        
                        //plot
                        WebflixMain.tempPlot = WebflixMain.plot[i];
                        WebflixMain.plot[i] = WebflixMain.plot[k];
                        WebflixMain.plot[k] = WebflixMain.tempPlot;
                        
                        //genre
                        WebflixMain.tempGenre = WebflixMain.genre[i];
                        WebflixMain.genre[i] = WebflixMain.genre[k];
                        WebflixMain.genre[k] = WebflixMain.tempGenre;
                        
                        //year
                        WebflixMain.tempYear = WebflixMain.year[i];
                        WebflixMain.year[i] = WebflixMain.year[k];
                        WebflixMain.year[k] = WebflixMain.tempYear;
                        
                        //poster
                        WebflixMain.tempPoster = WebflixMain.poster[i];
                        WebflixMain.poster[i] = WebflixMain.poster[k];
                        WebflixMain.poster[k] = WebflixMain.tempPoster;
                        
                        //yearInt
                        WebflixMain.tempYearInt = WebflixMain.yearInt[i];
                        WebflixMain.yearInt[i] = WebflixMain.yearInt[k];
					         WebflixMain.yearInt[k] = WebflixMain.tempYearInt;
                       
				      }
     
			      }
		       }
            
          } 
          
              if (category == yearDown){
           
             for (i = 0; i < WebflixMain.finalIndex; i++){ 
		         
			      for (int k = i + 1; k < WebflixMain.finalIndex; k++){ 

                     
				      if (WebflixMain.yearInt[i] < WebflixMain.yearInt[k]){
				            //rateInt
					         tempInt = WebflixMain.rateInt[i];
					         WebflixMain.rateInt[i] = WebflixMain.rateInt[k];
                        WebflixMain.rateInt[k] = tempInt;

                        //title
                        WebflixMain.tempTitle = WebflixMain.title[i];
                        WebflixMain.title[i] = WebflixMain.title[k];
                        WebflixMain.title[k] = WebflixMain.tempTitle;                   
                        
                        
                        //rate
                        WebflixMain.tempRating =  WebflixMain.rate[i];
                        WebflixMain.rate[i] = WebflixMain.rate[k];
                        WebflixMain.rate[k] = WebflixMain.tempRating;
                        
                        //director
                        WebflixMain.tempDirector = WebflixMain.director[i];
                        WebflixMain.director[i] = WebflixMain.director[k];
                        WebflixMain.director[k] = WebflixMain.tempDirector;
                        
                        //plot
                        WebflixMain.tempPlot = WebflixMain.plot[i];
                        WebflixMain.plot[i] = WebflixMain.plot[k];
                        WebflixMain.plot[k] = WebflixMain.tempPlot;
                        
                        //genre
                        WebflixMain.tempGenre = WebflixMain.genre[i];
                        WebflixMain.genre[i] = WebflixMain.genre[k];
                        WebflixMain.genre[k] = WebflixMain.tempGenre;
                        
                        //year
                        WebflixMain.tempYear = WebflixMain.year[i];
                        WebflixMain.year[i] = WebflixMain.year[k];
                        WebflixMain.year[k] = WebflixMain.tempYear;
                        
                        //poster
                        WebflixMain.tempPoster = WebflixMain.poster[i];
                        WebflixMain.poster[i] = WebflixMain.poster[k];
                        WebflixMain.poster[k] = WebflixMain.tempPoster;
                        
                        //yearInt
                        WebflixMain.tempYearInt = WebflixMain.yearInt[i];
                        WebflixMain.yearInt[i] = WebflixMain.yearInt[k];
					         WebflixMain.yearInt[k] = WebflixMain.tempYearInt;
                   }
               }
            }
         }
         
         
         
                       if (category == yearUp){
           
             for (i = 0; i < WebflixMain.finalIndex; i++){ 
		         
			      for (int k = i + 1; k < WebflixMain.finalIndex; k++){ 

                     
				      if (WebflixMain.yearInt[i] > WebflixMain.yearInt[k]){
				            //rateInt
					         tempInt = WebflixMain.rateInt[i];
					         WebflixMain.rateInt[i] = WebflixMain.rateInt[k];
                        WebflixMain.rateInt[k] = tempInt;

                        //title
                        WebflixMain.tempTitle = WebflixMain.title[i];
                        WebflixMain.title[i] = WebflixMain.title[k];
                        WebflixMain.title[k] = WebflixMain.tempTitle;                   
                        
                        
                        //rate
                        WebflixMain.tempRating =  WebflixMain.rate[i];
                        WebflixMain.rate[i] = WebflixMain.rate[k];
                        WebflixMain.rate[k] = WebflixMain.tempRating;
                        
                        //director
                        WebflixMain.tempDirector = WebflixMain.director[i];
                        WebflixMain.director[i] = WebflixMain.director[k];
                        WebflixMain.director[k] = WebflixMain.tempDirector;
                        
                        //plot
                        WebflixMain.tempPlot = WebflixMain.plot[i];
                        WebflixMain.plot[i] = WebflixMain.plot[k];
                        WebflixMain.plot[k] = WebflixMain.tempPlot;
                        
                        //genre
                        WebflixMain.tempGenre = WebflixMain.genre[i];
                        WebflixMain.genre[i] = WebflixMain.genre[k];
                        WebflixMain.genre[k] = WebflixMain.tempGenre;
                        
                        //year
                        WebflixMain.tempYear = WebflixMain.year[i];
                        WebflixMain.year[i] = WebflixMain.year[k];
                        WebflixMain.year[k] = WebflixMain.tempYear;
                        
                        //poster
                        WebflixMain.tempPoster = WebflixMain.poster[i];
                        WebflixMain.poster[i] = WebflixMain.poster[k];
                        WebflixMain.poster[k] = WebflixMain.tempPoster;
                        
                        //yearInt
                        WebflixMain.tempYearInt = WebflixMain.yearInt[i];
                        WebflixMain.yearInt[i] = WebflixMain.yearInt[k];
					         WebflixMain.yearInt[k] = WebflixMain.tempYearInt;
                   }
               }
            }
        }
        
        
        
        
        if (category == ratingUp){
           
             for (i = 0; i < WebflixMain.finalIndex; i++){ 
		         
			      for (int k = i + 1; k < WebflixMain.finalIndex; k++){ 

                     
				      if (WebflixMain.rateInt[i] > WebflixMain.rateInt[k]){
				            //rateInt
					         tempInt = WebflixMain.rateInt[i];
					         WebflixMain.rateInt[i] = WebflixMain.rateInt[k];
                        WebflixMain.rateInt[k] = tempInt;

                        //title
                        WebflixMain.tempTitle = WebflixMain.title[i];
                        WebflixMain.title[i] = WebflixMain.title[k];
                        WebflixMain.title[k] = WebflixMain.tempTitle;                   
                        
                        
                        //rate
                        WebflixMain.tempRating =  WebflixMain.rate[i];
                        WebflixMain.rate[i] = WebflixMain.rate[k];
                        WebflixMain.rate[k] = WebflixMain.tempRating;
                        
                        //director
                        WebflixMain.tempDirector = WebflixMain.director[i];
                        WebflixMain.director[i] = WebflixMain.director[k];
                        WebflixMain.director[k] = WebflixMain.tempDirector;
                        
                        //plot
                        WebflixMain.tempPlot = WebflixMain.plot[i];
                        WebflixMain.plot[i] = WebflixMain.plot[k];
                        WebflixMain.plot[k] = WebflixMain.tempPlot;
                        
                        //genre
                        WebflixMain.tempGenre = WebflixMain.genre[i];
                        WebflixMain.genre[i] = WebflixMain.genre[k];
                        WebflixMain.genre[k] = WebflixMain.tempGenre;
                        
                        //year
                        WebflixMain.tempYear = WebflixMain.year[i];
                        WebflixMain.year[i] = WebflixMain.year[k];
                        WebflixMain.year[k] = WebflixMain.tempYear;
                        
                        //poster
                        WebflixMain.tempPoster = WebflixMain.poster[i];
                        WebflixMain.poster[i] = WebflixMain.poster[k];
                        WebflixMain.poster[k] = WebflixMain.tempPoster;
                        
                        //yearInt
                        WebflixMain.tempYearInt = WebflixMain.yearInt[i];
                        WebflixMain.yearInt[i] = WebflixMain.yearInt[k];
					         WebflixMain.yearInt[k] = WebflixMain.tempYearInt;
                       
				      }
     
			      }
		       }
            
          } 
          
          
          
           if (category == titleDown){
           
             for (i = 0; i < WebflixMain.finalIndex; i++){ 
		         
			      for (int k = i + 1; k < WebflixMain.finalIndex; k++){ 

                     
                   
                   
                   titleCompare = WebflixMain.title[i].compareToIgnoreCase(WebflixMain.title[k]);  
                     
				      if (titleCompare < 0){
				            //rateInt
					         tempInt = WebflixMain.rateInt[i];
					         WebflixMain.rateInt[i] = WebflixMain.rateInt[k];
                        WebflixMain.rateInt[k] = tempInt;

                        //title
                        WebflixMain.tempTitle = WebflixMain.title[i];
                        WebflixMain.title[i] = WebflixMain.title[k];
                        WebflixMain.title[k] = WebflixMain.tempTitle;                   
                        
                        
                        //rate
                        WebflixMain.tempRating =  WebflixMain.rate[i];
                        WebflixMain.rate[i] = WebflixMain.rate[k];
                        WebflixMain.rate[k] = WebflixMain.tempRating;
                        
                        //director
                        WebflixMain.tempDirector = WebflixMain.director[i];
                        WebflixMain.director[i] = WebflixMain.director[k];
                        WebflixMain.director[k] = WebflixMain.tempDirector;
                        
                        //plot
                        WebflixMain.tempPlot = WebflixMain.plot[i];
                        WebflixMain.plot[i] = WebflixMain.plot[k];
                        WebflixMain.plot[k] = WebflixMain.tempPlot;
                        
                        //genre
                        WebflixMain.tempGenre = WebflixMain.genre[i];
                        WebflixMain.genre[i] = WebflixMain.genre[k];
                        WebflixMain.genre[k] = WebflixMain.tempGenre;
                        
                        //year
                        WebflixMain.tempYear = WebflixMain.year[i];
                        WebflixMain.year[i] = WebflixMain.year[k];
                        WebflixMain.year[k] = WebflixMain.tempYear;
                        
                        //poster
                        WebflixMain.tempPoster = WebflixMain.poster[i];
                        WebflixMain.poster[i] = WebflixMain.poster[k];
                        WebflixMain.poster[k] = WebflixMain.tempPoster;
                        
                        //yearInt
                        WebflixMain.tempYearInt = WebflixMain.yearInt[i];
                        WebflixMain.yearInt[i] = WebflixMain.yearInt[k];
					         WebflixMain.yearInt[k] = WebflixMain.tempYearInt;
                       
				      }
     
			      }
		       }
            
          } 

          
           
           if (category == titleUp){
           
             for (i = 0; i < WebflixMain.finalIndex; i++){ 
		         
			      for (int k = i + 1; k < WebflixMain.finalIndex; k++){ 
                   
                   titleCompare = WebflixMain.title[i].compareToIgnoreCase(WebflixMain.title[k]);  
                     
				      if (titleCompare > 0){
                  
				            //rateInt
					         tempInt = WebflixMain.rateInt[i];
					         WebflixMain.rateInt[i] = WebflixMain.rateInt[k];
                        WebflixMain.rateInt[k] = tempInt;

                        //title
                        WebflixMain.tempTitle = WebflixMain.title[i];
                        WebflixMain.title[i] = WebflixMain.title[k];
                        WebflixMain.title[k] = WebflixMain.tempTitle;                   
                        
                        
                        //rate
                        WebflixMain.tempRating =  WebflixMain.rate[i];
                        WebflixMain.rate[i] = WebflixMain.rate[k];
                        WebflixMain.rate[k] = WebflixMain.tempRating;
                        
                        //director
                        WebflixMain.tempDirector = WebflixMain.director[i];
                        WebflixMain.director[i] = WebflixMain.director[k];
                        WebflixMain.director[k] = WebflixMain.tempDirector;
                        
                        //plot
                        WebflixMain.tempPlot = WebflixMain.plot[i];
                        WebflixMain.plot[i] = WebflixMain.plot[k];
                        WebflixMain.plot[k] = WebflixMain.tempPlot;
                        
                        //genre
                        WebflixMain.tempGenre = WebflixMain.genre[i];
                        WebflixMain.genre[i] = WebflixMain.genre[k];
                        WebflixMain.genre[k] = WebflixMain.tempGenre;
                        
                        //year
                        WebflixMain.tempYear = WebflixMain.year[i];
                        WebflixMain.year[i] = WebflixMain.year[k];
                        WebflixMain.year[k] = WebflixMain.tempYear;
                        
                        //poster
                        WebflixMain.tempPoster = WebflixMain.poster[i];
                        WebflixMain.poster[i] = WebflixMain.poster[k];
                        WebflixMain.poster[k] = WebflixMain.tempPoster;
                        
                        //yearInt
                        WebflixMain.tempYearInt = WebflixMain.yearInt[i];
                        WebflixMain.yearInt[i] = WebflixMain.yearInt[k];
					         WebflixMain.yearInt[k] = WebflixMain.tempYearInt;
                       
				      }
     
			      }
		       }
            
          } 

          
           if (category == genre){
           
             for (i = 0; i < WebflixMain.finalIndex; i++){ 
		         
			      for (int k = i + 1; k < WebflixMain.finalIndex; k++){ 
                   
                   titleCompare = WebflixMain.genre[i].compareToIgnoreCase(WebflixMain.genre[k]);  
                     
				      if (titleCompare > 0){
                  
				            //rateInt
					         tempInt = WebflixMain.rateInt[i];
					         WebflixMain.rateInt[i] = WebflixMain.rateInt[k];
                        WebflixMain.rateInt[k] = tempInt;

                        //title
                        WebflixMain.tempTitle = WebflixMain.title[i];
                        WebflixMain.title[i] = WebflixMain.title[k];
                        WebflixMain.title[k] = WebflixMain.tempTitle;                   
                        
                        
                        //rate
                        WebflixMain.tempRating =  WebflixMain.rate[i];
                        WebflixMain.rate[i] = WebflixMain.rate[k];
                        WebflixMain.rate[k] = WebflixMain.tempRating;
                        
                        //director
                        WebflixMain.tempDirector = WebflixMain.director[i];
                        WebflixMain.director[i] = WebflixMain.director[k];
                        WebflixMain.director[k] = WebflixMain.tempDirector;
                        
                        //plot
                        WebflixMain.tempPlot = WebflixMain.plot[i];
                        WebflixMain.plot[i] = WebflixMain.plot[k];
                        WebflixMain.plot[k] = WebflixMain.tempPlot;
                        
                        //genre
                        WebflixMain.tempGenre = WebflixMain.genre[i];
                        WebflixMain.genre[i] = WebflixMain.genre[k];
                        WebflixMain.genre[k] = WebflixMain.tempGenre;
                        
                        //year
                        WebflixMain.tempYear = WebflixMain.year[i];
                        WebflixMain.year[i] = WebflixMain.year[k];
                        WebflixMain.year[k] = WebflixMain.tempYear;
                        
                        //poster
                        WebflixMain.tempPoster = WebflixMain.poster[i];
                        WebflixMain.poster[i] = WebflixMain.poster[k];
                        WebflixMain.poster[k] = WebflixMain.tempPoster;
                        
                        //yearInt
                        WebflixMain.tempYearInt = WebflixMain.yearInt[i];
                        WebflixMain.yearInt[i] = WebflixMain.yearInt[k];
					         WebflixMain.yearInt[k] = WebflixMain.tempYearInt;
                       
				      }
     
			      }
		       }
            
          } 


          
      
     }             
}

           