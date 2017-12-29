package com.company;

public class Twitter implements Observer {
    @Override
    public void notifyme() {
        System.out.println("Tweeting");
    }
}
