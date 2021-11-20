package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book book0 = new Book("Clean code", 25);
        Book book1 = new Book("Dirty code", 1024);
        Book book2 = new Book("White bird", 56);
        Book book3 = new Book("Pick", 2567);

        Book[] array = new Book[4];

        array[0] = book0;
        array[1] = book1;
        array[2] = book2;
        array[3] = book3;

        for (Book book : array) {
            System.out.println(book.getName() + ", " + book.getPagesAmount());
        }

        System.out.println(System.lineSeparator());

        Book temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        for (Book book : array) {
            System.out.println(book.getName() + ", " + book.getPagesAmount());
        }

        System.out.println(System.lineSeparator());

        for (Book book : array) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + ", " + book.getPagesAmount());
            }
        }
    }
}
