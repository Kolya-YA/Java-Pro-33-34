package edu.telran.homework.strikeGame;

public interface Kicker {
    default boolean takeKick() {
        return (Math.random() <= 0.4);
    }
}
