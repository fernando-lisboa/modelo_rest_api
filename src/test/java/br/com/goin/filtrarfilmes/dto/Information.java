package br.com.goin.filtrarfilmes.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Information {

@SerializedName("duration")
@Expose
private Integer duration;
@SerializedName("releaseDate")
@Expose
private Integer releaseDate;
@SerializedName("coverImage")
@Expose
private String coverImage;
@SerializedName("parentalRating")
@Expose
private Object parentalRating;
@SerializedName("trailer")
@Expose
private Object trailer;
@SerializedName("production")
@Expose
private Object production;
@SerializedName("directors")
@Expose
private Object directors;
@SerializedName("musicComposition")
@Expose
private Object musicComposition;

public Integer getDuration() {
return duration;
}

public void setDuration(Integer duration) {
this.duration = duration;
}

public Integer getReleaseDate() {
return releaseDate;
}

public void setReleaseDate(Integer releaseDate) {
this.releaseDate = releaseDate;
}

public String getCoverImage() {
return coverImage;
}

public void setCoverImage(String coverImage) {
this.coverImage = coverImage;
}

public Object getParentalRating() {
return parentalRating;
}

public void setParentalRating(Object parentalRating) {
this.parentalRating = parentalRating;
}

public Object getTrailer() {
return trailer;
}

public void setTrailer(Object trailer) {
this.trailer = trailer;
}

public Object getProduction() {
return production;
}

public void setProduction(Object production) {
this.production = production;
}

public Object getDirectors() {
return directors;
}

public void setDirectors(Object directors) {
this.directors = directors;
}

public Object getMusicComposition() {
return musicComposition;
}

public void setMusicComposition(Object musicComposition) {
this.musicComposition = musicComposition;
}

}