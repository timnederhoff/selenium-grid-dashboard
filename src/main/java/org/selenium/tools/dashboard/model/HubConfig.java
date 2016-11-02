package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HubConfig {

    public HubConfig() {
    }

    private String role;
    private String port;
    private String servlets;
    private String host;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getServlets() {
        return servlets;
    }

    public void setServlets(String servlets) {
        this.servlets = servlets;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return String.format("{ role=%s, port=%s, servlets=%s, host=%s }",
                role, port, servlets, host);
    }
}