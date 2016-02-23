
package com.asos.getintotechnology.shuffleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Facet {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("facetValues")
    @Expose
    private List<FacetValue> facetValues = new ArrayList<FacetValue>();
    @SerializedName("displayStyle")
    @Expose
    private String displayStyle;
    @SerializedName("facetType")
    @Expose
    private String facetType;
    @SerializedName("hasSelectedValues")
    @Expose
    private Boolean hasSelectedValues;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The facetValues
     */
    public List<FacetValue> getFacetValues() {
        return facetValues;
    }

    /**
     * 
     * @param facetValues
     *     The facetValues
     */
    public void setFacetValues(List<FacetValue> facetValues) {
        this.facetValues = facetValues;
    }

    /**
     * 
     * @return
     *     The displayStyle
     */
    public String getDisplayStyle() {
        return displayStyle;
    }

    /**
     * 
     * @param displayStyle
     *     The displayStyle
     */
    public void setDisplayStyle(String displayStyle) {
        this.displayStyle = displayStyle;
    }

    /**
     * 
     * @return
     *     The facetType
     */
    public String getFacetType() {
        return facetType;
    }

    /**
     * 
     * @param facetType
     *     The facetType
     */
    public void setFacetType(String facetType) {
        this.facetType = facetType;
    }

    /**
     * 
     * @return
     *     The hasSelectedValues
     */
    public Boolean getHasSelectedValues() {
        return hasSelectedValues;
    }

    /**
     * 
     * @param hasSelectedValues
     *     The hasSelectedValues
     */
    public void setHasSelectedValues(Boolean hasSelectedValues) {
        this.hasSelectedValues = hasSelectedValues;
    }

}
