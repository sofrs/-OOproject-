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

	public String getCompagniaNome() {
		return compagnia.getNomeCompagnia();
	}

	public void setCompagnia(String nomeCompagnia, String CallCenter, String Website) {
		compagnia.setNomeCompagnia(nomeCompagnia);
		compagnia.setCallCenter(CallCenter);
		compagnia.setWebsite(Website);
	}
	
}
