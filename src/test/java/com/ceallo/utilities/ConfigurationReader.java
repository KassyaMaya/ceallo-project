package com.ceallo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //1- create the object of Properties
    private static Properties properties = new Properties();

    static {


        try {
            //2- we need to open the file in java memory using FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");


            //3- load the properties object using FileInputStream object
            properties.load(file);

            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the configurationReader class.");
            e.printStackTrace();
        }


    }

    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);

    }





}
