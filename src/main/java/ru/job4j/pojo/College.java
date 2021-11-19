package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student vasya = new Student();
        vasya.setName("Васильев Василий Васильевич");
        vasya.setGroup("III");
        vasya.setAdmissionDate("1 сентября 2020");
        System.out.println(vasya.getName() + " -- студент группы " +
                vasya.getGroup() + ", поступил " + vasya.getAdmissionDate());
    }
}
