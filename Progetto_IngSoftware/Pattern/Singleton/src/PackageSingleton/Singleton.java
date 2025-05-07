package PackageSingleton;



public class Singleton {

private static Singleton unica_istanza = null;
private String frase;

Singleton(){
	frase = "Sono la classe Singoletto.";
	}

public static Singleton getSingleton(){
	if(unica_istanza == null){
		unica_istanza = new Singleton();
}
	return unica_istanza;
}

public String get_frase(){
	return frase;
}



public void set_frase(String nuova_frase) {
	
	this.frase = nuova_frase;
}


}
