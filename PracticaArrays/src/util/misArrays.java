
package util;
import java.util.Arrays;
public abstract class misArrays {
	
	/**
	 * devuelve la media de las notas introducidas en el array num
	 * @param num es un array de numeros de los cuales vamos a calcular la media
	 * @return devuelve la media de las notas introducidas en el array
	 * @author Ivan
	 * @exception si el numero no esta entre 0 y 10 devuelve IllegalArgumentException
	 */
	public static float mediaNotas(int [] num) {
		int sum=0;
		
		for (int i=0;i<num.length;i++) {
			if(num[i]<0||num[i]>10) {
				throw new IllegalArgumentException("Los numeros deben estar entre 0 y 10");
			}
			sum+=num[i];
		}
		return sum/num.length;
	}
	
	
	/**
	 * devuelve la mediana de las notas introducidas en el array num
	 * @param num es un array de enteros de notas las cuales vamos a calcular la mediana
	 * @return la nota mediana de un array de enteros
	 * @author Ivan
	 * @exception si el numero no esta entre 0 y 10 devuelve IllegalArgumentException
	 */
	 public static float medianaNotas(int[] num) {
	        Arrays.sort(num); 
	        
	        int mediana = num.length / 2; 
	        float valorCentral;
	        
	        for (int i=0;i<num.length;i++) {
				if(num[i]<0||num[i]>10) {
					throw new IllegalArgumentException("Los numeros deben estar entre 0 y 10");
				}
				
			}
	        

	        if (num.length % 2 == 0) {
	          
	            float num1 = num[mediana - 1];
	            float num2 = num[mediana];
	            valorCentral = (float) ((num1 + num2) / 2.0);
	        } else {
	          
	            valorCentral = num[mediana];
	        }

	        return valorCentral;
	    }
	
	
	
	
	
	
	        
	        

	

}
