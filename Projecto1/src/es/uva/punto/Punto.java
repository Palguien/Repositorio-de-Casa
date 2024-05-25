package es.uva.punto;

public class Punto {

	//ATRIBUTOS
	/**
	 * Atributo que modela la coordenada x de la clase Punto
	 */
	private double coordenadaX;
	
	/**
	 * Atributo que modela la coordenada y de la clase Punto
	 */
	private double coordenadaY;
	
	//private double rho;
	//private double theta;
	
	
	//CONSTRUCTOR(ES)
	
	/**
	 * Constructor sin parametros
	 * Los atributos de coordenadas X e Y inicializados en
	 * el origen de coordenadas
	 */
	public Punto() {
		//super(); 		No hace falta
		this.coordenadaX = 0.0;
		this.coordenadaY = 0.0;
	}
	
	/**
	 * Constructor con parametros de las coordenadas X e Y
	 * @param coordenadaX es el valor numerico decimal en el eje X
	 * @param coordenadaY es el valor numerico decimal en el eje Y
	 */
	public Punto(double coordenadaX, double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	
	
	//METODOS
	
	//coordenadaX
	/**
	 * Metodo para acceder al valor de la coordenadaX
	 * @return valor de la coordenadaX
	 */
	public double getCoordenadaX() {
		return coordenadaX;
	}

	/**
	 * Metodo para la modificacion del valor de la coordenadaX
	 * @param coordenadaX valor decimal en el eje X
	 */
	public void setCoordenadaX(double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	
	//coordenadaY
	/**
	 * Metodo para acceder al valor de la coordenadaY
	 * @return valor de la coordenadaY
	 */
	public double getCoordenadaY() {
		return coordenadaY;
	}

	/**
	 * Metodo para la modificacion del valor de la coordenadaY
	 * @param coordenadaY valor decimal en el eje Y
	 */
	public void setCoordenadaY(double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	//METODOS CLASE
	//Para metodo traslada, quieres modificarlo pero no mostrarlo
	/**
	 * Metodo para trasladar un punto dado a otras coordenadas
	 * @param coordenadaX daremos el nuevo valor decimal a la coordenada del eje X
	 * @param coordenadaY daremos el nuevo valor decimal a la coordenada del eje Y
	 */
	
	public void traslada(double coordenadaX, double coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		
	}
	//Queremos mostrar la distancia y necesitamos dos puntos uno lo llamamos bajo este
	//metodo P y al otro Q
	//Quiza es reducible poniendo el metodo absoluto
	/**
	 * Metodo para hallar la distacia entre dos puntos dados. Se debe tener en cuenta
	 * que se hace desde un punto conocido a otro.
	 * @param q es el punto sobre el trabajamos
	 * @return un valor decimal que representa la distancia entre los dos puntos
	 */
	public double distancia(Punto q) {
		
		if(this.getCoordenadaX() < q.getCoordenadaX()) {
			double restaX = q.getCoordenadaX() - this.getCoordenadaX();
			double restaY = q.getCoordenadaY() - this.getCoordenadaY();
			double distancia = Math.sqrt(Math.pow(restaX, 2)+Math.pow(restaY, 2));
			return distancia;
		}
		if(q.getCoordenadaX() < this.getCoordenadaX()) {
			double restaX = this.getCoordenadaX() - q.getCoordenadaX();
			double restaY = this.getCoordenadaY() - q.getCoordenadaY();
			double distancia = Math.sqrt(Math.pow(restaX, 2)+Math.pow(restaY, 2));
			return distancia;
		}
		else {
			return 0;
		}	
	}
	
	
	//--------------------------------------
	//Calculo de las variables de cartesianas a polares
	public double getRho() {
		return Math.sqrt(Math.pow(getCoordenadaX(), 2)+Math.pow(getCoordenadaY(), 2));
	}
	
	public double getTheta() {
		return Math.toDegrees(Math.atan(getCoordenadaY()/getCoordenadaX()));
	}
	
	//Asigna rho y theta de un punto a otro punto, a partir de los anteriores metodos
	//Esta mal hecho mirar ******
	public double asignaRho(double rho) {
		
		return rho;
	}
	
	public double asignaTheta(double theta) {
		return theta;
	}
	//*********
	
	
	//Cartesianas a polares (las dos devuelvtas desde un string)
	//Lo llamamos polaresACadena
	//HACER JAVADOC
	
	public String polaresACadena() {
		return "Distancia "+getRho()+ " y angulo en radianes "+Math.toRadians(getTheta());
	}
	
	//Mostrar los elementos de cartesianas, cartesianasACadena
	//HACER JAVADOC
	public String cartesianasACadena() {
		return "("+getCoordenadaX()+ ", " +getCoordenadaY()+")" ;
	}

	
	
	
	
	
}
