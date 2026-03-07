package Logger;

public class Logger {

	LogLevel currentLevel;

	public Logger(LogLevel level) {
		this.currentLevel = level;
	}

	void log(LogLevel level, String message) {

		if (level.ordinal() >= currentLevel.ordinal()) {
			System.out.println(level + ": " + message);
		}

	}

	void info(String message) {
		log(LogLevel.INFO, message);
	}

	void debug(String message) {
		log(LogLevel.DEBUG, message);
	}

	void error(String message) {
		log(LogLevel.ERROR, message);
	}

}
