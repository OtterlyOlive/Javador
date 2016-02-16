package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Player eax = new Player("Eax");
        Player thomas = new Player("Thomas");
        Player jonas = new Player("Jonas");
        Player bogi = new Player("Bogi");
        Player[] players = new Player[4];
        players[1] = eax;
        players[2] = thomas;
        players[3] = jonas;
        players[4] = bogi;
        Board board = setupBoard();
        Boolean run = true;
        ArrayList<Card> cards = new ArrayList();
        setupCards(cards);

        // MATADOR

        // Things:
        // Cards: Rules
        // Get money, loose money, get moved, go to jail, get out of jail free

        // Tokens (Car; Houses; Hotels)
        // Board (40 fields, different rules, HOOOOW)

        // Dice, roll 2, if equal, roll again

        // Game progress:
        // While loop until victory condition
        // For loop inside with each players turn.

        while(run){
            for(int i = 1; i <= 4; i++){
                // Roll

                // If land on empty ground, attempt to buy it if afford it

                // If land on opponents ground, pay money (OR LOOSE)

                // Otherwise, if we still have money left, lets try to buy a house for our ground with the most houses on it
                // Or if afforded, upgrade a hotel
            }
        }

    }

    public static Board setupBoard(){
        Board board = new Board();

        board.getBoard()[1] = new Field("START",                0);     // START! If passing this, get money
        board.getBoard()[2] = new Field("Rødovrevej",           60);
        board.getBoard()[3] = new Field("Prøv lykken",          0);     // Draw a card
        board.getBoard()[4] = new Field("Hvidovre",             60);
        board.getBoard()[5] = new Field("Øresund A/S",          200);
        board.getBoard()[7] = new Field("Roskildevej",          100);
        board.getBoard()[8] = new Field("Fængsel",              0);
        board.getBoard()[9] = new Field("Nygade",               320);
        board.getBoard()[10] = new Field("Frederiksborgsgade",  350);
        board.getBoard()[11] = new Field("De sættes i fængsel", 0);
        board.getBoard()[12] = new Field("Extraordinær skat",   -400);
        board.getBoard()[13] = new Field("Rådhuspladsen",       400);

        return board;
    }

    public static void setupCards(ArrayList<Card> cards){
        cards.add(new Card(
           "Draw two"
        ));
    }

}
