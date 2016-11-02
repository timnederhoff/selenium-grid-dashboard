package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Jvm {

    public Jvm() {
    }

    private String available_processors;
    private String free_memory;
    private String max_memory;

    public String getAvailable_processors() {
        return available_processors;
    }

    public void setAvailable_processors(String available_processors) {
        this.available_processors = available_processors;
    }

    public String getFree_memory() {
        return free_memory;
    }

    public void setFree_memory(String free_memory) {
        this.free_memory = free_memory;
    }

    public String getMax_memory() {
        return max_memory;
    }

    public void setMax_memory(String max_memory) {
        this.max_memory = max_memory;
    }

    @Override
    public String toString() {
        return String.format("{ available_processors=%s, free_memory=%s, max_memory=%s",
                available_processors, free_memory, max_memory);
    }

}
