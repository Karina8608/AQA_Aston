package Lesson_3;

class Dog extends Animal {
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        }else {
            System.out.println("Собака не может пробежать такое расстояние");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            super.swim(distance);
        }else {
            System.out.println("Собака не может проплыть так далеко");
        }
    }
}
