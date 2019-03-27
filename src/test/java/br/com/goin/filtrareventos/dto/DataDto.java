
package br.com.goin.filtrareventos.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataDto {

    @Override
	public String toString() {
		return "DataDto [data=" + data + "]";
	}

	@SerializedName("data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

}
