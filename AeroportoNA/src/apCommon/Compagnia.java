package apCommon;

public class Compagnia {
	
	//Attributi
	private String nomeCompagnia;
	private String CallCenter;
	private String Website;
	
	//Costruttore
	public Compagnia(){
		String nomeCompagnia="Nome Compagnia";
		String CallCenter="000-000-0000";
		String website="www.website.com";
	}
	
	//Metodi
	public String getNomeCompagnia() {
		return nomeCompagnia;
	}
	
	public void setNomeCompagnia(String nomeCompagnia) {
		this.nomeCompagnia = nomeCompagnia;
	}
	
	public String getCallCenter() {
		return CallCenter;
	}
	
	public void setCallCenter(String callCenter) {
		CallCenter = callCenter;
	}
	
	public String getWebsite() {
		return Website;
	}
	
	public void setWebsite(String website) {
		Website = website;
	}
	
}
