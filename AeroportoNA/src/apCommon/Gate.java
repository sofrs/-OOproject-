package apCommon;

public class Gate {
	
	//Attributi
	private String numeroGate;
	private String terminale;
	private Coda coda;
	
	//Costruttore vuoto
	public Gate() {

	}

	//Metodi
	public String getNumeroGate() {
		return numeroGate;
	}

	public void setNumeroGate(String numeroGate) {
		this.numeroGate = numeroGate;
	}

	public String getTerminale() {
		return terminale;
	}

	public void setTerminale(String terminale) {
		this.terminale = terminale;
	}

	public Coda getCoda() {
		return coda;
	}

	public void setCoda(Coda coda) {
		this.coda = coda;
	}
	
	
}
