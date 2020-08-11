package com.techproed.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //ConfigReader classsini .properties dosyasini okumak icin olusturuyoruz.

    public static Properties properties;
    // static yaptik cunku nesne olusturmadan erisim saglamak icin.
    static {
       String path = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String getProperty(String key){
        return properties.getProperty(key);
        //  properties.getProperty("browser")
    }
}
