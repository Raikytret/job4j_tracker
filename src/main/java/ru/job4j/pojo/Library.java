package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Pushkin", 100);
        Book second = new Book("Dumas", 200);
        Book third = new Book("Lermontov", 300);
        Book fourth = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getCount());

        }
        System.out.println("changing the first book to the fourth");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Printing only Clean code");
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}