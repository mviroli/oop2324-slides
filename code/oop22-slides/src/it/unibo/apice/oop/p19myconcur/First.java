package it.unibo.apice.oop.p19myconcur;

public class First {

    private static class MyThread extends Thread {
        @Override
        public void run(){
            System.out.println("run done!!");
        }
    }

    public static void main(String[] args) {
        var thread = new MyThread();
        thread.start();
    }
    
}
