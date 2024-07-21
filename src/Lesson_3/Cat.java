package Lesson_3;

class Cat extends Animal {
    private boolean isHungry = true;

    public void eat(int foodAmount) {
        if (foodAmount >= 0) {
            System.out.println("Кот поел!");
            isHungry = false;
        }else {
            System.out.println("Недостаточно еды в миске для кота.");
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        }else {
            System.out.println("Кот не может пробежать такое расстояние");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
