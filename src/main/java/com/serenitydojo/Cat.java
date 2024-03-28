package com.serenitydojo;

public class Cat extends Pet {
    private String name;
    private String favoriteToy;
    private int age;

    static String PLAY = "plays with string";

    public Cat(String name, String favoriteToy, int age) {
        super(name,age);
        this.favoriteToy = favoriteToy;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play(){
        return PLAY;
    }
}
