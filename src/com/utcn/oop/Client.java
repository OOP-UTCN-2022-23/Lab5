package com.utcn.oop;

public class Client {
    private String name;
    private double budgetForCandies;

    public Client(String name, double budgetForCandies) {
        this.name = name;
        this.budgetForCandies = budgetForCandies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudgetForCandies() {
        return budgetForCandies;
    }

    public void setBudgetForCandies(double budgetForCandies) {
        this.budgetForCandies = budgetForCandies;
    }
}
