
package com.asos.getintotechnology.shuffleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SearchPassMeta {

    @SerializedName("isPartial")
    @Expose
    private Boolean isPartial;
    @SerializedName("isSpellcheck")
    @Expose
    private Boolean isSpellcheck;
    @SerializedName("searchPass")
    @Expose
    private List<Object> searchPass = new ArrayList<Object>();
    @SerializedName("alternateSearchTerms")
    @Expose
    private List<Object> alternateSearchTerms = new ArrayList<Object>();

    /**
     * @return The isPartial
     */
    public Boolean getIsPartial() {
        return isPartial;
    }

    /**
     * @param isPartial The isPartial
     */
    public void setIsPartial(Boolean isPartial) {
        this.isPartial = isPartial;
    }

    /**
     * @return The isSpellcheck
     */
    public Boolean getIsSpellcheck() {
        return isSpellcheck;
    }

    /**
     * @param isSpellcheck The isSpellcheck
     */
    public void setIsSpellcheck(Boolean isSpellcheck) {
        this.isSpellcheck = isSpellcheck;
    }

    /**
     * @return The searchPass
     */
    public List<Object> getSearchPass() {
        return searchPass;
    }

    /**
     * @param searchPass The searchPass
     */
    public void setSearchPass(List<Object> searchPass) {
        this.searchPass = searchPass;
    }

    /**
     * @return The alternateSearchTerms
     */
    public List<Object> getAlternateSearchTerms() {
        return alternateSearchTerms;
    }

    /**
     * @param alternateSearchTerms The alternateSearchTerms
     */
    public void setAlternateSearchTerms(List<Object> alternateSearchTerms) {
        this.alternateSearchTerms = alternateSearchTerms;
    }

}
