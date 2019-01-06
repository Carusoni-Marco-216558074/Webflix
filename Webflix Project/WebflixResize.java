//Filename: WebflixResize

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
* this class works on resizing the images to display on the browse page
*/
public class WebflixResize { 
	private static final int IMG_WIDTH = 150;    
	private static final int IMG_HEIGHT = 222;   // image width and height to be displayed on the browse page
   
   /**
   *This reads and searches for the file that needs to be resized
   *@param index   the index parameter is an integer that stores the index values in an array to access the same information across many files
   */
	public static void Resize(int index){

	try{

		BufferedImage originalImage = ImageIO.read(new File("Posters/" + WebflixMain.title[index] +".jpg"));  //calls Buffered image class and make orignalimage into an object having parameters of title 
		int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

		BufferedImage resizeImageJpg = resizeImage(originalImage, type);
		ImageIO.write(resizeImageJpg, "jpg", new File("Posters/" + WebflixMain.title[index] + ".jpg")); //searches for posters in "posters" file and resizes it 



	}catch(IOException e){
	}

    }
    /**
    * this class has parameters for the resized image and the type of image the poster is
    *@param originalImage   the original image that needs to be resized
    *@param type   the type of image that the poster is
    *@return   returns resizedImage
    */
    private static BufferedImage resizeImage(BufferedImage originalImage, int type){   // has parameters for Buffered Image (resized image), orginal image and type
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();

	return resizedImage;
    }


	/**private class for resizeImageWithHint which considers parameters such as originalImage and type
   *@param originalImage   the original image that needs to be resized
   *@param type   the type of image the poster is
   *@return returns resizedImage
   */
    private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){

	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type); //resizedImage is an object made from calling the BufferedImage class
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();
	g.setComposite(AlphaComposite.Src);

	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	RenderingHints.VALUE_RENDER_QUALITY);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);

	return resizedImage; //returns the image resized
    }
}