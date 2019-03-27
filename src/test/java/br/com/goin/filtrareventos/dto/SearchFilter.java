
package br.com.goin.filtrareventos.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchFilter {

	@SerializedName("currentPage")
    @Expose
    private Integer currentPage;
    @SerializedName("totalPages")
    @Expose
    private Integer totalPages;
    @SerializedName("totalItems")
    @Expose
    private Integer totalItems;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    
    @SerializedName("clubs")
    @Expose
    private List<Club> clubs;
    
	@Override
	public String toString() {
		return "SearchFilter [currentPage=" + currentPage + ", totalPages=" + totalPages + ", totalItems=" + totalItems
				+ ", events=" + events + ", clubs=" + clubs + "]";
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Club> getClubs() {
		return clubs;
	}

	public void setClubs(List<Club> clubs) {
		this.clubs = clubs;
	}

	

    

}
