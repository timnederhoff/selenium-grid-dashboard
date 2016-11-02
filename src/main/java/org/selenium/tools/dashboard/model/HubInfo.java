package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HubInfo {

    public HubInfo() {
    }

    private String out;
    private String process;
    private String pid;
    private String user;

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "HubInfo{" +
                "out='" + out + '\'' +
                ", process='" + process + '\'' +
                ", pid='" + pid + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
