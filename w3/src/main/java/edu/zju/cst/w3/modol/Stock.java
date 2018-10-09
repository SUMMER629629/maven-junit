package edu.zju.cst.w3.modol;

import java.util.Date;

public class Stock {

    private String id;

    private String name;

    private double closingPrice;

    private Date date;

    public Stock() { }

    public Stock(String id, String name, double closingPrice, Date date) {
        this.id = id;
        this.name = name;
        this.closingPrice = closingPrice;
        this.date = date;
    }

//    public String getId() {
//        return id;
//    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    @Override
//    public String toString() {
//        return "Stock{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", closingPrice=" + closingPrice +
//                ", date=" + date +
//                '}';
//    }
}
