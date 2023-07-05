package Excepciones;
public class ClassNotFouundException {
   public static void main(String[] args) {
        try {
            // Intentamos cargar una clase que no existe
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
    }   
}
