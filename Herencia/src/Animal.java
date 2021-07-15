
public abstract class Animal {

	String nombre="";
	int patas=0;
	int edad=0;
	
	public Animal(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	public  abstract String comer(); // definir metodo q se llama comer
	
	public abstract String dormir(); // definir metodo q se va llamar dormir
	public String jugar() {
		// TODO Auto-generated method stub
		return null;
	}
}

