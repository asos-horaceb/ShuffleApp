
package com.asos.getintotechnology.shuffleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Diagnostics {

    @SerializedName("requestId")
    @Expose
    private String requestId;
    @SerializedName("processingTime")
    @Expose
    private Integer processingTime;
    @SerializedName("queryTime")
    @Expose
    private Integer queryTime;

    /**
     * 
     * @return
     *     The requestId
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 
     * @param requestId
     *     The requestId
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * 
     * @return
     *     The processingTime
     */
    public Integer getProcessingTime() {
        return processingTime;
    }

    /**
     * 
     * @param processingTime
     *     The processingTime
     */
    public void setProcessingTime(Integer processingTime) {
        this.processingTime = processingTime;
    }

    /**
     * 
     * @return
     *     The queryTime
     */
    public Integer getQueryTime() {
        return queryTime;
    }

    /**
     * 
     * @param queryTime
     *     The queryTime
     */
    public void setQueryTime(Integer queryTime) {
        this.queryTime = queryTime;
    }

}
