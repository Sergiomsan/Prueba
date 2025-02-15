
public class Cd extends Almacenamiento {

	private boolean estaEscrito = false;	
	
	public Cd(String marca, String modelo, String almacenamiento, int velLectura, int velEscritura,
			String tipoDisco, String tipoConectividad) {
		super(marca, modelo, almacenamiento, velLectura, velEscritura, tipoDisco, tipoConectividad);
		this.estaEscrito = estaEscrito;
	}

	@Override
	void escribirDispositivo() {
		try {
			if (estaEscrito == false) {	
				System.out.println("Escribiendo disco...");
				Thread.sleep(getVelEscritura());
				setEstaEscrito(true);
			} else {
				System.out.println("Este disco ya esta escrito");
			}
		} catch (InterruptedException e) {
			System.out.println("ha habido un fallo en la escritura del disco");
		}
	}

	public boolean isEstaEscrito() {
		return estaEscrito;
	}

	public void setEstaEscrito(boolean estaEscrito) {
		this.estaEscrito = estaEscrito;
	}
}
