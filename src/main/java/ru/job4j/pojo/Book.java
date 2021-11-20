package ru.job4j.pojo;

public class Book {

    private String name;
    private int pagesAmount;

    public Book(String name, int pagesAmount) {
        this.name = name;
        this.pagesAmount = pagesAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }
}

