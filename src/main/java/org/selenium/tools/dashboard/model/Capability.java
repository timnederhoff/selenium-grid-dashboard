package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Capability {

    public Capability() {
    }

    private String seleniumProtocol;
    private String browserName;
    private int maxInstances;
    private String version;
    private String platform;
    private String applicationName;

    public String getSeleniumProtocol() {
        return seleniumProtocol;
    }

    public void setSeleniumProtocol(String seleniumProtocol) {
        this.seleniumProtocol = seleniumProtocol;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public int getMaxInstances() {
        return maxInstances;
    }

    public void setMaxInstances(int maxInstances) {
        this.maxInstances = maxInstances;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @Override
    public String toString() {
        return String.format("{ seleniumProtocol=%s, browserName=%s, maxInstances=%d, version=%s, platform=%s, applicationName=%s }",
                seleniumProtocol, browserName, maxInstances, version, platform, applicationName);
    }

}
