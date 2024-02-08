package utilities;

import java.util.Properties;

import utilities.ReadPropertiesFile;

public class AccessProperties {

static Properties prop=ReadPropertiesFile.readPropertiesFile();
    
	public static  String getUrl()
	{
			return prop.getProperty("url");
	}
	public static String getBrowser1()
	{
			return prop.getProperty("browser1");
	
	}
	public static String getBrowser2()
	{
			return prop.getProperty("browser2");
	
	}
	public static String getBrowser3()
	{
			return prop.getProperty("browser3");
	
	}
}