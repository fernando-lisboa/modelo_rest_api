
package br.com.goin.filtrareventos.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @Override
	public String toString() {
		return "Data [searchFilter=" + searchFilter + "]";
	}

	@SerializedName("searchFilter")
    @Expose
    private SearchFilter searchFilter;

    public SearchFilter getSearchFilter() {
        return searchFilter;
    }

    public void setSearchFilter(SearchFilter searchFilter) {
        this.searchFilter = searchFilter;
    }

}
