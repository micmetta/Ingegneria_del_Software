package Command;

public class Operazione2 implements InterfacciaCommand{

	private Receiver receiver;
	
	public Operazione2(Receiver receiver) {
        this.receiver = receiver;
    }
	
	
	    public void execute() {
	        receiver.Operazione2();
	    }
	
}
