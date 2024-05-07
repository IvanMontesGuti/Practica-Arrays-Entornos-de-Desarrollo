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

}
