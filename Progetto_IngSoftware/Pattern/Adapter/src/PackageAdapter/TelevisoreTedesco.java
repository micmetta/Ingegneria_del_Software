package PackageAdapter;

public class TelevisoreTedesco {

	private String tv_tedesca;
	private InterfacciaPresaTedesca presaTedesca;
	
	public TelevisoreTedesco() {
		
		tv_tedesca = "Sono una televisione tedesca che NON può attaccarsi direttamente ad una presa italiana.\n";
	    System.out.println(tv_tedesca);
		presaTedesca = new AdattatorePresaItaliana();
		presaTedesca.InserisciAdattatore();
		
	}
	
	public void stampa_tv() {
		System.out.println(this.tv_tedesca);
	}

	
	

	
}
