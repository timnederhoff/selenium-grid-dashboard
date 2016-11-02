package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GridStatus extends ExtrasResponse{

    public GridStatus() {
    }

    private boolean hub_running;
    private boolean node_running;
    private HubInfo hub_info;
    private NodeInfo node_info;
    private String[] sessions;
    private int node_sessions_limit;
    private boolean loadedSuccessfully;
    private String errorMessage;

    public boolean isHub_running() {
        return hub_running;
    }

    public void setHub_running(boolean hub_running) {
        this.hub_running = hub_running;
    }

    public boolean isNode_running() {
        return node_running;
    }

    public void setNode_running(boolean node_running) {
        this.node_running = node_running;
    }

    public HubInfo getHub_info() {
        return hub_info;
    }

    public void setHub_info(HubInfo hub_info) {
        this.hub_info = hub_info;
    }

    public NodeInfo getNode_info() {
        return node_info;
    }

    public void setNode_info(NodeInfo node_info) {
        this.node_info = node_info;
    }

    public String[] getSessions() {
        return sessions;
    }

    public void setSessions(String[] sessions) {
        this.sessions = sessions;
    }

    public int getNode_sessions_limit() {
        return node_sessions_limit;
    }

    public void setNode_sessions_limit(int node_sessions_limit) {
        this.node_sessions_limit = node_sessions_limit;
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
        return String.format(" { exit_code=%d, out=%s, error=%s, hub_running=%b, node_running=%b, hub_info=%s, node_info=%s, " +
                "sessions=%s, node_sessions_limit=%d }",
                super.getExitCode(), Arrays.toString(super.getOut()), Arrays.toString(super.getError()), hub_running,
                node_running, hub_info, node_info, Arrays.toString(sessions), node_sessions_limit);
    }
}
