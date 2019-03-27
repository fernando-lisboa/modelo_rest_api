
package br.com.goin.filtrarteatro.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InTheather {

    @Override
	public String toString() {
		return "InTheather [id=" + id + ", originHasDiscount=" + originHasDiscount + ", club=" + club + ", name=" + name
				+ ", description=" + description + ", image=" + image + ", imageWidth=" + imageWidth + ", imageHeight="
				+ imageHeight + ", imageAspect=" + imageAspect + ", interestedCount=" + interestedCount
				+ ", isConfirmed=" + isConfirmed + ", subcategories=" + subcategories + ", subcategoriesInfo="
				+ subcategoriesInfo + ", categoriesInfo=" + categoriesInfo + ", lowestPrice=" + lowestPrice
				+ ", highestPrice=" + highestPrice + ", startDate=" + startDate + ", endDate=" + endDate + ", rating="
				+ rating + ", ratingCount=" + ratingCount + ", state=" + state + ", city=" + city + ", categoryType="
				+ categoryType + ", categoryName=" + categoryName + ", originType=" + originType + ", originAction="
				+ originAction + ", originURL=" + originURL + ", originId=" + originId + ", clubId=" + clubId
				+ ", information=" + information + ", placeName=" + placeName + ", placeAddress=" + placeAddress
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", checkInCount=" + checkInCount
				+ ", allConfirmedCount=" + allConfirmedCount + ", confirmType=" + confirmType + ", sessions=" + sessions
				+ ", categorized=" + categorized + "]";
	}

	@SerializedName("id")
    @Expose
    private String id;
    @SerializedName("originHasDiscount")
    @Expose
    private Object originHasDiscount;
    @SerializedName("club")
    @Expose
    private Object club;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("imageWidth")
    @Expose
    private String imageWidth;
    @SerializedName("imageHeight")
    @Expose
    private String imageHeight;
    @SerializedName("imageAspect")
    @Expose
    private String imageAspect;
    @SerializedName("interestedCount")
    @Expose
    private Object interestedCount;
    @SerializedName("isConfirmed")
    @Expose
    private Object isConfirmed;
    @SerializedName("subcategories")
    @Expose
    private List<String> subcategories = null;
    @SerializedName("subcategoriesInfo")
    @Expose
    private List<Object> subcategoriesInfo = null;
    @SerializedName("categoriesInfo")
    @Expose
    private List<CategoriesInfo> categoriesInfo = null;
    @SerializedName("lowestPrice")
    @Expose
    private Integer lowestPrice;
    @SerializedName("highestPrice")
    @Expose
    private Integer highestPrice;
    @SerializedName("startDate")
    @Expose
    private Integer startDate;
    @SerializedName("endDate")
    @Expose
    private Integer endDate;
    @SerializedName("rating")
    @Expose
    private Object rating;
    @SerializedName("ratingCount")
    @Expose
    private Object ratingCount;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("categoryType")
    @Expose
    private Object categoryType;
    @SerializedName("CategoryName")
    @Expose
    private Object categoryName;
    @SerializedName("originType")
    @Expose
    private String originType;
    @SerializedName("originAction")
    @Expose
    private String originAction;
    @SerializedName("originURL")
    @Expose
    private String originURL;
    @SerializedName("originId")
    @Expose
    private Object originId;
    @SerializedName("clubId")
    @Expose
    private Object clubId;
    @SerializedName("information")
    @Expose
    private Object information;
    @SerializedName("placeName")
    @Expose
    private String placeName;
    @SerializedName("placeAddress")
    @Expose
    private String placeAddress;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("checkInCount")
    @Expose
    private Object checkInCount;
    @SerializedName("allConfirmedCount")
    @Expose
    private Object allConfirmedCount;
    @SerializedName("confirmType")
    @Expose
    private String confirmType;
    @SerializedName("sessions")
    @Expose
    private List<String> sessions = null;
    @SerializedName("categorized")
    @Expose
    private Boolean categorized;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getOriginHasDiscount() {
        return originHasDiscount;
    }

    public void setOriginHasDiscount(Object originHasDiscount) {
        this.originHasDiscount = originHasDiscount;
    }

    public Object getClub() {
        return club;
    }

    public void setClub(Object club) {
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(String imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(String imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getImageAspect() {
        return imageAspect;
    }

    public void setImageAspect(String imageAspect) {
        this.imageAspect = imageAspect;
    }

    public Object getInterestedCount() {
        return interestedCount;
    }

    public void setInterestedCount(Object interestedCount) {
        this.interestedCount = interestedCount;
    }

    public Object getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(Object isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public List<String> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(List<String> subcategories) {
        this.subcategories = subcategories;
    }

    public List<Object> getSubcategoriesInfo() {
        return subcategoriesInfo;
    }

    public void setSubcategoriesInfo(List<Object> subcategoriesInfo) {
        this.subcategoriesInfo = subcategoriesInfo;
    }

    public List<CategoriesInfo> getCategoriesInfo() {
        return categoriesInfo;
    }

    public void setCategoriesInfo(List<CategoriesInfo> categoriesInfo) {
        this.categoriesInfo = categoriesInfo;
    }

    public Integer getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Integer lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public Integer getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Integer highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Object getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Object ratingCount) {
        this.ratingCount = ratingCount;
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

    public Object getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Object categoryType) {
        this.categoryType = categoryType;
    }

    public Object getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Object categoryName) {
        this.categoryName = categoryName;
    }

    public String getOriginType() {
        return originType;
    }

    public void setOriginType(String originType) {
        this.originType = originType;
    }

    public String getOriginAction() {
        return originAction;
    }

    public void setOriginAction(String originAction) {
        this.originAction = originAction;
    }

    public String getOriginURL() {
        return originURL;
    }

    public void setOriginURL(String originURL) {
        this.originURL = originURL;
    }

    public Object getOriginId() {
        return originId;
    }

    public void setOriginId(Object originId) {
        this.originId = originId;
    }

    public Object getClubId() {
        return clubId;
    }

    public void setClubId(Object clubId) {
        this.clubId = clubId;
    }

    public Object getInformation() {
        return information;
    }

    public void setInformation(Object information) {
        this.information = information;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        this.placeAddress = placeAddress;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Object getCheckInCount() {
        return checkInCount;
    }

    public void setCheckInCount(Object checkInCount) {
        this.checkInCount = checkInCount;
    }

    public Object getAllConfirmedCount() {
        return allConfirmedCount;
    }

    public void setAllConfirmedCount(Object allConfirmedCount) {
        this.allConfirmedCount = allConfirmedCount;
    }

    public String getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(String confirmType) {
        this.confirmType = confirmType;
    }

    public List<String> getSessions() {
        return sessions;
    }

    public void setSessions(List<String> sessions) {
        this.sessions = sessions;
    }

    public Boolean getCategorized() {
        return categorized;
    }

    public void setCategorized(Boolean categorized) {
        this.categorized = categorized;
    }


}
