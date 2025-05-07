
public class MainDecorator {

	public static void main(String[] args) {
		
		  FormaGeometrica cerchio = new Cerchio();
		  DecoratoreForma decoratore = new ConcreteDecoratoreForma(cerchio);
		  cerchio.disegna();
		  decoratore.disegna();
		  
		  
	   }
	

}
