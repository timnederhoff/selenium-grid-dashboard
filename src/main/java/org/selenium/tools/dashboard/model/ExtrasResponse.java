package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtrasResponse {

    public ExtrasResponse() {
    }

    private int exitCode;
    private String[] out;
    private String[] error;
    private String[] command;

    public int getExitCode() {
        return exitCode;
    }

    public void setExitCode(int exitCode) {
        this.exitCode = exitCode;
    }

    public String[] getOut() {
        return out;
    }

    public void setOut(String[] out) {
        this.out = out;
    }

    public String[] getError() {
        return error;
    }

    public void setError(String[] error) {
        this.error = error;
    }

    public String[] getCommand() {
        return command;
    }

    public void setCommand(String[] command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "ExtrasResponse{" +
                "exit_code=" + exitCode +
                ", out=" + Arrays.toString(out) +
                ", error=" + Arrays.toString(error) +
                ", coommand=" + Arrays.toString(command) +
                '}';
    }
}
