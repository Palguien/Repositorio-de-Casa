package es.uva.UsaPuntoV1;

import es.uva.punto.Punto ;

public class UsaPunto {

	public static void main(String[] args) {
		Punto punto1, punto2;
		punto1 = new Punto();
		punto2 = new Punto();
		
		punto1.traslada(3,4);
		
		double distancia = punto1.distancia(punto2);
		
		System.out.println("punto1 : (" + punto1.getCoordenadaX() + ", " + punto1.getCoordenadaY() + ")");
		System.out.println("punto2 : (" + punto2.getCoordenadaX() + ", " + punto2.getCoordenadaY() + ")");
		System.out.println("distancia del punto1 al punto2 : " + distancia);
		
		System.out.println(punto1.cartesianasACadena());
		System.out.println(punto1.polaresACadena());
		
		System.out.println("distancia de " + punto1.cartesianasACadena() + " a " + punto2.cartesianasACadena()
			+ " = " + punto1.distancia(punto2)) ;
		
		punto2.traslada(Math.sqrt(2)/2, Math.sqrt(2)/2);
		
		System.out.println(punto2.cartesianasACadena());
		System.out.println(punto2.polaresACadena());
		
		
	}

}
