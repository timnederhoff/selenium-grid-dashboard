package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeConfiguration {

    public NodeConfiguration() {
    }

    private String proxy;
    private int maxSession;
    private int port;
    private boolean register;
    private int unregisterIfStillDownAfter;
    private int hubPort;
    private String hubHost;
    private int nodeStatusCheckTimeout;
    private int downPollingLimit;

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public int getMaxSession() {
        return maxSession;
    }

    public void setMaxSession(int maxSession) {
        this.maxSession = maxSession;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isRegister() {
        return register;
    }

    public void setRegister(boolean register) {
        this.register = register;
    }

    public int getUnregisterIfStillDownAfter() {
        return unregisterIfStillDownAfter;
    }

    public void setUnregisterIfStillDownAfter(int unregisterIfStillDownAfter) {
        this.unregisterIfStillDownAfter = unregisterIfStillDownAfter;
    }

    public int getHubPort() {
        return hubPort;
    }

    public void setHubPort(int hubPort) {
        this.hubPort = hubPort;
    }

    public String getHubHost() {
        return hubHost;
    }

    public void setHubHost(String hubHost) {
        this.hubHost = hubHost;
    }

    public int getNodeStatusCheckTimeout() {
        return nodeStatusCheckTimeout;
    }

    public void setNodeStatusCheckTimeout(int nodeStatusCheckTimeout) {
        this.nodeStatusCheckTimeout = nodeStatusCheckTimeout;
    }

    public int getDownPollingLimit() {
        return downPollingLimit;
    }

    public void setDownPollingLimit(int downPollingLimit) {
        this.downPollingLimit = downPollingLimit;
    }

    @Override
    public String toString() {
        return String.format("{ proxy=%s, maxSession=%d, port=%d, register=%b, unregisterIfStillDownAfter=%d, hubPort=%d, " +
                "hubHost=%s, nodeStatusCheckTimeout=%d, downPollingLimit=%d }",
                proxy, maxSession, port, register, unregisterIfStillDownAfter, hubPort, hubHost, nodeStatusCheckTimeout,
                downPollingLimit);
    }

}