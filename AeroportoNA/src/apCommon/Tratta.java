package apCommon;

import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tratta {
	
	//Attributi
	private Time orarioPartenza;
	private Time orarioArrivo;
	private Calendar dataPartenza;
	private Calendar dataArrivo;
	private String città;
	private String IDVolo;
	private int numPrenotazioni;
	private Aereo aereo;
	private Gate gate;
	
	
	//Costruttore
	public Tratta(){
		Time orarioPartenza = new Time(0);
		Time orarioArrivo = new Time(0);
		Calendar dataPartenza = new GregorianCalendar(2021,1,1);
		Calendar dataArrivo = new GregorianCalendar(2021,1,1);
		String città = "città";
		int numPrenotazioni  = 0;
		Aereo aereo = new Aereo();
		Gate gate = new Gate();
	}
	
	
	/**Metodo che permette di rischedulare un volo attraverso la modifica dell'aereo, del'orario e della data della partenza/arrivo
	 * @param orarioPartenza
	 * @param orarioArrivo
	 * @param dataPartenza
	 * @param dataArrivo
	 */
	public void rischedula(Time orarioPartenza, Time orarioArrivo, Calendar dataPartenza, Calendar dataArrivo) {
		this.orarioPartenza=orarioPartenza;
		this.orarioArrivo=orarioArrivo;
		this.dataPartenza=dataPartenza;
		this.dataArrivo=dataArrivo;
	}

	public Time getOrarioPartenza() {
		return orarioPartenza;
	}

	public void setOrarioPartenza(Time orarioPartenza) {
		this.orarioPartenza = orarioPartenza;
	}

	public Time getOrarioArrivo() {
		return orarioArrivo;
	}

	public void setOrarioArrivo(Time orarioArrivo) {
		this.orarioArrivo = orarioArrivo;
	}

	public Calendar getDataPartenza() {
		return dataPartenza;
	}

	public void setDataPartenza(Calendar dataPartenza) {
		this.dataPartenza = dataPartenza;
	}

	public Calendar getDataArrivo() {
		return dataArrivo;
	}

	public void setDataArrivo(Calendar dataArrivo) {
		this.dataArrivo = dataArrivo;
	}

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città = città;
	}

	public String getIDVolo() {
		return IDVolo;
	}

	public void setIDVolo(String iDVolo) {
		IDVolo = iDVolo;
	}

	public int getNumPrenotazioni() {
		return numPrenotazioni;
	}

	public void setNumPrenotazioni(int numPrenotazioni) {
		this.numPrenotazioni = numPrenotazioni;
	}

	public String getAereoModello() {
		return aereo.getModello();
	}

	public void setAereo(String IDAereo, String Modello, String nomeCompagnia, String callCenter, String website) {
		aereo.setIDAereo(IDAereo);
		aereo.setModello(Modello);
		aereo.setCompagnia(nomeCompagnia, callCenter, website);
	}

	public Gate getGate() {
		return gate;
	}

	public void setGate(Gate gate) {
		this.gate = gate;
	}
	
}
