package model;

public class Animal {
    private String species;
    private int age;

    //    Default Constructor
    public Animal() {
    }

    //    Constructor
    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public void eat() {
        System.out.println("The " + species + " is eating.");
    }

    public void sleep() {
        System.out.println("The " + species + " is sleeping.");
    }
//   Getter-setter

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }
}