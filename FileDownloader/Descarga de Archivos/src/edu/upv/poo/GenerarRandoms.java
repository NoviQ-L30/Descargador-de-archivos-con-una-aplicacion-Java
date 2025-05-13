package edu.upv.poo;
import java.security.SecureRandom;

/**
 * Representa el proceso de generar números random.
 * @author luisroberto
 */
public class GenerarRandoms implements Runnable {

    private final SecureRandom secureRandom = new SecureRandom();
    private final int cantidad;
    private final double[] randoms;
    
    /**
     * Inicializa una nueva instancia de la clase GenerarRandoms.
     * @param cantidad Cantidad de randoms a generar.
     */
    public GenerarRandoms(int cantidad) {
        this.cantidad = Math.abs(cantidad);
        randoms = new double[this.cantidad];
    }
    
    /**
     * Contiene los randoms generados después de ejecutar el proceso.
     * @return Los randoms generados.
     */
    public final double[] getRandoms() { return randoms; }
    
    /**
     * Ejecución principal del proceso.
     */
    @Override
    public void run() {
        for (int i = 0; i < cantidad; i++) {
            randoms[i] = secureRandom.nextDouble();
        }
        System.out.println("Proceso de generar randoms finalizado.");
    }    
}
