package br.com.goin.filtrarfilmes.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Highlighted {

@SerializedName("name")
@Expose
private String name;
@SerializedName("city")
@Expose
private String city;
@SerializedName("image")
@Expose
private String image;
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
private Object originInfos;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getImage() {
return image;
}

public void setImage(String image) {
this.image = image;
}

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

public Object getOriginInfos() {
return originInfos;
}

public void setOriginInfos(Object originInfos) {
this.originInfos = originInfos;
}

}