package edu.telran.homework.strikeGame;

public class Game {
    static void start(Player player1, Player player2) {
        Stage gameStage = new Stage("rainbow");
        Player curPlayer = Misc.whoStart(player1, player2);

        System.out.printf(
                "Game on. %s strikes first.\n\n", curPlayer.getName()
        );

        do {
            Player nextPlayer = curPlayer == player2 ? player1 : player2;
            curPlayer.incrementStrikeCounter();
            if (Math.random() <= 0.4) {
                curPlayer.incrementGoodStrikeCounter();
                if (nextPlayer.getBaseSuperpower() > 0) {
                    nextPlayer.decrementSuperPow();
                } else {
                    nextPlayer.looseHealth();
                    gameStage.setColor(curPlayer.getColor());
                }

                if (curPlayer.getGoodStrikeInRow() == curPlayer.getSuperpowersThreshold() - 1) {
                    curPlayer.incrementSuperPow();
                } else {
                    curPlayer.incrementGoodStrikeInRow();
                }
                System.out.printf("%s takes the target.\n", curPlayer.getName());
            } else {
                curPlayer.resetGoodStrikeInRow();
                System.out.printf("%s failed.\n", curPlayer.getName());
            }

            System.out.println(Misc.endTurnMsg(gameStage, curPlayer, nextPlayer));

            curPlayer = nextPlayer;
        } while (player1.getHealth() > 0 && player2.getHealth() > 0);

        System.out.println(Misc.endGameMsg(player1, player2));
    }
}