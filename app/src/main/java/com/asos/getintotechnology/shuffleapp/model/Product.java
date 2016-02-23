
package com.asos.getintotechnology.shuffleapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Product {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("brandName")
    @Expose
    private String brandName;
    @SerializedName("colour")
    @Expose
    private String colour;
    @SerializedName("hasVariantColours")
    @Expose
    private Boolean hasVariantColours;
    @SerializedName("groupId")
    @Expose
    private Object groupId;
    @SerializedName("productCode")
    @Expose
    private Integer productCode;
    @SerializedName("hasVariantPrices")
    @Expose
    private Boolean hasVariantPrices;
    @SerializedName("productType")
    @Expose
    private String productType;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The price
     */
    public Price getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * @return The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * @param images The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * @return The brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * @param brandName The brandName
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return The colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour The colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return The hasVariantColours
     */
    public Boolean getHasVariantColours() {
        return hasVariantColours;
    }

    /**
     * @param hasVariantColours The hasVariantColours
     */
    public void setHasVariantColours(Boolean hasVariantColours) {
        this.hasVariantColours = hasVariantColours;
    }

    /**
     * @return The groupId
     */
    public Object getGroupId() {
        return groupId;
    }

    /**
     * @param groupId The groupId
     */
    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    /**
     * @return The productCode
     */
    public Integer getProductCode() {
        return productCode;
    }

    /**
     * @param productCode The productCode
     */
    public void setProductCode(Integer productCode) {
        this.productCode = productCode;
    }

    /**
     * @return The hasVariantPrices
     */
    public Boolean getHasVariantPrices() {
        return hasVariantPrices;
    }

    /**
     * @param hasVariantPrices The hasVariantPrices
     */
    public void setHasVariantPrices(Boolean hasVariantPrices) {
        this.hasVariantPrices = hasVariantPrices;
    }

    /**
     * @return The productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType The productType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

}
