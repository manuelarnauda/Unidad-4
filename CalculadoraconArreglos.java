
package calculadoraconarreglos;
import java.util.Scanner;

public class CalculadoraconArreglos {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] elementos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        double suma = 0;
        double multiplicacion = 1;
        int eleccion;
        
        
        
        do {    
            System.out.println("Desea sumar o multiplicar los valores?");
            System.out.println("1. Quiero sumar los valores");
            System.out.println("2. Quiero multiplicar los valores");
            System.out.println("3. Salir");
            eleccion = scanner.nextInt();
            
            switch (eleccion) {
                case 1:
                    System.out.println("Elegiste sumar los valores");  
                            
                    for (int i = 0; i < elementos.length; i++) {
                        suma += elementos[i];
                        System.out.println(suma += elementos[i]);
                    }
                    break;
                case 2:
                    System.out.println("Elegiste multiplicar los valores");
                    for (int i = 1; i < elementos.length; i++) {
                        multiplicacion *= elementos[i];
                        System.out.println(multiplicacion *= elementos[i]);
                        
                    }
                    break;
                    
                default:
                    System.out.println("Esa no es una opción");
            }
        } while (eleccion !=3);
        
       
        
           
            
            
        }
        
       
    }
    

