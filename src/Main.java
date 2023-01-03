public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задача1");
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Установите версию для IOS по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для IOS по ссылке");
            }
        } else {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance = 60;
        if (deliveryDistance <= 20) {
            System.out.println( "Потребуется 1 день ");
        }
        else if (deliveryDistance >20 && deliveryDistance <= 60){
            System.out.println( "Потребуется 2 дня ");
        }
        else if (deliveryDistance >60 && deliveryDistance <= 100) {
            System.out.println( "Потребуется 3 дня ");
        }
        else {
            System.out.println( "Свыше 100 км доставки нет.");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int monthNumber = 8;
        switch (monthNumber) {
            case 1: System.out.println("Январь");
                break; case 2:
                System.out.println("Февраль");
                break; case 3:
                System.out.println("Март");
                break; case 4:
                System.out.println("Апрель");
                break; case 5:
                System.out.println("Май");
                break; case 6:
                System.out.println("Июнь");
                break; case 7:
                System.out.println("Июль");
                break; case 8:
                System.out.println("Август");
                break; case 9:
                System.out.println("Сентябрь");
                break; case 10:
                System.out.println("Октябрь");
                break; case 11:
                System.out.println("Ноябрь");
                break; case 12:
                System.out.println("Декабрь");
                break; default:
        }
    }
}