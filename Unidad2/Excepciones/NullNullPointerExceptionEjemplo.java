
package Excepciones;
public class NullNullPointerExceptionEjemplo {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
            System.out.println("La longitud de la cadena es: " + length);
        } catch (NullPointerException e) {
            System.out.println("Se ha producido una NullPointerException.");
        }
    }
}
