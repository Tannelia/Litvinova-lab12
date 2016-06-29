package ru.spb.herzen;

public class Message extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("Say hello");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
