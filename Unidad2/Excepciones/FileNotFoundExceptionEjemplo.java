package Excepciones;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFoundExceptionEjemplo {
    public static void main(String[] args) {
        try {
            File file = new File("archivo.txt");
            Scanner scanner = new Scanner(file);
            // Resto del código para procesar el archivo
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    } 
}
