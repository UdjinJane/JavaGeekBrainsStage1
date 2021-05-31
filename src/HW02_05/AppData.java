package HW02_05;

import java.io.Serializable;
import java.util.Arrays;

public class AppData implements Serializable {

    private String[] headers;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.headers = header;
        this.data = data;
    }

    public String[] getHeaders() {
        return headers;
    }

    public int[][] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "headers=" + Arrays.toString(headers) +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
