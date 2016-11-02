package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigRuntime {

    public ConfigRuntime() {
    }

    private ConfigMap theConfigMap;
    private GridNode[] gridNodeList;
    private GridHub[] gridHubList;

    public ConfigMap getTheConfigMap() {
        return theConfigMap;
    }

    public void setTheConfigMap(ConfigMap theConfigMap) {
        this.theConfigMap = theConfigMap;
    }

    public GridNode[] getGridNodeList() {
        return gridNodeList;
    }

    public void setGridNodeList(GridNode[] gridNodeList) {
        this.gridNodeList = gridNodeList;
    }

    public GridHub[] getGridHubList() {
        return gridHubList;
    }

    public void setGridHubList(GridHub[] gridHubList) {
        this.gridHubList = gridHubList;
    }

    @Override
    public String toString() {
        return String.format("{ theConfigMap=%s, gridNodeList=%s, gridHubList=%s }",
                theConfigMap, Arrays.toString(gridNodeList), Arrays.toString(gridHubList));
    }

}