package solvd.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FilePropertiesUtil {
    private String path;
    private final String propertiesFile = "src/main/resources/file.properties";

    public FilePropertiesUtil() {
        getProperties();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    private void getProperties() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(propertiesFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        path = prop.getProperty("path");
    }
}
