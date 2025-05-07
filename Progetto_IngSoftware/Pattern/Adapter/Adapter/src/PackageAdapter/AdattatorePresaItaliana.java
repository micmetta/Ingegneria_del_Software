package PackageAdapter;

public class AdattatorePresaItaliana extends PresaItaliana implements InterfacciaPresaTedesca{

	
	public void InserisciAdattatore() {
		
		System.out.println("Adattatore applicato alla presa tedesca.\n");
		InserimentoNellaPresaItaliana();
	}

}
