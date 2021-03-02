package apCommon;

public class Tratta {
	
	//Attributi
	public enum città{
		Amsterdam,
		Atene,
		Barcellona,
		Berlino,
		Bruxelles,
		Cagliari,
		Catania,
		Cracovia,
		Dubai,
		Genova,
		Liverpool,
		Londra,
		Torino,
		Trieste,
		Venezia,
		Verona;
	};
	private Volo volo;
	
	//Costruttori
	
	
	//Metodi
	public Volo getVolo() {
		return volo;
	}
	
	public void setVolo(Volo volo) {
		this.volo = volo;
	}
	
}
