package com.rupa.java.fileconcept;

import java.io.File;
import java.io.FilenameFilter;



public class SubFolders {
	
	  public static void main(String[] args) 
	    {
	        File folder = new File("/home/rupa/Rupa/TrainingProject");
	         
	        //Implementing FilenameFilter to retrieve only txt files
	         
	        FilenameFilter txtFileFilter = new FilenameFilter()
	        {    
	            @Override
	            public boolean accept(File dir, String name)
	            {
	                if(name.endsWith(".txt"))
	                {
	                    return true;
	                }
	                else
	                {
	                    return false;
	                }
	            }
	        };
	     
	        //Passing txtFileFilter to listFiles() method to retrieve only txt files
	         
	        File[] files = folder.listFiles(txtFileFilter);
	         
	        for (File file : files) 
	        {
	            System.out.println(file.getName());
	        }
	    }


	}


