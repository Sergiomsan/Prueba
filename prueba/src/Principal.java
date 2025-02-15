
public class Principal {

	public static void main(String[] args) {
		Cd cd = new Cd("TDK", "Cd-r", "700MB", 204, 300, "CD", "Unidad Óptica");
		DiscoDuro discoDuro = new DiscoDuro("Forgeon", "Nimbus PRO Gen4", "1TB", 102, 150, "DiscoDuro","HDD");
		
		System.out.println("CD: ");
		cd.dispIntroducido();
		cd.escribirDispositivo();
		cd.leerDispositivo();
		System.out.println("Disco Duro: ");
		discoDuro.dispIntroducido();
		discoDuro.escribirDispositivo();
		discoDuro.leerDispositivo();
	}

}
