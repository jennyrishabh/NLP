package com.search.NLP_sementic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App 
{
	// stored the jar file at the location : /Users/jerry/.m2/repository/edu/stanford
	
	public Properties getProperties() throws IOException {
        
        InputStream inputStream=null;
        Properties properties = new Properties();
        try {
            
            String propFileName = "application.properties";
 
            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not foundin the classpath");
            }
 
 
        } catch (Exception e) {
            System.out.println("Exception: " + e);
       } finally {
            inputStream.close();
        }
         return properties;
    }
	
	
	
    public static void main( String[] args ) throws IOException{
    	
         Properties properties=new App().getProperties();
         
         // reading the values from the properties file by : 
         System.out.println(properties.getProperty("link"));
         
         String text = "";
         
         
         
         
    	
    	
    	
    }
}
