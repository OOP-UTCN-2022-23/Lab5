package com.utcn.oop;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Roxana", 40);

        Candy candy1 = new Candy("Kinder felie de lapte", 10);
        candy1.setDiscount(Discount.NEARLY_EXPIRED);
        candy1.setPrice(candy1.getDiscountedPrice());

        Candy candy2 = new Candy("Rafaello", 20);

        //create an order of max 2 candies -> we on a diet
        Order order = new Order(1, client, 2);
        order.setCandies(new Candy[order.getMaxCandiesOrder()]);
        order.printOrder();

        order.addCandy(candy1);
        order.addCandy(candy1);
        order.addCandy(candy1);
        order.removeCandy(candy1);
        order.addCandy(candy2);
        order.printOrder();
        System.out.println("How much I've spent on my order  = " + order.getTotalPrice());

        client.setBudgetForCandies(client.getBudgetForCandies() - order.getTotalPrice());
        System.out.println("How much money I have rn = " + client.getBudgetForCandies());
    }
}
