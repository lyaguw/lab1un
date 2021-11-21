package com.company;


public class MainApplication {

    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    public static void main(String[] args) throws Exception {

        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];

        //Создание полей с изначальным количеством продуктов
        int appleAm=0,cheeseAm=0,iceCreamAm=0;

        //Создание базовых объектов дочерних классов Food


        Apple apple=new Apple(null);
        IceCream iceCream=new IceCream(null);
        Cheese cheese=new Cheese();


        /*breakfast[0]=new IceCream("caramel");
        breakfast[1]=new Cheese();
        breakfast[2]=new Apple("Small");
        breakfast[3]=new IceCream("chocolate");*/




        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("IceCream")) {
                breakfast[itemsSoFar] = new IceCream(parts[1]);
            }
            itemsSoFar++;
        }


        //Подсчет количества каждого продукта
        for (int i = 0; i < 20; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(apple)) {
                    appleAm++;
                } else if (breakfast[i].equals(cheese)) {
                    cheeseAm++;
                } else if (breakfast[i].equals(iceCream)) {
                    iceCreamAm++;
                }
            } else break;
        }


        System.out.println("Amount of apples is " + appleAm + "\nAmount of cheese is " + cheeseAm + "\nAmount of ice is " + iceCreamAm + "");

        // Перебор всех элементов массива
        for (Food item: breakfast) {
            if (item != null)
                // Если элемент не null – употребить продукт
                item.consume();
            else
                // Если дошли до элемента null – значит достигли конца
                // списка продуктов, ведь 20 элементов в массиве было
                // выделено с запасом, и они могут быть не
                // использованы все
                break;
        }

        System.out.println("Good luck!");
    }

}
