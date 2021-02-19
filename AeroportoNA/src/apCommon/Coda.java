package apCommon;

public class Coda {
	
	//Attributi
	protected int tempoImbarcoStimato;
	protected int tempoImbarcoEffettivo;
	
	//Costruttore
	public Coda() {
		int tempoImbarcoStimato = 10;
		int tempoImbarcoEffettivo = 10;
	}
	
	//Metodi
	public int getTempoImbarcoStimato() {
		return tempoImbarcoStimato;
	}
	
	public void setTempoImbarcoStimato(int tempoImbarcoStimato) {
		this.tempoImbarcoStimato = tempoImbarcoStimato;
	}
	
	public int getTempoImbarcoEffettivo() {
		return tempoImbarcoEffettivo;
	}
	
	public void setTempoImbarcoEffettivo(int tempoImbarcoEffettivo) {
		this.tempoImbarcoEffettivo = tempoImbarcoEffettivo;
	}
	
	
}
