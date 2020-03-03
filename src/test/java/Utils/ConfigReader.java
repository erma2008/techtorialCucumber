package Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties configFile;

    static{
        String path="configuration.properties";
        try {
            //it will open the file
            FileInputStream input=new FileInputStream(path);
            //now we need to load the file
            configFile=new Properties();
            configFile.load(input);

            input.close();//this will close the file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyValue){
        return configFile.getProperty(keyValue);
    }
}
