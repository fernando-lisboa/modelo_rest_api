
package br.com.goin.filtrarteatro.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

	@SerializedName("getPlaysTheater")
	@Expose
	private GetPlays getPlaysTheater;

	public GetPlays getGetPlaysTheater() {
	return getPlaysTheater;
	}

	public void setGetPlaysTheater(GetPlays getPlaysTheater) {
	this.getPlaysTheater = getPlaysTheater;
	}

	
}


