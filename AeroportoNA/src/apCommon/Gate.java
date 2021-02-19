package apCommon;

public class Gate {
	
	//Attributi
	private int numeroGate;
	private int terminale;
	private Coda coda;
	
	//Costruttore
	public Gate() {
		int numeroGate=1;
		int terminale=1;
		Coda coda = new Coda();
	}

	//Metodi
	public int getNumeroGate() {
		return numeroGate;
	}

	public void setNumeroGate(int numeroGate) {
		this.numeroGate = numeroGate;
	}

	public int getTerminale() {
		return terminale;
	}

	public void setTerminale(int terminale) {
		this.terminale = terminale;
	}	
}
