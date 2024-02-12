package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Ваш выбор: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                crateItem(scanner, tracker);
            } else if (select == 1) {
                findAllItems(tracker);
            } else if (select == 2) {
                replaceItem(scanner, tracker);
            }  else if (select == 3) {
                deleteItem(scanner, tracker);
            } else if (select == 4) {
                findItemById(scanner, tracker);
            } else if (select == 5) {
                findItemByName(scanner, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void findItemByName(Scanner scanner, Tracker tracker) {
        System.out.println("=== Вывод заявок по имени ===");
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
    }

    public static void findItemById(Scanner scanner, Tracker tracker) {
        System.out.println("=== Вывод заявки по id ===");
        System.out.print("Введите id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
    }

    public static void deleteItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Удаление заявки ===");
        System.out.print("Введите id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Item item = tracker.findById(id);
        tracker.delete(id);
        System.out.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
    }

    public static void replaceItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Замена заявки");
        System.out.println("Введите ID заявки");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите имя новой заявки");
        String name = scanner.nextLine();
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
    }

    public static void findAllItems(Tracker tracker) {
        System.out.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
    }

    public static void crateItem(Scanner scanner, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    private void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени",
                "Завершить программу"
        };
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}