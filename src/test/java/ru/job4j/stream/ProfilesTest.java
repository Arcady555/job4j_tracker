package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProfilesTest {

    @Test
    public void collectAddresses() {
        Address address1 = new Address("Moscow", "Vavilova", 76, 45);
        Address address2 = new Address("St. Petersburg", "Nevscy", 23, 67);
        Address address3 = new Address("Urupinsc", "Lenina", 100, 1);
        List<Profile> profiles = List.of(new Profile(address1),
                new Profile(address2), new Profile(address3));
        Profiles profilesObject = new Profiles();
        List<Address> actual = profilesObject.collect(profiles);
        List<Address> expected = List.of(address1, address2, address3);
        Assert.assertArrayEquals(actual.toArray(), expected.toArray());
    }

    @Test
    public void collectAddressesWithDuplicates() {
        Address address1 = new Address("Moscow", "Vavilova", 76, 45);
        Address address2 = new Address("St. Petersburg", "Nevscy", 23, 67);
        Address address3 = new Address("Moscow", "Vavilova", 76, 45);
        Address address4 = new Address("Urupinsc", "Lenina", 100, 1);
        Address address5 = new Address("Moscow", "Spartakovscaya", 99, 15);
        List<Profile> profiles = List.of(new Profile(address1),
                new Profile(address2), new Profile(address3),
                new Profile(address4), new Profile(address5));
        Profiles profilesObject = new Profiles();
        List<Address> actual = profilesObject.collect(profiles);
        List<Address> expected = List.of(address1, address5, address2, address4);
        Assert.assertArrayEquals(actual.toArray(), expected.toArray());
    }
}