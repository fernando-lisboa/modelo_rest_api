
package br.com.goin.filtrareventos.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Club {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("logoImage")
    @Expose
    private String logoImage;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("subcategories")
    @Expose
    private List<String> subcategories = null;
    @SerializedName("priceRating")
    @Expose
    private Integer priceRating;
    @SerializedName("categoriesInfo")
    @Expose
    private List<CategoriesInfo> categoriesInfo = null;
    @SerializedName("subcategoriesInfo")
    @Expose
    private List<SubcategoriesInfo> subcategoriesInfo = null;

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

    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<String> subcategories) {
        this.subcategories = subcategories;
    }

    public Integer getPriceRating() {
        return priceRating;
    }

    public void setPriceRating(Integer priceRating) {
        this.priceRating = priceRating;
    }

    public List<CategoriesInfo> getCategoriesInfo() {
        return categoriesInfo;
    }

    public void setCategoriesInfo(List<CategoriesInfo> categoriesInfo) {
        this.categoriesInfo = categoriesInfo;
    }

    public List<SubcategoriesInfo> getSubcategoriesInfo() {
        return subcategoriesInfo;
    }

    public void setSubcategoriesInfo(List<SubcategoriesInfo> subcategoriesInfo) {
        this.subcategoriesInfo = subcategoriesInfo;
    }

	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", logoImage=" + logoImage + ", address=" + address + ", state="
				+ state + ", city=" + city + ", subcategories=" + subcategories + ", priceRating=" + priceRating
				+ ", categoriesInfo=" + categoriesInfo + ", subcategoriesInfo=" + subcategoriesInfo + "]";
	}

}
