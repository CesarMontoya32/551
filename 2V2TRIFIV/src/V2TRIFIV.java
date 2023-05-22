import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class V2TRIFIV {
    public static void main(String[] args) throws IOException {
        // Declaración de variables
        int numero;
        int mult3;
        int mult5;
        BufferedReader buffentrada = new BufferedReader(new InputStreamReader(System.in));
        //Entrada de datos 
        System.out.println("Ingresa un número");
        numero = Integer.parseInt(buffentrada.readLine());
        //Procesamiento de datos 
        mult3 = numero % 3;
        mult5 = numero % 5;
        //salida de datos
        if (mult3 == 0 && mult5 == 0){
            System.out.println("TRIFIV");
        }
        else if (mult3 == 0){
            System.out.println("TRI");
        }
        else if (mult5 == 0){
            System.out.println("FIV");
        }        
    }
    
}
    
