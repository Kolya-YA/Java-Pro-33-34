package edu.telran.homework.strikeGame;

abstract class Player implements Kicker {
    private final String name;
    public String getName() { return name; }

    private final String color;
    public String getColor() { return color; }

    private int health = 100;
    public int getHealth() { return health; }
    public void looseHealth() { this.health -= 10; }

    private int strikeCounter = 0;
    public int getStrikeCounter() { return strikeCounter; }
    public void incrementStrikeCounter(){ this.strikeCounter++; }

    private int goodStrikeCounter = 0;
    public int getGoodStrikeCounter() { return goodStrikeCounter; }
    public void incrementGoodStrikeCounter() { this.goodStrikeCounter++; }

    private int goodStrikeInRow = 0;
    public int getGoodStrikeInRow() { return goodStrikeInRow; }
    public void incrementGoodStrikeInRow() { this.goodStrikeInRow++; }
    public void resetGoodStrikeInRow() { this.goodStrikeInRow = 0; }

    protected int currentSuperpower = 3;
    public int getCurrentSuperpower() { return currentSuperpower; }
    public void incrementSuperPow() {
        this.currentSuperpower++;
        this.superPowIncrementCounter++;
        this.resetGoodStrikeInRow();
    }
    public void decrementSuperPow() { this.currentSuperpower--; }

    protected int superpowersThreshold = 2;
    public int getSuperpowersThreshold() { return superpowersThreshold; }

    private int superPowIncrementCounter = 0;
    public int getSuperPowIncrementCounter() { return superPowIncrementCounter; }

    Player(String name,String color) {
        this.name = name;
        this.color = color;
    }
}
