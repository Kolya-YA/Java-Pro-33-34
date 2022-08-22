package edu.telran.homework.three_animals_01;

public class Pig {

    private String name;
    private Boolean isFemale;
    private int age;
    private String breed;
    private String sound = "oink";

    Pig() {
        this("Anonymous", null, -1, "unknown");
    }

    Pig(String name, Boolean isFemale) {
        this(name, isFemale, -1, "unknown");
    }

    Pig(String name, Boolean isFemale, int age, String breed) {
        this.name = name;
        this.isFemale = isFemale;
        this.age = age;
        this.breed = breed;
    }

    void printInfo() {
//        String genderName = isFemale ? "sow" : "boar";
        String genderName = isFemale == null ? "pig" : isFemale ? "sow" : "boar";
        String printableAge = "" + (age < 0 ? "unknown" : age);
        String outputInfo = """
                
                The %s's name is %s
                Age: %s
                Breed: %s
                """.formatted(genderName, name, printableAge, breed).indent(4);

        System.out.print(outputInfo);
    }

    void say() {
        System.out.println((name + " says " + sound + "–" + sound + "!").indent(4));
    }
}
