package Command;

/*
 *  implementazione del comando che consente di collegare Visualizzatore(Invoker) con il Receiver
 */

public class Operazione1 implements InterfacciaCommand{
	
	private Receiver receiver;
	
	public Operazione1(Receiver receiver) {
        this.receiver = receiver;
    }
	
	
	    public void execute() {
	        receiver.Operazione1();
	    }
	 
} 