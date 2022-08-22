package edu.telran.homework.three_animals_01;

public class Dog {

    private String name;
    private Boolean isFemale;
    private int age;
    private String color;
    private String sound = "woof";

    Dog() {
        this("Anonymous", null, -1, "unknown");
    }

    Dog(String name, Boolean isFemale) {
        this(name, isFemale, -1, "unknown");
    }

    Dog(String name, Boolean isFemale, int age, String color) {
        this.name = name;
        this.isFemale = isFemale;
        this.age = age;
        this.color = color;
    }

    void printInfo() {
        String gender = isFemale == null ? "unknown" : isFemale ? "female" : "male";
        String printableAge = "" + (age < 0 ? "unknown" : age);
        String outputInfo = """
                
                The dog's name is %s
                Gender: %s
                Age: %s
                Color: %s
                """.formatted(name, gender, printableAge, color).indent(4);

        System.out.print(outputInfo);
    }

    void say() {
        System.out.println((name + " says " + sound + "–" + sound + "!").indent(4));
    }
}
