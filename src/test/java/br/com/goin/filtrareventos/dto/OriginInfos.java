
package br.com.goin.filtrareventos.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OriginInfos {

    @SerializedName("buttonColor")
    @Expose
    private String buttonColor;
    @SerializedName("mainColor")
    @Expose
    private String mainColor;
    @SerializedName("textColor")
    @Expose
    private String textColor;
    @SerializedName("bigIcon")
    @Expose
    private String bigIcon;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("smallIconColored")
    @Expose
    private String smallIconColored;
    @SerializedName("smallIconWhite")
    @Expose
    private String smallIconWhite;

    public String getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(String buttonColor) {
        this.buttonColor = buttonColor;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public String getBigIcon() {
        return bigIcon;
    }

    public void setBigIcon(String bigIcon) {
        this.bigIcon = bigIcon;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSmallIconColored() {
        return smallIconColored;
    }

    public void setSmallIconColored(String smallIconColored) {
        this.smallIconColored = smallIconColored;
    }

    public String getSmallIconWhite() {
        return smallIconWhite;
    }

    public void setSmallIconWhite(String smallIconWhite) {
        this.smallIconWhite = smallIconWhite;
    }

}
