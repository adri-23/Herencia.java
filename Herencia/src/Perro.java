
public abstract class Perro extends Animal implements Mascota, Cuidados{ //Hace referencia a que hereda de animal

	String raza = "";
	String color = "";
	int peso = 0;
	
	/*Se puede hacer s�lo el constructor para llenar datos del padre*/
	public Perro(String nombre, int edad) {
		super(nombre,edad);
	}
	
	public String ladrar() {
		return "Guau Guau";
	}
	
	@Override
	public String comer() {
		return "Comiendo croquetas";
	}

	/******************* M�todos de la interfaz *****************************
	 Es obligatorio usar todos sus m�todos porque todos son abstractos
	 */
	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Dar la patita";
	}

	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Recibir galletas";
	}

	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Jugando a la pelota";
	}

	/********************* implementando m�todos de Cuidados *****************************/
	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return "Perrito saludable";
	}

	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return "Caminando por el parque";
	}

	@Override
	public String banio() {
		// TODO Auto-generated method stub
		return "Tomando un ba�o";
	}
}
