package org.selenium.tools.dashboard;


import org.selenium.tools.dashboard.model.Configuration;
import org.selenium.tools.dashboard.model.GridStatus;
import org.selenium.tools.dashboard.model.SystemInfo;

public class AllInfo {
    private Configuration config;
    private SystemInfo systemInfo;
    private GridStatus gridStatus;
    private String machineName;
    private String baseUrl;

    public AllInfo(String machineName, String baseUrl, Configuration config, SystemInfo systemInfo, GridStatus gridStatus) throws Exception {
        this.machineName = machineName;
        this.baseUrl = baseUrl;
        this.config = config;
        this.systemInfo = systemInfo;
        this.gridStatus = gridStatus;
    }

    public Configuration getConfig() {
        return config;
    }

    public void setConfig(Configuration config) {
        this.config = config;
    }

    public SystemInfo getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(SystemInfo systemInfo) {
        this.systemInfo = systemInfo;
    }

    public GridStatus getGridStatus() {
        return gridStatus;
    }

    public void setGridStatus(GridStatus gridStatus) {
        this.gridStatus = gridStatus;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
