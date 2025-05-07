package Command;

public class MainCommand {

	
public static void main(String[] args) {
		
		Receiver receiver = new Receiver();
		
		Operazione1 operazione1 = new Operazione1(receiver);
		Operazione2 operazione2 = new Operazione2(receiver);
		Operazione3 operazione3 = new Operazione3(receiver);
		
		Visualizzatore visualizzatore= new Visualizzatore();
		visualizzatore.visualizza(operazione1);
		visualizzatore.visualizza(operazione2);
		visualizzatore.visualizza(operazione3);

	}
	
	
}
