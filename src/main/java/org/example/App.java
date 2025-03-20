package org.example;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Создаем объект с помощью конструктора без параметров
        Tester tester1 = new Tester();
        System.out.println("Данные tester1:");
        tester1.showInfo();
        System.out.println();

        Tester tester2 = new Tester("Ivan", "Petrov");
        System.out.println("Данные tester2 (краткий вывод):");
        tester2.showInfo(true);
        System.out.println();

        Tester tester3 = new Tester("Anna", "Ivanova", 5, "Advanced", 1500.0);
        System.out.println("Данные tester3 (вывод с разделителем):");
        tester3.showInfo(" | ");
        System.out.println();

        System.out.println("Вызов статического метода:");
        Tester.staticMethodExample();
    }
}
