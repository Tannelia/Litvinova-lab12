package ru.spb.herzen;

public class Calculator extends Thread
{
    private Message message;

    public Calculator(Message message) {
        this.message = message;
        this.message.start();
    }

    @Override
    public void run()
    {
        int rnd = 100000000 + (int) (Math.random() * ((999999999 - 100000000) + 1));
        boolean prime = false;
        for (int i = 1; i < Math.sqrt(rnd); i++) {
            if (rnd % i == 0) {
                prime = true;
            }
        }
        if(prime)
            System.out.println(rnd + " - простое число");
        else
            System.out.println(rnd + " - сложное число");
        message.interrupt();
    }
}
