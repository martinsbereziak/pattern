package patterns.creational.singleton;

import static java.lang.System.out;

public class LoggerSingleton {
    private LoggerSingleton() {
    }

    private int _logCount = 0;
    private static LoggerSingleton _loggerSingletonInstance = null;

    public static LoggerSingleton GetInstance() {
        if (_loggerSingletonInstance == null) {
            _loggerSingletonInstance = new LoggerSingleton();
        }
        return _loggerSingletonInstance;
    }

    public void Log(String message) {
        out.println(_logCount + ": " + message);
        _logCount++;
    }

}
