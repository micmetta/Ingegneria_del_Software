package PackageSingleton;



public class Client {
	
	public static void main(String[] args) {
		
		Singleton obj = new Singleton();
		System.out.println("Frase: "+obj.get_frase());
		System.out.println("indirizzo: "+obj.getSingleton());
		
		
		Singleton obj2 = new Singleton();
		obj2.set_frase("Sono sempre la stessa istanza.");
		System.out.println("Frase: "+obj2.get_frase());
		System.out.println("indirizzo: "+obj2.getSingleton());
	}


}