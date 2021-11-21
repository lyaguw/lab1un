package com.company;

public class IceCream extends Food {

    //Внутреннее поле привкус
    private  String sirup;

    // Вызвать конструктор предка, передав ему имя класса
    public IceCream(String sirup) {
        super("Ice");
        this.sirup = sirup;

    }

    // Переопределить способ употребления жевательной резинки
    public void consume() {
        System.out.println(this + " was eaten");
    }

    //Геттер и Сеттер для доступа к полю
    public String getSirup() {
        return sirup;
    }
    public void setSirup(String flavour) {
        this.sirup = sirup;
    }


    //Переопределенный метод toString возвращает вкус и калории продукта
    @Override
    public String toString() {
        return super.toString() + " with taste '" + sirup.toUpperCase() + "',"+"calories: "+calculateCalories()+" -";
    }

    //Переопределенный метод расчета калорий в зависимости значений параметров

    @Override
    public double calculateCalories() {
        double calories=0.0;
        if (sirup.equals("caramel")){
            calories=228.8;
        } else if (sirup.equals("chocolate"))
            calories=322.2;
        return calories;
    }
}
