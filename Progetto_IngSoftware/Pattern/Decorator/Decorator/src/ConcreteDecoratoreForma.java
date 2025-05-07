
public class ConcreteDecoratoreForma extends DecoratoreForma{
	
	public ConcreteDecoratoreForma(FormaGeometrica formaDecorata) {
	      super(formaDecorata);		
	   }

	  
	   public void disegna() {
	      
		   InserisciColoreBordo(formaDecorata);
	   }

	   private void InserisciColoreBordo(FormaGeometrica formaDecorata){
	      System.out.println("Sono il cerhio di prima ma con il bordo rosso.");
	   }

}
