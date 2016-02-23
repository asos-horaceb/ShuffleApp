
package com.asos.getintotechnology.shuffleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SearchResults {

    @SerializedName("searchTerm")
    @Expose
    private String searchTerm;
    @SerializedName("itemCount")
    @Expose
    private Integer itemCount;
    @SerializedName("redirectUrl")
    @Expose
    private String redirectUrl;
    @SerializedName("products")
    @Expose
    private List<Product> products = new ArrayList<Product>();
    @SerializedName("facets")
    @Expose
    private List<Facet> facets = new ArrayList<Facet>();
    @SerializedName("diagnostics")
    @Expose
    private Diagnostics diagnostics;
    @SerializedName("searchPasses")
    @Expose
    private List<Object> searchPasses = new ArrayList<Object>();
    @SerializedName("alternateSearchTerms")
    @Expose
    private List<Object> alternateSearchTerms = new ArrayList<Object>();
    @SerializedName("searchPassMeta")
    @Expose
    private SearchPassMeta searchPassMeta;

    /**
     * 
     * @return
     *     The searchTerm
     */
    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * 
     * @param searchTerm
     *     The searchTerm
     */
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    /**
     * 
     * @return
     *     The itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * 
     * @param itemCount
     *     The itemCount
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * 
     * @return
     *     The redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * 
     * @param redirectUrl
     *     The redirectUrl
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * 
     * @return
     *     The products
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * 
     * @param products
     *     The products
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * 
     * @return
     *     The facets
     */
    public List<Facet> getFacets() {
        return facets;
    }

    /**
     * 
     * @param facets
     *     The facets
     */
    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    /**
     * 
     * @return
     *     The diagnostics
     */
    public Diagnostics getDiagnostics() {
        return diagnostics;
    }

    /**
     * 
     * @param diagnostics
     *     The diagnostics
     */
    public void setDiagnostics(Diagnostics diagnostics) {
        this.diagnostics = diagnostics;
    }

    /**
     * 
     * @return
     *     The searchPasses
     */
    public List<Object> getSearchPasses() {
        return searchPasses;
    }

    /**
     * 
     * @param searchPasses
     *     The searchPasses
     */
    public void setSearchPasses(List<Object> searchPasses) {
        this.searchPasses = searchPasses;
    }

    /**
     * 
     * @return
     *     The alternateSearchTerms
     */
    public List<Object> getAlternateSearchTerms() {
        return alternateSearchTerms;
    }

    /**
     * 
     * @param alternateSearchTerms
     *     The alternateSearchTerms
     */
    public void setAlternateSearchTerms(List<Object> alternateSearchTerms) {
        this.alternateSearchTerms = alternateSearchTerms;
    }

    /**
     * 
     * @return
     *     The searchPassMeta
     */
    public SearchPassMeta getSearchPassMeta() {
        return searchPassMeta;
    }

    /**
     * 
     * @param searchPassMeta
     *     The searchPassMeta
     */
    public void setSearchPassMeta(SearchPassMeta searchPassMeta) {
        this.searchPassMeta = searchPassMeta;
    }

}
