package ru.job4j.tracker.oop;

public class Error {

    private boolean active;
    private int status;
    private String massage;

    public Error() {
        active = false;
        status = 2;
        massage = "У Вас ошибка";
    }

    public Error(boolean active, int status, String massage) {
        this.active = active;
        this.status = status;
        this.massage = massage;
    }

    public void printError() {
        System.out.println("Состояние: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение об ошибке: " + massage);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printError();
        Error errors = new Error(true, 41, "У Вас ошибка в коде");
        errors.printError();
    }

}
