package Lesson_2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван", "Инженер",
                "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1]  = new Employee("Петр Петров", "Сантехник",
                "alibaba@gmail.com", "3752964254112", 2000, 45);
        employees[2]  = new Employee("Александр Александров", "Менеджер",
                "olto@mail.ru", "895123211", 35000, 28);
        employees[3] = new Employee("Мария Марьянова", "Секретарь",
                "infocentot@yandex.ru", "8932145301", 25000, 33);
        employees[4] = new Employee("Владимир Владимиров", "Директор",
                "vlad@mail.ru", "375296400000", 50000, 48);

        // Вывод информации о всех сотрудниках
        for (Employee emp : employees) {
            emp.printInfo();
            System.out.println();
        }
    }
}

