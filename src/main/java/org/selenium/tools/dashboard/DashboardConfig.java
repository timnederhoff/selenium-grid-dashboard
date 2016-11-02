package org.selenium.tools.dashboard;

import com.typesafe.config.ConfigFactory;

import java.io.File;

public class DashboardConfig {

    public static com.typesafe.config.Config config;

    public DashboardConfig() {

    }

    public static void loadConfig(String configFile) {
        File customConfig = new File(configFile);
        config = ConfigFactory.parseFile(customConfig).withFallback(ConfigFactory.load("dashboard.conf"));
    }

    public static void loadConfig() {
        config = ConfigFactory.load("dashboard.conf");
    }

}
