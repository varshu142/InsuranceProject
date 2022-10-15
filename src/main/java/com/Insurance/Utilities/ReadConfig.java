package com.Insurance.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    public Properties pro;

    public ReadConfig(){
        File src = new File("./Configuration/config.Properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e){
            System.out.println("Exception is " + e.getMessage());
        }

    }

    public String getApplicationURL(){
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getChromePath(){
        String chromePath = pro.getProperty("chromepath");
        return chromePath;
    }
}
