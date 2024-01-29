package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String massage;

    public Error() {

    }

    public Error(boolean active, int status, String massage) {
        this.active = active;
        this.status = status;
        this.massage = massage;
    }

    public void printError() {
        System.out.println("Наличие ошибки - " + active);
        System.out.println("Номер ошибки - " + status);
        System.out.println("Сообщение об ошибке - " + massage);
    }

    public static void main(String[] args) {
        Error error43 = new Error(true, 43, "Error number 43");
        error43.printError();
        Error error12 = new Error(true, 12, "Error number 12");
        error12.printError();
        Error err = new Error();
        err.printError();
    }
}
