package com.company;

import java.util.Random;

/**
 * Created by eax on 16/02/16.
 */
public abstract class Dice {
    private static Integer roll(){
        return new Random().nextInt(6);
    }

    public static Integer move(){
        int move = 0;
        int count = 1;

        int rollOne = roll();
        int rollTwo = roll();

        move = rollOne + rollTwo;

        while(rollOne == rollTwo && count < 4){
            rollOne = roll();
            rollTwo = roll();
            count++;
        }

        if(count == 3){
            move = -1; // GO TO JAIL!
        }

        return move;
    }
}
