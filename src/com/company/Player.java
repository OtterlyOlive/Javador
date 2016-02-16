package com.company;

/**
 * Created by eax on 16/02/16.
 */
public class Player {
    private String name;
    private int money;
    private Card[] deck;
    private Field[] properties;

    public Player(String name) {
        this.money = 500;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Card[] getDeck() {
        return deck;
    }

    public void setDeck(Card[] deck) {
        this.deck = deck;
    }
}
