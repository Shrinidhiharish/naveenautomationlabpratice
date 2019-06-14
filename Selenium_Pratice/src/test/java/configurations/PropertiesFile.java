package configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import testRunner.TestNG_Demo;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");
	public static void main(String[] args) throws IOException 
	{
		getProperties(); 
		setProperties();
		getProperties();
	}
	//To read data from properties file
	public static void getProperties() throws IOException
	{

		try {

			InputStream input = new FileInputStream(projectpath+"\\src\\test\\java\\configurations\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNG_Demo.browserName = browser;
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			e.printStackTrace();

		}
	} 
	//writing data to the properties file 
	public static void setProperties() throws IOException
	{
		try
		{
			OutputStream output = new FileOutputStream(projectpath+"\\src\\test\\java\\configurations\\config.properties");
			prop.setProperty("result","pass");
			prop.store(output, null);
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			e.printStackTrace();

		}
	}
}

