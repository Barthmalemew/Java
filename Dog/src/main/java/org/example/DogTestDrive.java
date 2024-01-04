package org.example;

public class DogTestDrive{
    public static void main(String[] args) {

        Dog d = new Dog();
        d.size = 40;
        d.breed = "tearier";
        d.name = "Shiloh";
        d.bark();
    }
}

class Dog
{
    int size;
    String breed;
    String name;

    void bark()
    {
        System.out.println("Ruff! Ruff!");
        System.out.printf("%d %s %s", size, breed, name);
    }
}