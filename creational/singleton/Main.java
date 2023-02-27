package patterns.creational.singleton;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.GetInstance();

        HardProcessor processor = new HardProcessor(1);
        logger.Log("Hard work started...");
        processor.ProcessTo(5);
        logger.Log("Hard work finished...");

    }
}
