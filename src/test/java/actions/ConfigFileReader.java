package actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath= "src/test/resources/Config.properties";

    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if(url != null) return url;
        else throw new RuntimeException("url not found");
    }

    public String getFirstName(){
        String FirstName = properties.getProperty("FirstName");
        if(FirstName != null) return FirstName;
        else throw new RuntimeException("FirstName not found");

    }
    public String getLastName(){
        String LastName = properties.getProperty("LastName");
        if(LastName != null) return LastName;
        else throw new RuntimeException("LastName not found");

    }

    public String getZipCode(){
        String ZipCode = properties.getProperty("ZipCode");
        if(ZipCode != null) return ZipCode;
        else throw new RuntimeException("ZipCode not found");

    }

}
