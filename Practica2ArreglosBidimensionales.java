
package practica2arreglosbidimensionales;


public class Practica2ArreglosBidimensionales {

    
    public static void main(String[] args) {
       
        char[][]letras= {
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'J'},
            {'K', 'L', 'M', 'N', 'O'},
            
        };
        
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
            System.out.print(letras[i][j] + " ");
                
            }
            System.out.println();
        }
    }
    
}
   
