package edu.telran.homework.three_animals_01;

public class Main {
    public static void main(String[] args) {
        dogCreator();
        catCreator();
        pigCreator();
    }

    private static void dogCreator() {
        Dog firstDog = new Dog("Duke", false, 2, "brown");
        Dog secondDog = new Dog("Zoe", true);
        Dog thirdDog = new Dog();

        firstDog.printInfo();
        firstDog.say();

        secondDog.printInfo();
        secondDog.say();

        thirdDog.printInfo();
        thirdDog.say();
    }

    private static void catCreator() {
        Cat firstCat = new Cat("Oliver", false, 2, "grey");
        Cat secondCat = new Cat("Lucy", true);
        Cat thirdCat = new Cat();

        firstCat.printInfo();
        firstCat.say();

        secondCat.printInfo();
        secondCat.say();

        thirdCat.printInfo();
        thirdCat.say();
    }

    private static void pigCreator() {
        Pig firstPig = new Pig("Marshall", false, 3, "Angeln Saddleback");
        Pig secondPig = new Pig("Bonnie", true);
        Pig thirdPig = new Pig();

        firstPig.printInfo();
        firstPig.say();

        secondPig.printInfo();
        secondPig.say();

        thirdPig.printInfo();
        thirdPig.say();
    }
}
