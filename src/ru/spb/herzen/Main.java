package ru.spb.herzen;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.start();
        try {
            counter.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        Message message = new Message();
        Calculator calculator = new Calculator(message);
        calculator.start();
    }
}
