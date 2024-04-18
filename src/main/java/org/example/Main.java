package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrintNameSotrudnik("Заводчанин Великий");
        PrintProductName("Спички высококачественные");
        PovishenieZarplaty(50000, 2);
        }

    public static void PrintNameSotrudnik(String name){
        System.out.println("Имя сотрудника: " + name);
    }

    public static void PrintProductName(String prname){
        System.out.println("Название продукта: " + prname);
    }

    public static void PovishenieZarplaty(double salary, double cooficent){
        double newSalary = salary + (salary * cooficent);
        System.out.println("Мы повысили вашу зарплату в " + cooficent + " раз. Ваша новая зарплата: " + newSalary);
    }

}
