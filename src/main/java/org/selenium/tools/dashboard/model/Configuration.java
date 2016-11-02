package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Configuration extends ExtrasResponse {

    public Configuration() {

    }

    private ConfigRuntime config_runtime;
    private String[] filename;
    private boolean loadedSuccessfully;
    private String errorMessage;

    public ConfigRuntime getConfig_runtime() {
        return config_runtime;
    }

    public void setConfig_runtime(ConfigRuntime config_runtime) {
        this.config_runtime = config_runtime;
    }

    public String[] getFilename() {
        return filename;
    }

    public void setFilename(String[] filename) {
        this.filename = filename;
    }

    public boolean isLoadedSuccessfully() {
        return loadedSuccessfully;
    }

    public void setLoadedSuccessfully(boolean loadedSuccessfully) {
        this.loadedSuccessfully = loadedSuccessfully;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "config_runtime=" + config_runtime +
                ", filename=" + Arrays.toString(filename) +
                ", out=" + Arrays.toString(super.getOut()) +
                ", error=" + Arrays.toString(super.getError()) +
                ", exit_code=" + super.getExitCode() +
                '}';
    }
}