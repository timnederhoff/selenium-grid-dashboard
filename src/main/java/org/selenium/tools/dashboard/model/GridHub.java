package org.selenium.tools.dashboard.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GridHub {

    public GridHub() {

    }

    private NodeConfiguration configuration;
    private String loadedFromFile;

    public NodeConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(NodeConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getLoadedFromFile() {
        return loadedFromFile;
    }

    public void setLoadedFromFile(String loadedFromFile) {
        this.loadedFromFile = loadedFromFile;
    }

    @Override
    public String toString() {
        return "GridHub{" +
                "configuration=" + configuration +
                ", loadedFromFile='" + loadedFromFile + '\'' +
                '}';
    }
}
