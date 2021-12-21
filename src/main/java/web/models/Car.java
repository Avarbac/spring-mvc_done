package web.models;

public class Car {

    private String model;
    private int series;
    private String country;

    public Car(String model, int series, String country) {
        this.model = model;
        this.series = series;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }


    public void setSeries(int series) {
        this.series = series;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
