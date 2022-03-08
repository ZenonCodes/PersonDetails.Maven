package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class Person {
    private final String firstName;
    private final String lastName;
    private String hairColor;
    private String favoriteFood;
    private String favoriteHoliday;
    private Boolean pets;
    private int age;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Person(String firstName, String lastName, String hairColor, String favoriteFood, String favoriteHoliday, int age, Boolean pets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hairColor = hairColor;
        this.favoriteFood = favoriteFood;
        this.favoriteHoliday = favoriteHoliday;
        this.age = age;
        this.pets = pets;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("\nMy first name is " + firstName)
                .append("\nMy last name is " + lastName)
                .toString();
    }



    public String getFavoriteHoliday() {
        return favoriteHoliday;
    }

    public void setFavoriteHoliday(String favoriteHoliday) {
        this.favoriteHoliday = favoriteHoliday;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getPets() {
        return pets;
    }

    public void setPets(Boolean pets) {
        this.pets = pets;
    }
}
