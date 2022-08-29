package edu.telran.homework.strikeGame;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Tom", "Tom's blue");
        Player player2 = new Player("Jerry", "Jerry's brown");
        Game.start(player1, player2);
    }
}
