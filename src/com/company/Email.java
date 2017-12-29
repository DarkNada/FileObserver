package com.company;

public class Email implements Observer {
    @Override
    public void notifyme() {
        System.out.println("Email sending");
    }
}
