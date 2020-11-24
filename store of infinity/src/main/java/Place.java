public class Place {


    //    поля, id, страна, регион, город и расстояние в километрах
    private int itemPlace;
    private String country;
    private String region;
    private String city;
    private int distance;

    public void Place(int itemPlace, String country, String region, String city, int distance) {
        this.itemPlace = itemPlace;
        this.country = country;
        this.region = region;
        this.city = city;
        this.distance = distance;
    }

    public int getItemPlace() {
        return itemPlace;
    }

    public void setItemPlace(int itemPlace) {
        this.itemPlace = itemPlace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


}
