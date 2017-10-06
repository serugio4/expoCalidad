/**
 * 
 */
package Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Sergio García, Laura Enciso y José Alvarez
 *
 */
public class Fibonacci {

	
	static Scanner sc;
	
		public static void main(String[] args){
			
			int numero;
			
			sc = new Scanner(System.in);
			Fibonacci fi = new Fibonacci();
			
			do{
				System.out.print("Introduce numero mayor que 1: ");
				numero = sc.nextInt();
			}while(numero<=1);
			System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
			
			
			fi.calcularFibonacci(numero);
			
	    }

		/**
		 * 
		 * @param numero
		 * 				número ingresado para calcular esa cantidad de números de la secuencia de fibonacci
		 * @return resultado
		 * 					Un string con los números de la secuencia de fibonnaci
		 */
		public String calcularFibonacci(int numero){
			
			String resultado="";
			int fibo1,fibo2;	
			fibo1=1;
			fibo2=1;

			resultado+=fibo1+", ";
			

			for(int i=2;i<=numero;i++){

				
				resultado+=fibo2+", ";
				

				fibo2 = fibo1 + fibo2;
				fibo1 = fibo2 - fibo1;
	        }
	       
	        resultado= resultado.substring(0, resultado.length()-2);
	        System.out.println(resultado);
	        return resultado;
		}
		
		
}

