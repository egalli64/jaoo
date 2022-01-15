package com.example.jse.m14.s16;

import java.io.IOException;
import java.util.Properties;

public class Injector {
    static private final DataService ds;

    static {
        DataService dsTemp = null;
        try {
            var stream = Main.class.getClassLoader().getResourceAsStream("m14/s16/di.properties");
            if (stream != null) {
                Properties p = new Properties();
                p.load(stream);

                dsTemp = switch (p.getProperty("ds")) {
                case "one" -> new DataServiceOne();
                case "two" -> new DataServiceTwo();
                default -> {
                    System.err.println("Unkwnown data service in configuration file, using default");
                    yield null;
                }
                };
            }
        } catch (IOException e) {
            System.err.println("Can't read from properties file");
        } finally {
            ds = dsTemp == null ? new DataServiceOne() : dsTemp;
        }
    }

    static DIClient createClient() {
        return new DIClient(ds);
    }
}
