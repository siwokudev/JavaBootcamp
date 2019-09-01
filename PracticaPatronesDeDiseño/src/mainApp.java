
public class mainApp {

	public static void main(String[] args) {
		
		SingletonEjemplo miSingleton = SingletonEjemplo.getInstance();
		
		//esta linea dispara el error de la excepcion de otra instancia existente
		SingletonEjemplo miSingleton2 = SingletonEjemplo.getInstance();
		
		miSingleton.setCosa("cosa 1");
		miSingleton2.setCosa("cosa 2");
		
		System.out.println("singleton 1: " + miSingleton.getCosa() + " Singleton 2: " + miSingleton2.getCosa());
		//hacen referencia a la misma localidad de memoria haciendolos el "mismo" objeto
	}

}
