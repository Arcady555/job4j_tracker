package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковского сервиса -
 * вывод Клиента-Пользователя(поиск в базе или ввод нового),
 * работа с его счётомами-аккаунтами(вывод через реквизиты
 * или открытие нового).
 * Осуществляются денежные переводы со счёта на счёт.
 * @author Arcady Parfenov
 * @version 1.1
 */

public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа HashMap.
     * Каждый элемент коллекции - это пара -Клиент(имя и паспорт) и
     * Список аккаунтов(их может быть несколько).
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового клиента в коллекцию, если там его ещё нет.
     * @param user Клиент(имя и данные паспорта)
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет аккаунт к клиенту. Есть проверка на наличие
     * такого клиента. И на то, что такого аккаунта у него ещё нет.
     * @param passport Данные паспорта клиента
     * @param account Аккаунт, который надо добавить клиенту
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            if (!users.get(user.get()).contains(account)) {
                users.get(user.get()).add(account);
            }
        }
    }

    /**
     * Метод находит клиента в списке по паспорту.
     * @param passport Данные паспорта клиента
     * @return Клиент
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод находит аккаунт по паспорту клоиента и реквизитам.
     * Есть проверка на наличие такого клиента в списке.
     * @param passport Данные паспорта клиента
     * @param requisite Реквизитв аккаунта(номер счета и т.п.)
     * @return account
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(s -> s.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Операция перевода денег с одного аккаунта на другой.
     * Имеет смысл, только если верно указаны паспорта и реквизиты
     * (имеются в базе) и баланс счёта отправителя не меньше суммы перевода.
     * @param srcPassport Данные паспорта клиента, отправляющего перевод.
     * @param srcRequisite Реквизиты аккаунта отправителя перевода.
     * @param destPassport Данные паспорта клиента, получающего перевод.
     * @param destRequisite Реквизиты аккаунта получателя перевода.
     * @param amount Сумма перевода.
     * @return true
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isEmpty() || dest.isEmpty() || src.get().getBalance() < amount) {
            return false;
        }
        src.get().setBalance(src.get().getBalance() - amount);
        dest.get().setBalance(dest.get().getBalance() + amount);
        return true;
    }
}
