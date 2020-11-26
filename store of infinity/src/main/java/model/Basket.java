package model;

import model.AbstractProduct;

import java.util.ArrayList;
class Basket {
    private int sumOfBasket ;
    private int numberOfOrder;
    ArrayList<AbstractProduct> arraylist = new ArrayList<>();

    public void setArraylist(ArrayList<AbstractProduct> arraylist) {
        this.arraylist = arraylist;
    }

    public ArrayList<AbstractProduct> getArraylist() {
        return arraylist;
    }
    public void setSumOfBasket(int sumOfBasket) {
        this.sumOfBasket = sumOfBasket;
    }
    public int getSumOfBasket() {
        return sumOfBasket;
    }
    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }
    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void addGood(AbstractProduct abstractGoogs){
        arraylist.add(abstractGoogs);
    }
}
