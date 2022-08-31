package edu.telran.homework.strikeGame;

class Misc {

    static Player whoStart(Player player1, Player player2) {
        return Math.random() < 0.5 ? player1 : player2;
    }

    static String playerStatusMsg(Player player) {
        return String.format("%s. Health: %s. Super power: %s\n",
                player.getName(),
                player.getHealth(),
                player.getBaseSuperpower());
    }

    static String endTurnMsg(Stage gameStage, Player curPlayer, Player nextPlayer) {
        StringBuilder endTurnStr = new StringBuilder("Stage color: %s\n".formatted(gameStage.getColor()));
        endTurnStr.append(Misc.playerStatusMsg(curPlayer));
        endTurnStr.append(Misc.playerStatusMsg(nextPlayer));

        return endTurnStr.toString();
    }

    static String endGameMsg(Player player1, Player player2) {
        StringBuilder endGameStr = new StringBuilder("\n———\n");
        endGameStr.append("The game is over.\n");
        endGameStr.append("Today's prize goes to ");
        endGameStr.append(player1.getHealth() == 0 ? player2.getName() : player1.getName());
        endGameStr.append("!\n———\n");
        endGameStr.append("Match stats\n———\n");
        endGameStr.append("Total strikes: ");
        endGameStr.append((player1.getStrikeCounter() + player2.getStrikeCounter()) + "\n");
        endGameStr.append("Good strikes:\n");
        endGameStr.append("by " + player1.getName()+ ": " + player1.getGoodStrikeCounter() + "\n");
        endGameStr.append("by " + player2.getName()+ ": " + player2.getGoodStrikeCounter() + "\n");
        endGameStr.append("Gained superpowers points:\n");
        endGameStr.append("by " + player1.getName()+ ": " + player1.getSuperPowIncrementCounter() + "\n");
        endGameStr.append("by " + player2.getName()+ ": " + player2.getSuperPowIncrementCounter() + "\n");

        return endGameStr.toString().indent(2);
    }
}
