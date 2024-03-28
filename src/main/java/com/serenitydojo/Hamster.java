package com.serenitydojo;

public class Hamster extends Pet{

    private String favoriteGame;
    static String PLAY = "runs in wheel";

    Hamster(String name, int age, String favoriteGame) {
        super(name, age);
        this.favoriteGame = favoriteGame;

    }

    public String play(){
        return PLAY;
    }
}
