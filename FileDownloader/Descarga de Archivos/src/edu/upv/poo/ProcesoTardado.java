package edu.upv.poo;

import java.security.SecureRandom;

/**
 *
 * @author luisroberto
 */
public class ProcesoTardado implements Runnable {

    @Override
    public void run() {
        
        Thread current = Thread.currentThread();
        String threadName = current.getName();
        
        System.out.println("Empezando el thread " + threadName);
        
        // Simulamos un proceso que puede tardar.
        int timeToSleep = new SecureRandom().nextInt(10000);
        try {
            Thread.sleep(timeToSleep);
        }
        catch (InterruptedException ex ){
            
        }
        
        System.out.println("Finalizó thread " + threadName);
    }
    
}
