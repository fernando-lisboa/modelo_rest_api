package br.com.goin.filtrarfilmes.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

	@SerializedName("getPlaysMovie")
	@Expose
	private GetPlays getPlaysMovie;

	public GetPlays getPlaysMovie() {
	return getPlaysMovie;
	}

	public void getPlaysMovie(GetPlays getPlaysMovie) {
	this.getPlaysMovie = getPlaysMovie;
	}

	
}