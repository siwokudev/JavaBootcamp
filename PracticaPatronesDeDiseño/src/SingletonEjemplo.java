
public class SingletonEjemplo {
	
	private static SingletonEjemplo instance = null;
	
	private String cosa;
	
	private SingletonEjemplo() {
		
	}
	
	public static SingletonEjemplo getInstance() {
		
		if(instance == null) {
			instance = new SingletonEjemplo();
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return instance;  //todos los patrones de diseño creacionales ocultan el "new" y por lo tanto regresan un return "new"
	}

	public String getCosa() {
		return cosa;
	}

	public void setCosa(String cosa) {
		this.cosa = cosa;
	}
	
	
}
