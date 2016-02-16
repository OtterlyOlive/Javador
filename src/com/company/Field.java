package com.company;

/**
 * Created by eax on 16/02/16.
 */
public class Field {
    private String name;
    private int price;
    private Player owner = null;
    private Token[] buildings;

    public Field(){}

    public Field(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Token[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Token[] buildings) {
        this.buildings = buildings;
    }
}
