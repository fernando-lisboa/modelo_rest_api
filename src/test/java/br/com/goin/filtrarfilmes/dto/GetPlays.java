package br.com.goin.filtrarfilmes.dto;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetPlays {

@SerializedName("highlighted")
@Expose
private List<Highlighted> highlighted = null;
@SerializedName("inTheathers")
@Expose
private List<InTheather> inTheathers = null;

public List<Highlighted> getHighlighted() {
return highlighted;
}

public void setHighlighted(List<Highlighted> highlighted) {
this.highlighted = highlighted;
}

public List<InTheather> getInTheathers() {
return inTheathers;
}

public void setInTheathers(List<InTheather> inTheathers) {
this.inTheathers = inTheathers;
}

}