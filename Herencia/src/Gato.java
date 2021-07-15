public abstract class Gato extends Animal implements Mascota{
	int numBigotes;
	String color;
	int vidasDisponibles = 9;
	
	/*Necesitamos heredar parte del constructor del padre*/
	public Gato(String nombre, int edad, String color) {
		//Haremos uso de la palabra "super();" hace referencia al constructor del padre
		super(nombre,edad); //Le pasa estas propiedades al constructor padre. SIEMPRE ES LO PRIMERO QUE DEBE DE IR
		this.color = color;
	}
	
	//Es necesario poner un override porque est�mos sobreescribiendo el m�todo
	@Override
	public String comer() {
		return "Comiendo at�n ";
	}

	//Implementando m�todos de interfaz mascota 
	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Caer de pie";
	}

	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Bola de estambre";
	}

	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Jugar con el laser";
	}
	
	/*@Override
	public String dormir() {
		return "Zzzzzzz";
	}*/
}