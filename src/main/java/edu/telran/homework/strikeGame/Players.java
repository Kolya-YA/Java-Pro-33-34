package edu.telran.homework.strikeGame;

class TriplePlayer extends Player {

    TriplePlayer(String name, String color) {
        super(name, color);
    }
}

class FiverPlayer extends Player {

    FiverPlayer(String name, String color) {
        super(name, color);
        super.currentSuperpower = 5;
        super.superpowersThreshold = 3;
    }
//    private int baseSuperpower = 5;
}

