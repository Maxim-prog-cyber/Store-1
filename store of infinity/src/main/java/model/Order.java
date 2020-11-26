package model;

public class Order {
    //    три поля: id, сумма, где находится товар
    private int id;
    private int itemPrice;
    private Place place;

    public void Order(int id, int itemPrice, Place place) {
        this.id = id;
        this.itemPrice = itemPrice;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
