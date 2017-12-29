package com.company;

public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer twitter = new Twitter();
        Observer email = new Email();
        Observer sms = new SMS();

        subject.addObserver(twitter);
        subject.addObserver(email);
        subject.addObserver(sms);
        
        subject.checkFolder();

    }
}
