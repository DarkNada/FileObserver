package com.company;

public class SMS implements Observer {
    @Override
    public void notifyme() {
        System.out.println("Sending SMS");
    }
}
