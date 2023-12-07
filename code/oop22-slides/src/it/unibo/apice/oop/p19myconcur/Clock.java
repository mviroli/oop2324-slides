package it.unibo.apice.oop.p19myconcur;

import java.util.Date;

public class Clock {

    private static class ClockThread extends Thread {
        private int step;

        public ClockThread(int step){
            this.step = step;
        }

        @Override
        public void run(){
            while (true){
                System.out.println(new Date());
                try{
                    Thread.sleep(step);
                } catch (Exception e){
                }
            }
        }
    }

    public static void main(String[] args) {
        var thread = new ClockThread(1000);
        thread.run(); // try with run!!
        String input = null;
        System.out.println("Please provide some input.");
        do {
            input = System.console().readLine();
            System.out.println("echo: "+ input);
        } while (!input.equals("exit"));
    }
    
}
