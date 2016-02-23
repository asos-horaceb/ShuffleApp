
package com.asos.getintotechnology.shuffleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("current")
    @Expose
    private Current current;
    @SerializedName("previous")
    @Expose
    private Previous previous;
    @SerializedName("rrp")
    @Expose
    private Rrp rrp;
    @SerializedName("isMarkedDown")
    @Expose
    private Boolean isMarkedDown;
    @SerializedName("isOutletPrice")
    @Expose
    private Boolean isOutletPrice;

    /**
     * @return The current
     */
    public Current getCurrent() {
        return current;
    }

    /**
     * @param current The current
     */
    public void setCurrent(Current current) {
        this.current = current;
    }

    /**
     * @return The previous
     */
    public Previous getPrevious() {
        return previous;
    }

    /**
     * @param previous The previous
     */
    public void setPrevious(Previous previous) {
        this.previous = previous;
    }

    /**
     * @return The rrp
     */
    public Rrp getRrp() {
        return rrp;
    }

    /**
     * @param rrp The rrp
     */
    public void setRrp(Rrp rrp) {
        this.rrp = rrp;
    }

    /**
     * @return The isMarkedDown
     */
    public Boolean getIsMarkedDown() {
        return isMarkedDown;
    }

    /**
     * @param isMarkedDown The isMarkedDown
     */
    public void setIsMarkedDown(Boolean isMarkedDown) {
        this.isMarkedDown = isMarkedDown;
    }

    /**
     * @return The isOutletPrice
     */
    public Boolean getIsOutletPrice() {
        return isOutletPrice;
    }

    /**
     * @param isOutletPrice The isOutletPrice
     */
    public void setIsOutletPrice(Boolean isOutletPrice) {
        this.isOutletPrice = isOutletPrice;
    }

}
