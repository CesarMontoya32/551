package Excepciones;
public class ClassCastExceptionEjemplo {
   public static void main(String[] args) {
        try {
            Object obj = new Integer(10);
            String str = (String) obj; // Intentamos realizar un casting incorrecto
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}