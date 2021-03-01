package apCommon;


public class Aereo {
	
	//Attributi
	private String IDAereo;
	private String Modello;
	private Compagnia compagnia;
	
	//Costruttore
	public Aereo(){
		String IDAereo = "I-AAAA";
		String Modello = "Nome Modello";
		Compagnia compagnia = new Compagnia();
	}

	//Metodi
	public Aereo getAereoInfo() { //TO-DO
		getIDAereo();
		getModello();
		compagnia.getCompagniaInfo();
	}
	
	public String getIDAereo() {
		return IDAereo;
	}

	public void setIDAereo(String iDAereo) {
		IDAereo = iDAereo;
	}

	public String getModello() {
		return Modello;
	}

	public void setModello(String modello) {
		Modello = modello;
	}

	public Compagnia getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(Compagnia compagnia) {
		this.compagnia = compagnia;
	}
	
}
