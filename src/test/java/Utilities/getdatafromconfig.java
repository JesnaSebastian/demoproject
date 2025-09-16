package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class getdatafromconfig {
    public static String getbrowser(String Key) {
        String browser = null;
        String path = System.getProperty("user.home") + "\\IdeaProjects\\demoproject\\config.properties";
        try {
            FileInputStream fi = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fi);
            browser = prop.getProperty("browser");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return browser;

    }

    public static String getlink(String Key) {
        String link = null;
        String path = System.getProperty("user.home") + "\\IdeaProjects\\demoproject\\config.properties";
        try {
            FileInputStream fi = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fi);
            link = prop.getProperty("link");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return link;

    }

    public static String get_firstname() {
        String First_name = null;
        String path = System.getProperty("user.home") + "\\IdeaProjects\\demoproject\\config.properties";
        try {
            FileInputStream fi = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fi);
            First_name = prop.getProperty("First_name");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return First_name;
    }
    public static String get_pwd()
    {
        String password=null;
        String path = System.getProperty("user.home") + "\\IdeaProjects\\demoproject\\config.properties";
        try{
            FileInputStream fi=new FileInputStream(path);
            Properties prop=new Properties();
            prop.load(fi);
            password=prop.getProperty("password");

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return password;
    }

    public  static String get_email()
    {
        String email=null;
        String path = System.getProperty("user.home") + "\\IdeaProjects\\demoproject\\config.properties";
        try{
            FileInputStream fi=new FileInputStream(path);
            Properties prop=new Properties();
            prop.load(fi);
            email=prop.getProperty("email");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return email;
    }
}
