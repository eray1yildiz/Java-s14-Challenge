package com.workintech.burger.model;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", 19.1, BreadRollType.DOUBLE_BURGER);
        super.setMeat("Double");
    }
    @Override
    public void addAddition(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }


}