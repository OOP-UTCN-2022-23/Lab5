package com.utcn.oop;

public class Order {
    private Integer id;
    private Client client; // whose order is it ?
    private Candy[] candies; //all the candies that I buy
    // we will define a limit of candies that can be bought in an order
    private int maxCandiesOrder; // size for array of candies
    public int index;

    public Order(Integer id, Client client, int maxCandiesOrder) {
        this.id = id;
        this.client = client;
        this.maxCandiesOrder = maxCandiesOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Candy[] getCandies() {
        return candies;
    }

    public void setCandies(Candy[] candies) {
        this.candies = candies;
    }

    public int getMaxCandiesOrder() {
        return maxCandiesOrder;
    }

    public void setMaxCandiesOrder(int maxCandiesOrder) {
        this.maxCandiesOrder = maxCandiesOrder;
    }

    public void addCandy(Candy candy) {
        if (index < candies.length) {
            if (candy.getPrice() + getTotalPrice() <= client.getBudgetForCandies()) {
                this.candies[index++] = candy;
                System.out.println("One more candy added to the order: " + candy.getName());
            } else {
                System.out.println("Too many candies, not enough money =(");
            }
        } else {
            System.out.println("Too many candies for an order :( Mi want candiez");
        }
    }

    public void removeCandy(Candy candy) {
        for (int i = 0; i < index; i++) {
            if (this.candies[i].equals(candy)) {
                for (int j = i; j < index - 1; j++) {
                    this.candies[j] = this.candies[j + 1];
                }
                this.candies[index - 1] = null;
                index--;
                System.out.println(candy.getName() + " was removed from the order!");
            }
        }
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Candy candy : this.candies) {
            if (candy != null) {
                totalPrice += candy.getPrice();
            }
        }
        return totalPrice;
    }

    public void printOrder() {
        if (index == 0) {
            System.out.println("The order is in progress!");
        } else {
            System.out.println("The candies from order " + this.id + " for client " + client.getName() + " are:");
            for (Candy candy : this.candies) {
                if (candy != null) {
                    System.out.println(candy.getName());
                }
            }
        }
    }
}
