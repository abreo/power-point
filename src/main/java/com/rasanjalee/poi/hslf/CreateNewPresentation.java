package com.rasanjalee.poi.hslf;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hslf.usermodel.HSLFSlide;
import org.apache.poi.hslf.usermodel.HSLFSlideShow;

public class CreateNewPresentation {

	public static void main(String[] args) throws IOException {
		 //create a new empty slide show
	    HSLFSlideShow ppt = new HSLFSlideShow();
	    //add first slide
	    HSLFSlide s1 = ppt.createSlide();
	    
	    //add second slide
	    HSLFSlide s2 = ppt.createSlide();
	    
	    //save changes in a file
	    FileOutputStream out = new FileOutputStream("slideshow.ppt");
	    ppt.write(out);
	    out.close();
	    
	}

}
