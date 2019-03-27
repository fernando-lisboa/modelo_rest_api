
package br.com.goin.filtrarteatro.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataTeatroDto {

    @SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

	@Override
	public String toString() {
		return "DataTeatroDto [data=" + data + "]";
	}


}
