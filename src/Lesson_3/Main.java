package Lesson_3;

// Родительский класс Животное
class Animal {
    void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м.");
    }

    void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м.");
    }
}

// Класс Собака (наследуется от Животное)
class Dog extends Animal {
    private static int dogCount = 0;

    Dog() {
        dogCount++;
    }

    @Override
    void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать так далеко.");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть так далеко.");
        }
    }

    static int getDogCount() {
        return dogCount;
    }
}

// Класс Кот (наследуется от Животное)
class Cat extends Animal {
    private static int catCount = 0;

    Cat() {
        catCount++;
    }

    @Override
    void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать так далеко.");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    boolean eat(int foodAmount) {
        if (foodAmount >= 0) {
            boolean isHungry = false;
            return true;
        } else {
            return false;
        }
    }

    static int getCatCount() {
        return catCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog();
        dogBobik.run(150);
        dogBobik.swim(8);

        Cat catMurzik = new Cat();
        catMurzik.run(250);
        catMurzik.swim(5);

        System.out.println("Количество собак: " + Dog.getDogCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        // Создаем миску с едой
        int bowlFood = 10;

        // Создаем массив котов
        Cat[] cats = {new Cat(), new Cat(), new Cat()};

        // Кормим котов из миски
        for (Cat cat : cats) {
            if (cat.eat(bowlFood)) {
                System.out.println("Кот покушал.");
            } else {
                System.out.println("В миске недостаточно еды для кота.");
            }
        }
    }
}

