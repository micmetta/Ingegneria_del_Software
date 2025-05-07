package PackageComposite;


public class FileAtomico implements InterfacciaComune{

	private String myFileName = null;
	 
    public FileAtomico(String myFileName) {
        this.myFileName = myFileName;
    }
 
   
    public void print() {
        System.out.println(myFileName);
    }
 
    
    public void add(InterfacciaComune myFileNameSystem) {
        System.out.println("Impossible to add!");
    }
 
   
    public void remove(InterfacciaComune myFileNameSystem) {
        System.out.println("Non è possibile eliminare un nodo foglia.\n");
    }
	
}
