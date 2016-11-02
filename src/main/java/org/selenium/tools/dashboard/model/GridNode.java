package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GridNode {

    public GridNode() {
    }

    private Capability[] capabilities;
    private NodeConfiguration configuration;
    private String loadedFromFile;

    public Capability[] getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capability[] capabilities) {
        this.capabilities = capabilities;
    }

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
        return String.format("capabilities=%s, configuration=%s, loadedFromFile=%s",
                Arrays.toString(capabilities), configuration, loadedFromFile);
    }

}
