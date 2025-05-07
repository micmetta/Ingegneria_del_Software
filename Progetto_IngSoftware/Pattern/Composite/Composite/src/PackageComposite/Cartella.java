package PackageComposite;


import java.util.ArrayList;

public class Cartella implements InterfacciaComune {
	 
	    private String myFolderName;
	    private ArrayList<InterfacciaComune> folder;//ArrayList di cartelle
	 
	    public Cartella(String myFolderName) {
	        this.myFolderName = myFolderName;
	        folder = new ArrayList<InterfacciaComune>();
	    }
	 
	    @Override
	    public void print() {
	        System.out.println(myFolderName);
	        for (int i = 0; i < folder.size(); i++) {
	            folder.get(i).print();
	        }
	    }
	 
	    @Override
	    public void add(InterfacciaComune interfacciaComune) {
	        folder.add(interfacciaComune);
	    }
	 
	    @Override
	    public void remove(InterfacciaComune interfacciaComune) {
	        folder.remove(interfacciaComune);
	    }
	
}
