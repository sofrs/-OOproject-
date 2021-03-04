package apCommon;

import apViews.AMain.IDTratta;
import apViews.AMain.città;

public class Tratta {
	
	//Attributi
	private Volo volo;
	private città città;
	private IDTratta IDtratta;
	
	//Costruttore vuoto
	public Tratta() {
	}
	
	//Costruttore con attributi
	public Tratta(Volo volo, città città, IDTratta IDtratta) {
		this.volo=volo;
		this.città=città;
		this.IDtratta = IDtratta;
	}
	
	//Metodi
	public Volo getVolo() {
		return volo;
	}

	public void setVolo(Volo volo) {
		this.volo = volo;
	}

	public città getCittà() {
		return città;
	}

	public void setCittà(città città) {
		this.città = città;
	}

	public IDTratta getIDtratta() {
		return IDtratta;
	}

	public void setIDtratta(IDTratta iDtratta) {
		IDtratta = iDtratta;
	}
	
}
