package com.rasanjalee.poi.hslf;

import java.io.IOException;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlideLayout;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;

public class SlideLayouts {

   public static void main(String args[]) throws IOException {
   
      //create an empty presentation
      XMLSlideShow ppt = new XMLSlideShow();
      System.out.println("Available slide layouts:");
   
      //getting the list of all slide masters
      for(XSLFSlideMaster master : ppt.getSlideMasters()) {
   
         //getting the list of the layouts in each slide master
         for(XSLFSlideLayout layout : master.getSlideLayouts()) {
   
            //getting the list of available slides
            System.out.println(layout.getType());
         } 
      }
   }
}