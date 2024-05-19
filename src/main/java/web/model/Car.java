package web.model;

public class Car {
    private int id;
    private String models;
    private int series;

    public Car(int id, String models, int series) {
        this.id = id;
        this.models = models;
        this.series = series;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return models;
    }

    public void setModel(String models) {
        this.models = models;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
