package ru.job4j.stream;

public class Doctor {
    private String name;

    private String surname;

    private byte age;

    private String special;

    private String education;

    @Override
    public String toString() {
        return "Doctor{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", age=" + age
                + ", special='" + special + '\''
                + ", education='" + education + '\''
                + '}';
    }

    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private String special;
        private String education;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildSpecial(String login) {
            this.special = login;
            return this;
        }

        Builder buildEducation(String password) {
            this.education = password;
            return this;
        }

        Doctor build() {
            Doctor doctor = new Doctor();
            doctor.name = name;
            doctor.surname = surname;
            doctor.age = age;
            doctor.special = special;
            doctor.education = education;
            return doctor;
        }
    }

    public static void main(String[] args) {
        Doctor doctor = new Builder()
                .buildName("Arcady")
                .buildSurname("Parfenov")
                .buildAge((byte) 49)
                .buildSpecial("dentist")
                .buildEducation("MGU")
                .build();
        System.out.println(doctor);
    }
}
