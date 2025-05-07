package Command;

public class Visualizzatore {
	
	
	InterfacciaCommand comando = null;
 
    public void visualizza(InterfacciaCommand comando) {
        comando.execute();
    }

}
