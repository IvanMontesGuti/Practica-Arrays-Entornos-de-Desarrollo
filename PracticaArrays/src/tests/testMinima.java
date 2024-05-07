package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.misArrays;

class testMinima {

	@Test
	
	void testMinimaNota() {
		    int num[]= {1,5,2,5,7};
		    		    
			float resultadoEsperado=1;
			float resultadoObtenido= misArrays.minimaNota(num); 
			assertEquals(resultadoEsperado,resultadoObtenido);

	}
	
	@Test
	
	void testMinimaNota2() {
		    int num[]= {5,5,5,5,5};
		    		    
			float resultadoEsperado=5;
			float resultadoObtenido= misArrays.minimaNota(num); 
			assertEquals(resultadoEsperado,resultadoObtenido);

	}
	
	@Test
	
	void testMinimaNota3() {
		    int num[]= {11,5,2,5,7};
		    		
		    Exception e = assertThrows(IllegalArgumentException.class,
		    		() -> misArrays.minimaNota(num));
		    
		    String esperado = "Los numeros deben estar entre 0 y 10";
			String obtenido = e.getMessage();
			assertEquals(esperado, obtenido);

	}

}
