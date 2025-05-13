package edu.upv.poo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Contiene funciones de utilería para manejo de archivos.
 * @author luisroberto
 */
public class FilesUtil {
    
    /**
     * Descarga a un archivo en disco en una ubicación específica un recurso de
     * internet especificando la URL de su ubicación.
     * @param url URL del recurso a descargar a disco.
     * @param path La ruta donde se descargara en disco el archivo.
     * @throws IOException 
     */
    public static void download(URL url, Path path) 
            throws IOException {
        try (InputStream stream = url.openStream()) {
            Files.copy(stream, path, StandardCopyOption.REPLACE_EXISTING);
        }
    }
    
    public static void download(URL url, String folder, String filename) 
            throws IOException {
        download(url, Paths.get(folder, filename));        
    }
    
    public static void download(String url, String folder, String filename) 
            throws IOException {
        download(new URL(url), folder, filename);
    }
}
