package org.example;

public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    String englishLevel;
    double salary;

    public Tester() {
        this("Arseny", "Karpovic");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "None", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Experience: " + expirienceInYears + ", English Level: " + englishLevel + ", Salary: " + salary);
    }

    public void showInfo(boolean shortVersion) {
        if (shortVersion) {
            System.out.println(name + " " + surname);
        }
        else
        {
            showInfo();
        }
    }

    public void showInfo(String delimiter) {
        System.out.println(name + delimiter + surname + delimiter + expirienceInYears + delimiter + englishLevel + delimiter + salary);
    }

    public static void staticMethodExample() {
        System.out.println("Это выведено через статик метод");
    }
}
