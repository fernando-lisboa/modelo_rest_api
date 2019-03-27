
package br.com.goin.filtrarteatro.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Highlighted {

	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("image")
	@Expose
	private String image;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("city")
	@Expose
	private String city;

	public String getId() {
	return id;
	}

	public void setId(String id) {
	this.id = id;
	}

	public String getImage() {
	return image;
	}

	public void setImage(String image) {
	this.image = image;
	}

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

	@Override
	public String toString() {
		return "Highlighted [id=" + id + ", image=" + image + ", name=" + name + ", city=" + city + "]";
	}

}
