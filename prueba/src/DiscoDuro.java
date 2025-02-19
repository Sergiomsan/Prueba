
public class DiscoDuro extends Cd {

	public DiscoDuro(String marca, String modelo, String almacenamiento, int velLectura, int velEscritura,
			String tipoDisco, String tipoConectividad) {
		super(marca, modelo, almacenamiento, velLectura, velEscritura, tipoDisco, tipoConectividad);
	}

	@Override
	void escribirDispositivo() {
		try {
			System.out.println("Escribiendo disco...");
			Thread.sleep(getVelEscritura());
		} catch (InterruptedException e) {
			System.out.println("Ha habido un fallo en la lectura del disco duro");
		}
	}

}
