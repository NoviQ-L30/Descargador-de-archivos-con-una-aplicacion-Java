package edu.upv.poo;

/**
 *
 * @author luisroberto
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main1(String[] args) {
        new App().run();
    }
    
    public void run() {
        
        System.out.println("Práctica 06: Threads");
        
        Thread current = Thread.currentThread();
        System.out.println("Thread-Id: " + current.getId());
        System.out.println("Name: " + current.getName());
        System.out.println("State: " + current.getState().name());
                
        Thread t1 = new Thread(new ProcesoTardado());
        t1.start();
        Thread t2 = new Thread(new ProcesoTardado());
        t2.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración " + i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception ex) {}
        } 
        
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new ProcesoTardado());
            threads[i].start();
        }
    }
}
