package edu.telran.homework.strikeGame;

public class Player {
    private final String name;
    private final String color;

    private int health = 100;
    private int strikeCounter = 0;
    private int goodStrikeCounter = 0;
    private int goodStrikeInRow = 0;
    private int superPow = 3;
    private int superPowIncrementCounter = 0;

    public Player(String name,String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getHealth() {
        return health;
    }

    public void looseHealth(int lostHealth) {
        this.health -= lostHealth;
    }

    public int getStrikeCounter() {
        return strikeCounter;
    }
    public void incrementStrikeCounter() {
        this.strikeCounter++;
    }

    public int getGoodStrikeCounter() {
        return goodStrikeCounter;
    }
    public void incrementGoodStrikeCounter() {
        this.goodStrikeCounter++;
    }

    public int getGoodStrikeInRow() {
        return goodStrikeInRow;
    }

    public void incrementGoodStrikeInRow() {
        this.goodStrikeInRow++;
    }

    public void resetGoodStrikeInRow() {
        this.goodStrikeInRow = 0;
    }

    public int getSuperPow() {
        return superPow;
    }

    public void decrementSuperPow() {
        this.superPow--;
    }

    public void incrementSuperPow() {
        this.superPow++;
        this.superPowIncrementCounter++;
    }

    public int getSuperPowIncrementCounter() {
        return superPowIncrementCounter;
    }
}
