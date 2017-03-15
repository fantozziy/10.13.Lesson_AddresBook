import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DatabaseConfig {

    private static Properties propertiesFile;

    static {
        propertiesFile = new Properties();
        InputStream stream = DatabaseConfig.class.getResourceAsStream("data.properties");
        try {
            propertiesFile.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        return propertiesFile.getProperty(key);
    }
}
