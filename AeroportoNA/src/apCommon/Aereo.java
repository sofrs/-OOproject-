package apCommon;

import apViews.AMain.IDAereo;
import apViews.AMain.Modello;

public class Aereo {
	
	//Attributi
	IDAereo IDaereo;
	Modello modello;
	private Compagnia compagnia;
	
	//Costruttore vuoto
	public Aereo(){
		
	}

	//Costruttore con parametri
	public Aereo(IDAereo IDaereo, Modello modello, Compagnia compagnia) {
		this.IDaereo = IDaereo;
		this.modello = modello;
		this.compagnia = compagnia;
	}

	//Metodi
	public IDAereo getIDaereo() {
		return IDaereo;
	}

	public void setIDaereo(IDAereo iDaereo) {
		IDaereo = iDaereo;
	}

	public Modello getModello() {
		return modello;
	}

	public void setModello(Modello modello) {
		this.modello = modello;
	}

	public Compagnia getCompagnia() {
		return compagnia;
	}

	public void setCompagnia(Compagnia compagnia) {
		this.compagnia = compagnia;
	}
	
}
