package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Subject {
    private int filecount = 0;
    private int runtimecount = 0;
    private ArrayList<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.notifyme();
        }
    }

    void checkFolder() {


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                String path = "D:/projectTest";
                File folder = new File(path);
                String allFiles[] = folder.list();
                if (filecount != allFiles.length) {
                    filecount = allFiles.length;
                    if(runtimecount != 0) {
                        System.out.println("Directory Modified. File count:" + filecount);
                        notifyAllObservers();
                    }
                    else{
                        System.out.println("File count:" + filecount);
                    }
                    runtimecount++;
                }

            }
        }, 0, 1000);

    }


}
