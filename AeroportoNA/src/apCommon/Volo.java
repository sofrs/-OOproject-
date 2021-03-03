package apCommon;

import java.sql.Time;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.GregorianCalendar;

public class Volo {
	
	//Attributi
	private String orarioPartenza;
	private String orarioArrivo;
	private String dataPartenza;
	private String dataArrivo;
	private String IDVolo;
	private int numPrenotazioni;
	private Aereo aereo;
	private Gate gate;
	
	//Costruttori
	public Volo(){
		Time orarioArrivo = new Time(0);
		Calendar dataPartenza = new GregorianCalendar(2021,1,1);
		Calendar dataArrivo = new GregorianCalendar(2021,1,1);
		int numPrenotazioni  = 0;
		Aereo aereo = new Aereo();
		Gate gate = new Gate();
	}

	//DA RIFARE!
	public Volo(Time orarioArrivo, Calendar dataPartenza, Calendar dataArrivo,int numPrenotazioni, Aereo aereo, Gate gate){
			//this.orarioArrivo=orarioArrivo;
			//this.dataPartenza=dataPartenza;
			//this.dataArrivo=dataArrivo;
			//this.numPrenotazioni=numPrenotazioni;
			//this.aereo=aereo;
			//this.gate=gate;
	}
	
	/**Metodo che permette di rischedulare un volo attraverso la modifica dell'aereo, del'orario e della data della partenza/arrivo
	 * @param orarioPartenza
	 * @param orarioArrivo
	 * @param dataPartenza
	 * @param dataArrivo
	 */
	public void rischedula(Time orarioArrivo, Calendar dataPartenza, Calendar dataArrivo) {
		//this.orarioArrivo=orarioArrivo;
		//this.dataPartenza=dataPartenza;
		//this.dataArrivo=dataArrivo;
	}

	/**public Time getOrarioArrivo() {
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
	}**/

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

	public Aereo getAereo() {
		return aereo;
	}

	public void setAereo(Aereo aereo) {
		this.aereo = aereo;
	}

	public Gate getGate() {
		return gate;
	}

	public void setGate(Gate gate) {
		this.gate = gate;
	}

	

	
	
}
