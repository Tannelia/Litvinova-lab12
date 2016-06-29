package ru.spb.herzen;

public class Counter extends Thread
{
    @Override
    public void run()
    {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Сумма натуральных чисел: "+sum);
    }
}
