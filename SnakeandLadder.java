package day4Practiceproblem;

import java.util.Random;

public class SnakeandLadder {

    static int player;
    static int player1;
    static int player2;
    static int player1position;
    static int start_position = 0;
    static int win_position = 100;



    public static void main(String[] args) {
        System.out.println("Start position is : " + start_position);
        PlayerChance();
    }
    public static void optioncheck(){


        int loopcount=0;

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
        WinnerCheck();

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
    public static void PlayerChance()
    {
        if(player==player1) {
            System.out.println("player1 turn");
            Dice();
            optioncheck();
        }
        else{
            System.out.println("player2 turn");
            Dice();
            optioncheck();
        }
    }
    public static void WinnerCheck()
    {
        if(player1position==win_position)
        {
            System.out.println("PLayer 1 won");
        }else {
            System.out.println("PLayer 2 won");
        }
    }
}

