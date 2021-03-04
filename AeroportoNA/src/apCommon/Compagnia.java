package apCommon;

public class Compagnia {
	
	//Attributi
	private String nomeCompagnia;
	private String website;
	
	//Costruttore vuoto
	public Compagnia(){
	}
	
	//Costruttore con parametri
	public Compagnia(String nomeCompagnia, String website) {
		this.nomeCompagnia = nomeCompagnia;
		this.website = website;
	}
	
	//Metodi
	public String getNomeCompagnia() {
		return nomeCompagnia;
	}

	public void setNomeCompagnia(String nomeCompagnia) {
		this.nomeCompagnia = nomeCompagnia;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		website = website;
	}
	
	
}
