package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SystemInfo extends ExtrasResponse {

    public SystemInfo(){

    }

    private Drive[] drives;
    private Processor processor;
    private String[] uptime;
    private Ram ram;
    private Jvm jvm;
    private String[] hostname;
    private String[] ip;
    private boolean loadedSuccessfully;
    private String errorMessage;

    public Drive[] getDrives() {
        return drives;
    }

    public void setDrives(Drive[] drives) {
        this.drives = drives;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public String[] getUptime() {
        return uptime;
    }

    public void setUptime(String[] uptime) {
        this.uptime = uptime;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Jvm getJvm() {
        return jvm;
    }

    public void setJvm(Jvm jvm) {
        this.jvm = jvm;
    }

    public String[] getHostname() {
        return hostname;
    }

    public void setHostname(String[] hostname) {
        this.hostname = hostname;
    }

    public String[] getIp() {
        return ip;
    }

    public void setIp(String[] ip) {
        this.ip = ip;
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
        return String.format("{ exit_code=%d, out=%s, error=%s, drives=%s, processor=%s, uptime=%s, ram=%s, jvm=%s, hostname=%s, ip=%s }",
                super.getExitCode(), Arrays.toString(super.getOut()), Arrays.toString(super.getError()), Arrays.toString(drives),
                processor, Arrays.toString(uptime), ram, jvm, Arrays.toString(hostname), Arrays.toString(ip));
    }

}
