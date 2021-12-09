package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает Пользователя-клиента банка.
 * @author Arcady Parfenov
 * @version 1.0
 */
public class User {
    /**
     * Данные паспорта клиента
     */
    private String passport;
    /**
     * Имя клиента
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод определяет равенство
     * объектов класса User.
     * @param o объект для сравнения
     * @return true
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
