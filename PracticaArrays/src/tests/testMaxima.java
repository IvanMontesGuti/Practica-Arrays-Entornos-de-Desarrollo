package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.misArrays;

class testMaxima {

	@Test
	
	void testMaximaNota() {
		    int num[]= {1,5,2,5,7};
		    		    
			float resultadoEsperado=7;
			float resultadoObtenido= misArrays.maximaNota(num); 
			assertEquals(resultadoEsperado,resultadoObtenido);

	}
	
	@Test
	
	void testMediaNotas2() {
		    int num[]= {10,2,2,1,0};
		    		    
			float resultadoEsperado=10;
			float resultadoObtenido= misArrays.maximaNota(num); 
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
