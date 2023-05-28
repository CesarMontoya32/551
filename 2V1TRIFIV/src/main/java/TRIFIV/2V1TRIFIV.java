

package TRIFIV;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
       int num=1;
       while(num>=1&&num<=1000){
        System.out.println(" Ingresa un número ");
        num=leer.nextInt();
        
         if(num%3==0){
            System.out.println(" Three ");
        }
       if(num%5==0){
            System.out.println(" Five ");}
        
        if(num%3==0&&num%5==0){
            System.out.println(" 'Three and Five' ");}
       }
    }
}
