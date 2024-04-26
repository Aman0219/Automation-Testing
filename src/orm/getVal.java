package orm;

//import java.util.*;
import java.io.*;
import java.util.Properties;


public class getVal {
	
	public static Properties fetchProp(String path) {

        Properties prop = new Properties();

        try (
        		InputStream input = new FileInputStream(path)) {

            prop.load(input);

        } catch (IOException ex) {

            ex.printStackTrace();

        }

        return prop;

    }

}
