
package calculadoraconarreglosu4;
import java.util.Scanner;

public class CalculadoraconArreglosU4 {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double[] elementos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        int eleccion;
        
        
        
        do {    
            System.out.println("Desea sumar o multiplicar los valores?");
            System.out.println("1. Quiero sumar los valores");
            System.out.println("2. Quiero multiplicar los valores");
            System.out.println("3. Salir");
            eleccion = scanner.nextInt();
            
            switch (eleccion) {
                case 1:
                    double suma = 0;
                    System.out.println("Elegiste sumar los valores");  
                            
                    for (int i = 0; i < elementos.length; i++) {
                        suma += elementos[i];
                        
                    }
                    System.out.println("La suma de los valores es de " + suma);
                    break;
                case 2:
                    double multiplicacion = 1;
                    System.out.println("Elegiste multiplicar los valores");
                    for (int i = 0; i < elementos.length; i++) {
                        multiplicacion *= elementos[i];
                       
                        
                    }
                    System.out.println("La multiplicacion de los valores es de " + multiplicacion);
                    break;
                
                case 3:
                    System.out.println("Hasta luego");
                    
                default:
                    System.out.println("Esa no es una opcion");
            }
        } while (eleccion !=3);
        
       
        
           
            
            
        }
        
       
    }
    
    

