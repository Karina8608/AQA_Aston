package Lesson_3;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Dog(), new Cat()};
        for (Animal animal: animals) {
            animal.run(300);
            animal.swim(5);
        }
        System.out.println("Всего животных: " + Animal.getCount());

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        //создаем миску с едой
        int foodInBowl = 10;

        //кормим котов
        cat1.eat(15);
        cat2.eat(8);

        //просим котов покушать из миски
        cat1.eat(foodInBowl);
        cat2.eat(foodInBowl);

        System.out.println("Первый кот голоден? " + cat1.isHungry());
        System.out.println("Второй кот голоден? " + cat1.isHungry());
    }
}

abstract class Animal {
    private static int count = 0;
    private final String name;

    public Animal() {
        count++;
        this.name = this.getClass().getSimpleName();
    }
    public void run(int distance) {

        System.out.println(name + "\nбежит на " + distance + "m.");
    }

    public void  swim(int distance) {

        System.out.println(name + "\nплавает на " + distance + "m.");
    }

    public static int getCount() {
        return count;
    }

}