package it.unibo.apice.oop.p19myconcur;

public class TryRunnable {

    public static void main(String[] args) {
        var thread = new Thread(() -> {
            while (true){
                try {
                    Thread.sleep(1000);
                    System.out.println("tick");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
    
}
