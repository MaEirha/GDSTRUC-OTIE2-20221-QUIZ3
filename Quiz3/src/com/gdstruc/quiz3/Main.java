package com.gdstruc.quiz3;

import java.util.Random;

public class Main {
    /*
    Create a matchmaking algorithm for players.

    Mechanics:
DONE        1 - Every turn, x players will be enqueued for matchmaking (x = rand () 1 to 7). Pressing enter ends the turn.
DONE        2 - A game can be started when at least 5 players are in the queue.
DONE        3 - When a game starts, dequeue the first 5 players from the queue.
DONE        4 - The program terminates when 10 games have been successfully made.
    */

    /*
    * PLAN:
    *   - Make Player Class             DONE
    *   - Make Queue Class              DONE
    *   - make use of do while loops    DONE
    */

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

            for (int b = 0; b < 5; b++) {
                queue.dequeue();
                playerCount--;
            }
        }while (gameRounds < 10);
    }
}
