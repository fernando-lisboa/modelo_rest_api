
package br.com.goin.filtrareventos.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("originHasDiscount")
    @Expose
    private Object originHasDiscount;
    @SerializedName("originCodes")
    @Expose
    private Object originCodes;
    @SerializedName("originInfos")
    @Expose
    private OriginInfos originInfos;
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
    private Object imageWidth;
    @SerializedName("imageHeight")
    @Expose
    private Object imageHeight;
    @SerializedName("imageAspect")
    @Expose
    private Object imageAspect;
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
    private List<SubcategoriesInfo> subcategoriesInfo = null;
    @SerializedName("categoriesInfo")
    @Expose
    private List<CategoriesInfo> categoriesInfo = null;
    @SerializedName("lowestPrice")
    @Expose
    private long lowestPrice;
    @SerializedName("highestPrice")
    @Expose
    private long highestPrice;
    @SerializedName("startDate")
    @Expose
    private Float startDate;
    @SerializedName("endDate")
    @Expose
    private Float endDate;
    @SerializedName("rating")
    @Expose
    private Integer rating;
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
    @SerializedName("originId")
    @Expose
    private Object originId;
    @SerializedName("originURL")
    @Expose
    private Object originURL;
    @SerializedName("originAction")
    @Expose
    private Object originAction;
    @SerializedName("sessions")
    @Expose
    private Object sessions;
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
    @SerializedName("categorized")
    @Expose
    private Object categorized;
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
    private Object confirmType;

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

    public Object getOriginCodes() {
        return originCodes;
    }

    public void setOriginCodes(Object originCodes) {
        this.originCodes = originCodes;
    }

    public OriginInfos getOriginInfos() {
        return originInfos;
    }

    public void setOriginInfos(OriginInfos originInfos) {
        this.originInfos = originInfos;
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

    public Object getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Object imageWidth) {
        this.imageWidth = imageWidth;
    }

    public Object getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Object imageHeight) {
        this.imageHeight = imageHeight;
    }

    public Object getImageAspect() {
        return imageAspect;
    }

    public void setImageAspect(Object imageAspect) {
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

    public List<SubcategoriesInfo> getSubcategoriesInfo() {
        return subcategoriesInfo;
    }

    public void setSubcategoriesInfo(List<SubcategoriesInfo> subcategoriesInfo) {
        this.subcategoriesInfo = subcategoriesInfo;
    }

    public List<CategoriesInfo> getCategoriesInfo() {
        return categoriesInfo;
    }

    public void setCategoriesInfo(List<CategoriesInfo> categoriesInfo) {
        this.categoriesInfo = categoriesInfo;
    }

    public long getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(long lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public long getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(long highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Float getStartDate() {
        return startDate;
    }

    public void setStartDate(Float startDate) {
        this.startDate = startDate;
    }

    public Float getEndDate() {
        return endDate;
    }

    public void setEndDate(Float endDate) {
        this.endDate = endDate;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
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

    public Object getOriginId() {
        return originId;
    }

    public void setOriginId(Object originId) {
        this.originId = originId;
    }

    public Object getOriginURL() {
        return originURL;
    }

    public void setOriginURL(Object originURL) {
        this.originURL = originURL;
    }

    public Object getOriginAction() {
        return originAction;
    }

    public void setOriginAction(Object originAction) {
        this.originAction = originAction;
    }

    public Object getSessions() {
        return sessions;
    }

    public void setSessions(Object sessions) {
        this.sessions = sessions;
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

    public Object getCategorized() {
        return categorized;
    }

    public void setCategorized(Object categorized) {
        this.categorized = categorized;
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

    public Object getConfirmType() {
        return confirmType;
    }

    public void setConfirmType(Object confirmType) {
        this.confirmType = confirmType;
    }

	@Override
	public String toString() {
		return "Event [id=" + id + ", originHasDiscount=" + originHasDiscount + ", originCodes=" + originCodes
				+ ", originInfos=" + originInfos + ", club=" + club + ", name=" + name + ", description=" + description
				+ ", image=" + image + ", imageWidth=" + imageWidth + ", imageHeight=" + imageHeight + ", imageAspect="
				+ imageAspect + ", interestedCount=" + interestedCount + ", isConfirmed=" + isConfirmed
				+ ", subcategories=" + subcategories + ", subcategoriesInfo=" + subcategoriesInfo + ", categoriesInfo="
				+ categoriesInfo + ", lowestPrice=" + lowestPrice + ", highestPrice=" + highestPrice + ", startDate="
				+ startDate + ", endDate=" + endDate + ", rating=" + rating + ", ratingCount=" + ratingCount
				+ ", state=" + state + ", city=" + city + ", categoryType=" + categoryType + ", categoryName="
				+ categoryName + ", originType=" + originType + ", originId=" + originId + ", originURL=" + originURL
				+ ", originAction=" + originAction + ", sessions=" + sessions + ", clubId=" + clubId + ", information="
				+ information + ", placeName=" + placeName + ", placeAddress=" + placeAddress + ", categorized="
				+ categorized + ", latitude=" + latitude + ", longitude=" + longitude + ", checkInCount=" + checkInCount
				+ ", allConfirmedCount=" + allConfirmedCount + ", confirmType=" + confirmType + "]";
	}

}
