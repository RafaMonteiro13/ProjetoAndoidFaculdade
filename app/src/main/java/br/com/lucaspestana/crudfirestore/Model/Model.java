package br.com.lucaspestana.crudfirestore.Model;

public class Model {
    String id, name, description, date;
    String lat, lng;

    public Model() {

    }

    public Model(String id, String name, String description, String date, String lat, String lng) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.lat = lat;
        this.lng = lng;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
