
package com.mycompany.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {

    public static void main(String[] args) throws IOException {
         BufferedReader bufentrada = new BufferedReader(new InputStreamReader(System.in));
        //Declaración de variables
         int numero=0;
        //Entrada de datos
        System.out.println(" Dame un número ");
        numero=Integer.parseInt(bufentrada.readLine());
        //Salida
        System.out.println(retornaMultiplo(numero));
    }
       public static String retornaMultiplo(int num){
          int mult3;
          int mult5;
          mult3=num%3;
          mult5=num%5;
          if(mult3==0&&mult5==0){
          return "TRIFIV";
          }
           else if (mult3 == 0){
           return "TRI";
        }
        else if (mult5 == 0){
            return "FIV";
    }
           return "No es múltiplo de 3 ni de 5";
       }
}
