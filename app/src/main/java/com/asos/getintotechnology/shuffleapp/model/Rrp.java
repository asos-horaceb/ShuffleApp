
package com.asos.getintotechnology.shuffleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rrp {

    @SerializedName("value")
    @Expose
    private Object value;
    @SerializedName("text")
    @Expose
    private String text;

    /**
     * @return The value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @param value The value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

}
