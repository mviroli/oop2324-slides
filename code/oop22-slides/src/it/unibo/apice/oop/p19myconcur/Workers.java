package it.unibo.apice.oop.p19myconcur;

import java.util.Arrays;

public class Workers {

    private static record Worker(int[] array, int start, int stop) implements Runnable {
        @Override
        public void run() {
            Arrays.sort(array, start, stop);
        }
    }

    private static Runnable worker(int[] array, int start, int stop){
        return () -> Arrays.sort(array, start, stop);
    }

    public static void main(String[] args) {
        int[] a = new int[]{50,40,30,20,10};
        var w1 = new Thread(new Worker(a, 0, a.length/2));
        var w2 = new Thread(worker(a, a.length/2, a.length));
        w1.start();
        w2.start();
        try {
            w1.join();
            w2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(a));        
    }
}
