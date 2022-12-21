package day4Practiceproblem;

import java.util.Random;

public class SnakeandLadder {
    public static void main(String[] args) {
        int start_position = 0;
        int win_position = 100;

        System.out.println("Start position is : " + start_position);
        int loopcount=0;
        Dice();

        while (start_position < win_position) {

            //to check options
            int option = (int) (((Math.random() * 10) % 3) + 1);
            System.out.println("Option play is : " + option);

            if (option == 1) {
            System.out.println("Player cant move");
            } else if (option == 2) {
            System.out.println("Player got ladder");
            start_position = start_position + Dice();
            System.out.println("player moves " + Dice() + " steps forward");
            } else {
            System.out.println("Player got snake");
            start_position = start_position - Dice();
            System.out.println("player moves " + Dice() + " steps backward");
            }


            //if winpoint is more than 100

            if (start_position>win_position)
            {
                start_position=win_position-Dice();
            }


        }
        loopcount++;

        System.out.println("Player reached " +start_position+ " position");
        System.out.println("Number of times die roll:" +loopcount);
    }


    public static int Dice() {
        int min = 1;
        int max = 7;


        Random r = new Random();
        int Dice = r.nextInt(max);
        if (Dice == 0) {
            System.out.println("Invalid, please try again");
        } else {
            System.out.println("Dice is :" +Dice);

        }
        return Dice;
    }



}

