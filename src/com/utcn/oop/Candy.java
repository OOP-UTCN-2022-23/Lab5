package com.utcn.oop;

public class Candy {
    private String name;
    private double price;
    private Discount discount;

    public Candy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        if (this.discount != null) {
            if (this.discount == Discount.CHRISTMAS) {
                this.price -= this.getPrice() * 0.25;
            }
            if (this.discount == Discount.EASTER) {
                this.price -= this.getPrice() * 0.2;
            }
            if (this.discount == Discount.NEARLY_EXPIRED) {
                this.price -= this.getPrice() * 0.5;
            }
        }
        return this.price;
    }
}
