package day4Practiceproblem;

import java.util.Random;

public class SnakeandLadder {
    public static void main(String[] args) {
        int start_position = 0;
        System.out.println("Start position is : " +start_position);
        Dice();

    }
    public static int Dice() {
        int min = 1;
        int max = 7;

        Random r = new Random();
        int Dice = r.nextInt(max);
        if (Dice == 0) {
            System.out.println("Invalid, please try again");
        } else {
            System.out.println(Dice);
        }
        return Dice;
    }

}