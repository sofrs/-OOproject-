package apCommon;


public class CodaDisabili extends Coda {
	
	//metodi
	@Override public int getTempoImbarcoStimato() {
		return tempoImbarcoStimato;
	}
	
	@Override public void setTempoImbarcoStimato(int tempoImbarcoStimato) {
		this.tempoImbarcoStimato = tempoImbarcoStimato;
	}
	
	@Override public int getTempoImbarcoEffettivo() {
		return tempoImbarcoEffettivo;
	}
	
	@Override public void setTempoImbarcoEffettivo(int tempoImbarcoEffettivo) {
		this.tempoImbarcoEffettivo = tempoImbarcoEffettivo;
	}

}