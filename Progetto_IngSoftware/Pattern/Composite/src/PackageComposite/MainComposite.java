package PackageComposite;


public class MainComposite {
	
	public static void main(String[] args) {
        
		InterfacciaComune file1 = new FileAtomico("File1");
        InterfacciaComune file2 = new FileAtomico("File2");
        InterfacciaComune file3 = new FileAtomico("File3");
        InterfacciaComune file4 = new FileAtomico("File4");
        InterfacciaComune file5 = new FileAtomico("File5");
        
        InterfacciaComune cartella1 = new Cartella("Cartella1");
        InterfacciaComune cartella2 = new Cartella("Cartella2");
        
        cartella1.add(file1);
        cartella1.add(file2);
        cartella2.add(file3);
        cartella2.add(file4);
        cartella2.add(file5);
        cartella1.add(cartella2);
        
        cartella1.print();
        
        cartella1.remove(cartella2);
        
        System.out.println("\nStampa dopo aver rimosso la cartella 2:");
        cartella1.print();
        
        
        
    }

}
