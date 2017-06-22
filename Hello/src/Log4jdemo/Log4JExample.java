package Log4jdemo;

import org.apache.log4j.Category;
import org.apache.log4j.PropertyConfigurator;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * A simple Java Log4j example class.
 * @author alvin alexander, devdaily.com
 */
public class Log4JExample
{
  // our log4j category reference
  @SuppressWarnings("deprecation")
static final Category log = Category.getInstance(Log4JExample.class);
  static final String LOG_PROPERTIES_FILE = "src/log4j.properties";

  public static void main(String[] args)
  {
    // call our constructor
	  System.out.println(System.getProperty("user.dir"));
    new Log4JExample();

    // Log4J is now loaded; try it
    log.info("leaving the main method of Log4JDemo");
    log.error("This error is thrown");
  }

  public Log4JExample()
  {
    initializeLogger();
    log.info( "Log4JExample - leaving the constructor ..." );
  }

  private void initializeLogger()
  {
    Properties logProperties = new Properties();

    try
    {
      // load our log4j properties / configuration file
      logProperties.load(new FileInputStream(LOG_PROPERTIES_FILE));
      PropertyConfigurator.configure(logProperties);
      log.info("Logging initialized.");
    }
    catch(IOException e)
    {
      throw new RuntimeException("Unable to load logging property " + LOG_PROPERTIES_FILE);
    }
  }
}