package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrintNameSotrudnik("Заводчанин Великий");
        PrintProductName("Спички высококачественные");
        PovishenieZarplaty(50000, 2);
        System.out.println(calculateDiscountedPrice(100,5));
        System.out.println(sum(10,2));
        System.out.println(calculateProductionCapacity(10,2));
        String jsonData = formatToJson("Hello, world!");
        System.out.println("Формат JSON: " + jsonData);

        double result = power(2, 3);
        System.out.println("Степени: " + result);

        int randomNum = getRandomNumber(1, 100);
        System.out.println("Рандом: " + randomNum);

        int[] numbers = {10, 5, 8, 15, 3};
        int maxNumber = findMax(numbers);
        System.out.println("Максимальное число: " + maxNumber);
        }

    // Статические
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

    // Динамические
    // Метод для расчета стоимости заказа с учетом скидки
    public static double calculateDiscountedPrice(double originalPrice, double discountPercentage) {
        double discountAmount = originalPrice * (discountPercentage / 100.0);
        return originalPrice - discountAmount;
    }

    // Для суммирования количества штук в заказе
    public static int sum(int a, int b) {
        return a + b;
    }

    // Динамическая функция: Расчет производственной мощности по числу рабочих и рабочим часам
    public static double calculateProductionCapacity(int numberOfWorkers, int workingHoursPerDay) {
        // Предположим, что производственная мощность рассчитывается как количество рабочих * часы работы в день
        return numberOfWorkers * workingHoursPerDay;
    }

    //Чё-то ответвление
    // Функция, относящаяся к ответвлению от стандартной функции: Вывод строки в формате JSON
    public static String formatToJson(String data) {
        // Простейшая имитация форматирования в формат JSON
        return "{ \"data\": \"" + data + "\" }";
    }

    // Функция, относящаяся к ответвлению от стандартной функции: Возведение числа в степень
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Функция, относящаяся к ответвлению от стандартной функции: Генерация случайного числа в заданном диапазоне
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // Функция, относящаяся к ответвлению от стандартной функции: Поиск максимального элемента в массиве
    public static int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Низя пустой массив");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
