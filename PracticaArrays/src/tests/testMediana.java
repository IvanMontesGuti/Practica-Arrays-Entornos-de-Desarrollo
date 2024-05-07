package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.misArrays;

class testMediana {

	@Test
	
	void testMedianaNotas() {
		    int num[]= {1,5,2,5,7};
		    		    
			float resultadoEsperado=5;
			float resultadoObtenido= misArrays.medianaNotas(num); 
			assertEquals(resultadoEsperado,resultadoObtenido);

	}
	
	@Test
	
	void testMedianaNotas2() {
		    int num[]= {1,2,3,4,5,6};
		    		    
			float resultadoEsperado=(float) 3.5;
			float resultadoObtenido= misArrays.medianaNotas(num); 
			assertEquals(resultadoEsperado,resultadoObtenido);

	}
	
	@Test
	
	void testMedianaNotas3() {
		    int num[]= {11,5,2,5,7};
		    		
		    Exception e = assertThrows(IllegalArgumentException.class,
		    		() -> misArrays.medianaNotas(num));
		    
		    String esperado = "Los numeros deben estar entre 0 y 10";
			String obtenido = e.getMessage();
			assertEquals(esperado, obtenido);

	}
}
