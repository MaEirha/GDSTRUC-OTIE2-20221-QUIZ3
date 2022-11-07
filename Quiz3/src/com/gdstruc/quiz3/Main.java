package com.gdstruc.quiz3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        PlayerQueue queue = new PlayerQueue(10);

        int gameRounds = 0;
        int xPlayers = 0;
        int playerCount = 0;

        do {
            do {
                xPlayers = random.nextInt(7 - 1) + 1;

                for (int i = 0; i < xPlayers; i++) {
                    Player player = new Player();
                    queue.enqueue(player);
                    playerCount++;
                }

            } while (playerCount < 6);

            gameRounds++;

            System.out.println("\n===== ROUND " + gameRounds + " =====");
            System.out.println("Player Queue:");
            queue.printQueue();

            System.out.println("\n=================================================================");
            System.out.println("P R E S S  [ E N T E R ]  T O  E N D  R O U N D");

            Scanner enter = new Scanner(System.in);
            enter.nextLine();

            for (int b = 0; b < 5; b++) {
                queue.dequeue();
                playerCount--;
            }
        }while (gameRounds < 10);
    }
}
