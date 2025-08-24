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
}
