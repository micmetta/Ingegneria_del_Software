
public abstract class DecoratoreForma implements FormaGeometrica {
	   
	   protected FormaGeometrica formaDecorata;

	   public DecoratoreForma(FormaGeometrica formaDecorata){
	      this.formaDecorata = formaDecorata;
	   }

	   public void disegna(){
		   formaDecorata.disegna();
	   }	
	}
