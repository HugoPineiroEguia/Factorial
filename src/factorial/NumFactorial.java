package factorial;

import java.util.Scanner;

/**
 *
 * @author pinha
 */
public class NumFactorial {
    
    private final Scanner sc = new Scanner(System.in);    

    public void factorialSinRecursividad(){
        
        int factorial;                                                          //Instancio una variable tipo int, que mas tarde recibira el numero del que se desea obtener el factorial
        double resultado = 1;                                                   //Instancio una varable en la que se iran guardando los reultados
        
        System.out.print("Que numero factorial quieres calcular: ");            //Pregunta por consola el numero
        
        factorial = sc.nextInt();                                               //El programa pide, lee y almacena en la variable de tipo int el numero deseado
        
        for (int i = factorial; i>=1; i--){                                     //Un bucle que se repite hasta pasar por todos los numeros que hay entre el pedido y el 1
            resultado = resultado * i;                                          //Almacena el resultado y lo actualiza cada vez que se recorre el bucle
            System.out.println(resultado);                                      //Muestra en pantalla los diferentes resultados para comprobar que todo funciona correctamente
        }
        
        System.out.println("Resultado: "+resultado);                            //Muestra por pantalla el resultado final
    }

    
    
}
