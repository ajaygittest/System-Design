package Logger;

public class LoggerManager {
	
	 static Logger getLogger(LogLevel level) {

	        return new Logger(level);
	    }

}
