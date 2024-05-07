package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.misArrays;

class testMedia {

	
	@Test
	
	void testMediaNotas() {
		    int num[]= {1,5,2,5,7};
		    		    
			float resultadoEsperado=4;
			float resultadoObtenido= misArrays.mediaNotas(num); 
			assertEquals(resultadoEsperado,resultadoObtenido);

	}
	
	@Test
	
	void testMediaNotas2() {
		    int num[]= {5,5,5,5,5};
		    		    
			float resultadoEsperado=5;
			float resultadoObtenido= misArrays.mediaNotas(num); 
			assertEquals(resultadoEsperado,resultadoObtenido);

	}
	
	@Test
	
	void testMediaNotas3() {
		    int num[]= {11,5,2,5,7};
		    		
		    Exception e = assertThrows(IllegalArgumentException.class,
		    		() -> misArrays.mediaNotas(num));
		    
		    String esperado = "Los numeros deben estar entre 0 y 10";
			String obtenido = e.getMessage();
			assertEquals(esperado, obtenido);

	}
}
	
	
