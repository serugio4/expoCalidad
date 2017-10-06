package pruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Test;

import Fibonacci.Fibonacci;

public class PruebasFibonacci {
	
	Fibonacci fi = new Fibonacci();

	@Test
	public void resultadoTamaņo5() {
		
		String esperado = "1, 1, 2, 3, 5";
					
		assertEquals(esperado, fi.calcularFibonacci(5));
	
	}
	
	@Test
	public void resultadoTamaņo10() {
		
		String esperado = "1, 1, 2, 3, 5, 8, 13, 21, 34, 55";
					
		assertEquals(esperado, fi.calcularFibonacci(10));
	
	}
	
	@Test
	public void resultadoTamaņo15() {
		
		String esperado = "1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610";
					
		assertEquals(esperado, fi.calcularFibonacci(15));
	
	}
}
	
	


