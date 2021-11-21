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
        print(array);
        System.out.println(System.lineSeparator());
        swap(array, 0, 3);
        print(array);
        System.out.println(System.lineSeparator());
        findCleanCode(array);
    }

    public static void findCleanCode(Book[] array) {
        for (Book book : array) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + ", " + book.getPagesAmount());
            }
        }
    }

    public static void print(Book[] array) {
        for (Book book : array) {
            System.out.println(book.getName() + ", " + book.getPagesAmount());
        }
    }

    public static void swap(Book[] array, int a, int b) {
        Book temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
