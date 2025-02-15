
public class Principal {

	public static void main(String[] args) {
		Cd cd = new Cd("TDK", "Cd-r", "700MB", 204, 300, "CD", "Unidad Óptica");
		DiscoDuro discoDuro = new DiscoDuro("Forgeon", "Nimbus PRO Gen4", "1TB", 102, 150, "DiscoDuro","HDD");
		BluRay bluRay = new BluRay("LG", "LG WH16NS40", "128GB", 250, 270, "Blue-ray", "SATA");
		LP lp = new LP("Vinilo Prensado DIY", "Vinilo 12'", "22 minutos por lado", 220, 250, "Vinilo", "Mecánica");
		
		System.out.println("CD: ");
		cd.dispIntroducido();
		cd.escribirDispositivo();
		cd.leerDispositivo();
		System.out.println("Disco Duro: ");
		discoDuro.dispIntroducido();
		discoDuro.escribirDispositivo();
		discoDuro.leerDispositivo();
		System.out.println("Blu-Ray: ");
		bluRay.dispIntroducido();
		bluRay.escribirDispositivo();
		bluRay.leerDispositivo();
		System.out.println("LP: ");
		lp.dispIntroducido();
		lp.escribirDispositivo();
		lp.leerDispositivo();
	}

}
