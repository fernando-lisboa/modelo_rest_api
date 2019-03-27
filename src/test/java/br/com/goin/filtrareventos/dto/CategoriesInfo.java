
package br.com.goin.filtrareventos.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoriesInfo {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("imageWhite")
    @Expose
    private String imageWhite;
    @SerializedName("imageIcon")
    @Expose
    private String imageIcon;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("bannerCategory")
    @Expose
    private String bannerCategory;
    @SerializedName("actionId")
    @Expose
    private String actionId;
    @SerializedName("categoryType")
    @Expose
    private String categoryType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageWhite() {
        return imageWhite;
    }

    public void setImageWhite(String imageWhite) {
        this.imageWhite = imageWhite;
    }

    public String getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(String imageIcon) {
        this.imageIcon = imageIcon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBannerCategory() {
        return bannerCategory;
    }

    public void setBannerCategory(String bannerCategory) {
        this.bannerCategory = bannerCategory;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

}

