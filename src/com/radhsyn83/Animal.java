package com.radhsyn83;

public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;

    public Animal(boolean vegetarian, String food, int legs){
        this.vegetarian=vegetarian;
        this.eats=food;
        this.noOfLegs=legs;
    }
    public boolean isiVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
}