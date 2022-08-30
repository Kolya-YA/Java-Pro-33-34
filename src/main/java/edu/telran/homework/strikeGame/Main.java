package edu.telran.homework.strikeGame;

public class Main {
    public static void main(String[] args) {
        TriplePlayer player1 = new TriplePlayer("Tom_3", "Tom's blue");
        FiverPlayer player2 = new FiverPlayer("Jerry_5", "Jerry's brown");
        Game.start(player1, player2);
    }
}
