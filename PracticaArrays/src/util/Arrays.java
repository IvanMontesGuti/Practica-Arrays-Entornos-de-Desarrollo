package util;

public abstract class Arrays {
	
	/**
	 * devuelve la media de las notas introducidas en el array num
	 * @param num es un array de numeros de los cuales vamos a calcular la media
	 * @return devuelve la media de las notas introducidas en el array
	 */
	static float mediaNotas(int [] num) {
		int sum=0;
		
		for (int i=0;i<num.length;i++) {
			if(num[i]<0||num[i]>10) {
				throw new IllegalArgumentException("Los numeros deben estar entre 0 y 10");
			}
			sum+=num[i];
		}
		return sum/num.length;
	}

}
