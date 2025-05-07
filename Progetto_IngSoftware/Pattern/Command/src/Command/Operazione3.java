package Command;

public class Operazione3 implements InterfacciaCommand{

	private Receiver receiver;
	
	
	
	public Operazione3(Receiver receiver) {
		this.receiver = receiver;
		
	}
	
	public void execute() {
		
		receiver.Operazione3();
		
	}
	
	

}
