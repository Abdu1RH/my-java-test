package assignment2;

import java.util.Random;

public class FlipCoin {

    /**
     * 
     * @return a random 0 or 1
     * Value must be random
     */
    public int flipCoin() {
        //TODO Delete line below, and implement this method
        int min = 0;
        int max = 1;

        int randomNumber = (int)Math.floor(Math.random()* (max - min + 1) + min);

        return randomNumber;

        //throw new UnsupportedOperationException();
    }
}
