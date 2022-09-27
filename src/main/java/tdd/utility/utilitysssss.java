package tdd.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utilitysssss {
	public static Object  fetch_properties(String key) {

		try {
			FileInputStream fi=new FileInputStream("./configer/web.properties");

			Properties propertieee= new Properties();
			propertieee.load(fi);
		      propertieee.get(key);
		} catch (IOException e) {}
		return key;
		
		


	}

}


