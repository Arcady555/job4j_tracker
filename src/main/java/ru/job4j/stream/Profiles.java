package ru.job4j.stream;

import java.util.List;

public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        return profiles
                .stream()
                .map(Profile::getAddress)
                .toList();
    }
}
