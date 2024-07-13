package Lesson_2;

public class Park {
    // Внутренний класс для хранения информации об аттракционах
    private class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Park park = new Park();
        Attraction ferrisWheel = park.new Attraction("Колесо обозрения",
                "10:00 - 22:00", 5.0);
        Attraction rollerCoaster = park.new Attraction("Американские горки",
                "10:00 - 19:00", 10.0);
        Attraction inflatableSlides = park.new Attraction("Надувные горки",
                "11:00 - 20:00", 3.0);

        // Вывод информации об аттракционах
        System.out.println("Аттракцион: " + ferrisWheel.name);
        System.out.println("Время работы: " + ferrisWheel.workingHours);
        System.out.println("Стоимость: $" + ferrisWheel.cost);
        System.out.println();

        System.out.println("Американские горки: " + rollerCoaster.name);
        System.out.println("Время работы: " + rollerCoaster.workingHours);
        System.out.println("Стоимость: $" + rollerCoaster.cost);
        System.out.println();

        System.out.println("Надувные горки: " + inflatableSlides.name);
        System.out.println("Время работы: " + inflatableSlides.workingHours);
        System.out.println("Стоимость: $" + inflatableSlides.cost);
    }
}

