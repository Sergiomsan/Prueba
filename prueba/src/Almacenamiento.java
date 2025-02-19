
abstract class Almacenamiento {
	
	private String marca;
	private String modelo;
	private String almacenamiento;
	private int velLectura;
	private int velEscritura;
	private String tipoDisco;
	private String tipoConectividad;	
	
	public Almacenamiento(String marca, String modelo, String almacenamiento, int velLectura, int velEscritura,
			String tipoDisco, String tipoConectividad) {
		this.marca = marca;
		this.modelo = modelo;
		this.almacenamiento = almacenamiento;
		this.velLectura = velLectura;
		this.velEscritura = velEscritura;
		this.tipoDisco = tipoDisco;
		this.tipoConectividad = tipoConectividad;
	}

	void girar() {
		System.out.println("El CD está girando");
	}
	
	void dispIntroducido() {
		System.out.println("Se ha introducido un " + getTipoDisco()+ " \n\tMarca: " + getMarca() + 
				"\n\tModelo: " + getModelo() + 
				"\n\tCapacidad de Almacenamiento: " + getAlmacenamiento() + 
				" \n\tTipo de Conectividad: " + getTipoConectividad());
	}
	
	void leerDispositivo() {
		try {
			System.out.println("Leyendo disco...");		
			Thread.sleep(getVelLectura());
		} catch (InterruptedException e) {
			System.out.println("Hubo un error al leer el disco");
		}
	}
	
	abstract void escribirDispositivo();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(String almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getVelLectura() {
		return velLectura;
	}

	public void setVelLectura(int velLectura) {
		this.velLectura = velLectura;
	}

	public int getVelEscritura() {
		return velEscritura;
	}

	public void setVelEscritura(int velEscritura) {
		this.velEscritura = velEscritura;
	}

	public String getTipoDisco() {
		return tipoDisco;
	}

	public void setTipoDisco(String tipoDisco) {
		this.tipoDisco = tipoDisco;
	}

	public String getTipoConectividad() {
		return tipoConectividad;
	}

	public void setTipoConectividad(String tipoConectividad) {
		this.tipoConectividad = tipoConectividad;
	}
	
	
}
