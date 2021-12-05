package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (findByPassport(user.getPassport()) == null) {
            List<Account> accountList = new ArrayList<>();
            users.put(user, accountList);
        }
        System.out.println("User is already exist.");
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (findByRequisite(passport, account.getRequisite()) == null) {
            users.get(user).add(account);
        }
        System.out.println("Account is already exist.");
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        double src = findByRequisite(srcPassport, srcRequisite).getBalance();
        double dest = findByRequisite(destPassport, destRequisite).getBalance();
        if (src < amount
                || findByRequisite(srcPassport, srcRequisite) == null
                || findByRequisite(destPassport, destRequisite) == null) {
            return false;
        }
        findByRequisite(srcPassport, srcRequisite).setBalance(src - amount);
        findByRequisite(destPassport, destRequisite).setBalance(dest + amount);
        return true;
    }
}
