package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ram {

    public Ram() {
    }

    private String total;
    private String total_swap;
    private String free;
    private String free_swap;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal_swap() {
        return total_swap;
    }

    public void setTotal_swap(String total_swap) {
        this.total_swap = total_swap;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    public String getFree_swap() {
        return free_swap;
    }

    public void setFree_swap(String free_swap) {
        this.free_swap = free_swap;
    }

    @Override
    public String toString() {
        return String.format("{ total=%s, total_swap=%s, free=%s, free_swap=%s",
                total, total_swap, free, free_swap);
    }

}
