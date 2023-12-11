package by.lyofa.philosophersemaphore;

import java.util.concurrent.CyclicBarrier;

public class Ferry {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        for (int i = 1; i <= 9; i++) {
            new CarToFerry(cyclicBarrier, "car N " + i).start();
            Thread.sleep(1000);
        }

    }

}
